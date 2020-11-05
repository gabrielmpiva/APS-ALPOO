package dao;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.IOException;
import java.util.Properties;

public class HibernateConfiguracao {

    private static SessionFactory sessionFactory;

    public HibernateConfiguracao() {}

    public Session openSession() {
        if (sessionFactory == null) {
            criaSessionFactory();
        }
        return sessionFactory.openSession();
    }

    private void criaSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Books.class);
            configuration.addAnnotatedClass(Authors.class);
            configuration.addAnnotatedClass(Publishers.class);
            Properties p = new Properties();

            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("src/hibernate.properties"));
            configuration.setProperties(p);

            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
