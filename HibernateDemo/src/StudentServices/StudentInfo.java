/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentServices;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import pojos.Student;

/**
 *
 * @author jennings
 */
public class StudentInfo {

    static Session session;
    static SessionFactory sessionFactory;

    public static SessionFactory buildSession() {

        Configuration config = new Configuration();
        config.configure();

        ServiceRegistry servReg = new ServiceRegistryBuilder().applySettings(config.getProperties()).build();

        sessionFactory = config.buildSessionFactory(servReg);

        return sessionFactory;
    }

    public static String addStudent() {

        Student student1 = new Student(001, "James", "Jennings");
        Student student2 = new Student(002, "Travis", "Jennings");
        Student student3 = new Student(003, "Emery", "Lara");
        Student student4 = new Student(004, "Sher", "Jennings");

        try {
            session = buildSession().openSession();

            session.beginTransaction();
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.save(student4);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("error: " + e.getMessage());
        }
        return "Students added";
    }

    public static String getStudent() {

        try {
            Session std = buildSession().openSession();

            Student st = (Student) std.load(Student.class, 1);

            System.out.println(st.getIdStudent() + "," + st.getFirstName() + "," + st.getLastName());
            System.out.println("");

            //Get all sudents using HQL
            String HQL = "from Student";
            Query q = std.createQuery(HQL);

            List<Student> list = q.list();

            for (Student stu : list) {
                System.out.println(stu.getIdStudent() + "," + stu.getFirstName() + "," + stu.getLastName());
            }

        } catch (HibernateException e) {
            System.out.println("error: " + e.getMessage());
        }

        return "Student info retrieved";
    }
}
