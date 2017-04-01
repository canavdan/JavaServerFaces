/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name="b")
@RequestScoped
public class infoBean {

    /**
     * Creates a new instance of infoBean
     */
    public infoBean() {
    }
    private static final Employeer[] emp=new Employeer[]  {
      new Employeer("300","Can","Avdan",28,new BigDecimal("1900.00")),
      new Employeer("301","John","Locke",28,new BigDecimal("2910.00")),
      new Employeer("302","Jack","Shep",28,new BigDecimal("12312.55")),
      new Employeer("303","Anna","Till",28,new BigDecimal("435345.43"))      
    };
    
    public Employeer[] getEmployeer(){
        return emp;
    }
}
