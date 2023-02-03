package br.com.a2dm.brcmn.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil
{
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	static
	{
		try
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			
			serviceRegistry =  new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable ex)
		{

			System.err.println("Initial SessionFactory creation failed." + ex);

			sessionFactory = null;

			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession()
	{
		return sessionFactory.openSession();
	}
}
