/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleTrackerServerSideControl;

import VehicleTrackerServerSideModel.HibernateUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojos.User;

/**
 *
 * @author jennings
 */
public class Authentication {

    Session session = null;
    String url = "/adminMenu.html";
    String url2 = "/userMenu.html";
    String url3 = "/loginFail.html";
    String path;

    public String authenticate(String userName, String password) throws IOException, URISyntaxException, NullPointerException {

        this.session = HibernateUtil.buildSession().openSession();

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("userName", userName));

            User user = (User) criteria.uniqueResult();

            if(user!=null){
                
                String pwrd = user.getPassword();
                int admn = user.getAdmin();
                
                if (pwrd.equals(password) && admn == 1) {
                    path = url;
                } else if (pwrd.equals(password) && admn == 0) {
                    path = url2;
                } else {
                    path = url3;
                }
            }
            else{
                path = url3;
                return path;
            }
        } catch (HibernateException e) {
            System.out.println("error: " + e.getMessage());
        }

        return path;
    }
}
