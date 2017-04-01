/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import infoP.DataGet;
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
     
     
          
             public String name,info,city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
       public  List<Schools> getSchools(){
           DataGet dataget=new DataGet();
                 return dataget.getAllUsers();
             }
             public void deleteSchools(int id){
                 DataGet dataget=new DataGet();
                 dataget.deleteUser(id);
             }
             public void addSchools(){
                 DataGet dataget=new DataGet();
                 Schools addSc=new Schools(this.name,this.info,this.city);
                 dataget.addSchool(addSc);
             }
             
}
