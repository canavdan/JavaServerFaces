package infoP;
// Generated Jan 26, 2017 1:53:48 PM by Hibernate Tools 4.3.1



/**
 * Teacher generated by hbm2java
 */
public class Teacher  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String surname;
     private String degree;

    public Teacher() {
    }

	
    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Teacher(String name, String surname, String degree) {
       this.name = name;
       this.surname = surname;
       this.degree = degree;
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
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDegree() {
        return this.degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }




}


