package com.app.util;

import com.oracle.wls.shaded.org.apache.regexp.RE;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory=getSessionFactory();

    private static SessionFactory getSessionFactory() {

        try
        {
            if(sessionFactory == null)
                {
                    StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
                    MetadataSources sources=new MetadataSources(registry);
                    Metadata metadata=sources.getMetadataBuilder().build();
                    sessionFactory=metadata.getSessionFactoryBuilder().build();

                }

            return sessionFactory;

        } catch (Exception e) {
            throw new ExceptionInInitializerError(e.getMessage());
        }


    }
    public static SessionFactory openFactory()
        {
            return sessionFactory;
        }

    public static void shutDown()
        {
            sessionFactory.close();
        }

}
