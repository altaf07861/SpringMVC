package com.app.dao;

import com.app.model.User;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class UserDAO {



    public static String saveUser(User user)
        {
            Transaction transaction=null;

            try(Session session= HibernateUtil.openFactory().openSession())
            {
                transaction=session.beginTransaction();

                session.persist(user);

                transaction.commit();

                return "record inserted";

            } catch (Exception e) {
                if(transaction!=null)
                {
                    transaction.rollback();
                }
                return "failed to insert"+e.getMessage();
            }


        }
}
