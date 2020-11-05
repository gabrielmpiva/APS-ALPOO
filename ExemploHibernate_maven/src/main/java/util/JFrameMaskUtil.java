package util;

import enums.FieldType;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.swing.*;
import java.awt.event.*;

public class JFrameMaskUtil {

    public static void customFormat(JTextField field,String startValue, FieldType fieldType, int maxLength) {
        field.setText(startValue);

        field.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (startValue != null && startValue.length() > 0){
                    if ( field.getCaret().getDot() < startValue.length()) {
                        field.setText("");
                        field.setText(startValue);
                    }
                }

                if (FieldType.INTEGER == fieldType) {
                    c = notDecimal(e);
                }

                if (FieldType.POSITIVE_INTEGER == fieldType || FieldType.ANY_POSITIVE_NUMBER == fieldType) {
                    c = notNegative(e);
                }

                if ( maxLength > 0) {
                    if (invalidLength(field, maxLength)){
                        e.consume();
                    }
                }

                if (FieldType.CURRENCY == fieldType) {
                    c = currency(field, e);
                }

                if (FieldType.LETTERS != fieldType && FieldType.LETTERS_NUMBERS != fieldType) {
                    init(field,e, c);
                }
            }
        });
    }

    public static void init(JTextField field, KeyEvent e, char c) {
        if (c != KeyEvent.VK_DELETE && c != KeyEvent.VK_BACK_SPACE) {
            int maxLength = (field.getText().length());

            if (c == '-' && validLastCharNumber(field) && !field.getText().contains("-")){
                float convertNegative = (Float.parseFloat(tratarString(field.getText())) * (-1));
                field.setText(tratarResultado(convertNegative));
            } else if (c == '-' && field.getText().contains("-")){
                field.setText(field.getText().substring(1, maxLength));
            }

            if (!((c >= '0') && (c <= '9') ||
                    (c == '.' && !field.getText().contains(".") && field.getText().length() > 0 && validLastCharNumber(field)))){
                e.consume();
            }
        } else {
            e.consume();
        }
    }

    private static boolean invalidLength(JTextField field,  int maxLength){
        return field.getText().length() > maxLength;
    }

    private static boolean validLastCharNumber(JTextField field){
        if (field.getText().length() > 0){
            char c = field.getText().split("")[field.getText().length() - 1].charAt(0);
            return Character.isDigit(c);
        }
        return false;
    }

    private static char notNegative(KeyEvent e){
        char c = e.getKeyChar();
        if (c == '-'){
            e.consume();
            return KeyEvent.VK_DELETE;
        }
        return c;
    }

    private static char currency(JTextField field, KeyEvent e){
        char c = e.getKeyChar();
        c = notNegative(e);
        int decimal = 999;
        if (field.getText().contains(".") && validLastCharNumber(field)){
            decimal = field.getText().split("\\.")[1].length();
            if (decimal < 2 && Character.isDigit(c)) {
                return c;
            } else {
                return KeyEvent.VK_DELETE;
            }
        }
        return c;
    }

    private static char notDecimal(KeyEvent e){
        char c = e.getKeyChar();
        if (c == '.'){
            e.consume();
            c = KeyEvent.VK_DELETE;
        }
        return KeyEvent.VK_DELETE;
    }

    public static String tratarString(final String string) {
        return string.replace(",",".");
    }

    public static String tratarResultado(final float resultado ) {
        String resultadoToString = String.valueOf(resultado);
        String[] decimal = resultadoToString.split("\\.");
        if (Integer.parseInt(decimal[1]) > 0){
            return String.format("%.2f",resultado);
        }
        return decimal[0];
    }
}

