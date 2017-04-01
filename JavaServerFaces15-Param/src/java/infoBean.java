/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name="user")
@RequestScoped
public class infoBean {

  
    public infoBean() {
    }
    public String name,country;

    public String outcome(){
		
		FacesContext fc = FacesContext.getCurrentInstance();
		this.country = getCountryParam(fc);
		
		return "page2.xhtml";
	}
	//get value from "f:param"
	public String getCountryParam(FacesContext fc){		
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		return params.get("country");		
	}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
