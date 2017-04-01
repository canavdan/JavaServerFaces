/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import infoP.Schools;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name = "b")
@SessionScoped
public class infoBean {

    public infoBean() {
    }
    public List<Schools>  getSchools(){
        HibernateF h1=new HibernateF();
        return h1.getAllUsers();
        
    }
    
}
