package infoP;
// Generated Jan 24, 2017 5:08:32 PM by Hibernate Tools 4.3.1



/**
 * Schools generated by hbm2java
 */
public class Schools  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String info;
     private String city;

    public Schools() {
    }

	
    public Schools(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Schools(String name, String info, String city) {
       this.name = name;
       this.info = info;
       this.city = city;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }




}

