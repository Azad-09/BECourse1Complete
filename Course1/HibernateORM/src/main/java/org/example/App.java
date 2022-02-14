package org.example;


import DAO.StudentDAOIMPL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import  Module.Student;
import util.hibernateUtil;

public class App
{
    private static Session seObj;
    private static SessionFactory sfObj;

    public static void main( String[] args )
    {
        sfObj = hibernateUtil.getSfObj();
        seObj = sfObj.openSession();
        StudentDAOIMPL stdObj = new StudentDAOIMPL();
        Student sObj = new Student();
        sObj.setStdName("Raja");
        sObj.setStdNumber("9556721421");
        sObj.setEmail("raja@gmail.com");
        stdObj.studentImpl(sObj);
        System.out.println("Inserted");
    }
}
