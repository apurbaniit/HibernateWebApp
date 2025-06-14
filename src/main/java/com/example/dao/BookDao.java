package com.example.dao;

import com.example.entity.Book;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDao {

    public void saveBook(Book book) {

        Transaction transaction=null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        transaction= session.beginTransaction();
        session.save(book);
        transaction.commit();
        }
        catch (Exception e){
            if(transaction !=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }
}
