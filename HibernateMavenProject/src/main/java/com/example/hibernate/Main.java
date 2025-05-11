package com.example.hibernate;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Employee
        Employee emp1 = new Employee("John Doe", "john.doe@example.com");
        session.persist(emp1); // Use persist instead of save if using JPA

        transaction.commit();
        session.close();

        System.out.println("Employee saved successfully!");
    }
}
