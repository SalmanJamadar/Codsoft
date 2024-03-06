package atm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.BankAccount;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(BankAccount.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            BankAccount bankAccount = new BankAccount(); 
            session.save(bankAccount);
            session.getTransaction().commit();

            ATM atm = new ATM(bankAccount);
            atm.start();
        } finally {
            factory.close();
        }
    }
}