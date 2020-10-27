package dao;

import model.Departamento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfiguracao {

    private static SessionFactory sessionFactory;

    public HibernateConfiguracao() {
    }

    public Session openSession() {
        if (sessionFactory == null) {
            criaSessionFactory();
        }
        return sessionFactory.openSession();
    }

    private void criaSessionFactory() {

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Departamento.class);
        configuration
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL82Dialect")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/aula_3")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "r4f40311")
                .setProperty("hibernate.show_sql", "false")
                .setProperty("hibernate.format_sql", "false");

        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
}
