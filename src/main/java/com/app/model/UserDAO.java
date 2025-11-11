package com.app.model;

import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

    public static String save(User user)
        {
            Transaction transaction=null;

            try(Session session= HibernateUtil.openFactory().openSession())
            {
                transaction=session.beginTransaction();

                session.persist(user);

                transaction.commit();
            } catch (Exception e) {
                if(transaction!=null)
                {
                    transaction.rollback();
                }
            }

            return  "record inserted";
        }
}
