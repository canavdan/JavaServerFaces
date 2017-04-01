/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name="b")
@RequestScoped
public class infoBean {

    public infoBean() {
    }
     String number,name,surname;
    int age;
    BigDecimal wages;
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getWages() {
        return wages;
    }

    public void setWages(BigDecimal wages) {
        this.wages = wages;
    }
    
  
    private static final ArrayList<Employeer> emp=new ArrayList<Employeer>(Arrays.asList(
    new Employeer("300","Can","Avdan",28,new BigDecimal("1900.00")),
      new Employeer("301","John","Locke",28,new BigDecimal("2910.00")),
      new Employeer("302","Jack","Shep",28,new BigDecimal("12312.55")),
      new Employeer("303","Anna","Till",28,new BigDecimal("435345.43")))
    );
    
    public ArrayList<Employeer> getEmployeer(){
        return emp;
    }
    public String addRecord(){
        Employeer employeer=new Employeer(this.number,this.name,this.surname,this.age,this.wages);
        emp.add(employeer);
        return null;
    }
    public String deleteRecord(Employeer employe){
        emp.remove(employe);
        return null;
    }
    public String updateRecord(Employeer employe){
        employe.setUpdate(true);       
        return null;
    }
    public String saveRecord(){
        for(Employeer e : emp){
            e.setUpdate(false);
        }
            return null;
    }
}
