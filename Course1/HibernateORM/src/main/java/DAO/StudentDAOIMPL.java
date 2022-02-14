package DAO;
import Module.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.hibernateUtil;

public class StudentDAOIMPL {
    public boolean studentImpl(Student std){
        try{
            Session sObj = hibernateUtil.getSfObj().openSession();
            Transaction tObj = sObj.beginTransaction();
            sObj.save(std);
            tObj.commit();
            return  true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
