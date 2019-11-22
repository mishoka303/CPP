package pg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSystem
{

    public static void main(String[] args)
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        create(session);

        session.close();
    }

    private static void create(Session session)
    {
        Roles a = new Roles();
        a.set_id(3);
        a.set_name("alolo");

        session.beginTransaction();
        session.save(a);
        session.getTransaction().commit();
    }
}