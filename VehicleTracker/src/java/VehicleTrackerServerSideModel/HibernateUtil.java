package VehicleTrackerServerSideModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author jennings
 */
public class HibernateUtil {

     static SessionFactory sessionFactory;

    public static SessionFactory buildSession() {

        Configuration config = new Configuration();
        config.configure();

        ServiceRegistry servReg = new ServiceRegistryBuilder().applySettings(config.getProperties()).build();

        sessionFactory = config.buildSessionFactory(servReg);

        return sessionFactory;
    }
    
}
