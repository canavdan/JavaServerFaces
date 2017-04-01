/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name="user")
@RequestScoped
public class infoBean {

    public infoBean() {
    }
    public String name;

     public void attrListener(ActionEvent event){
	//	 event.getC
		//name = (String)event.getComponent().getAttributes().get("username");
		
	}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String outcome(){
		return "results";
	}
   
    
}
