package util;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class SessionFactoryConfiguration {
    
    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration(){

    }

    public static SessionFactoryConfiguration getInstance(){
        return  sessionFactoryConfiguration== null? 
        sessionFactoryConfiguration =new SessionFactoryConfiguration()
        :sessionFactoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
