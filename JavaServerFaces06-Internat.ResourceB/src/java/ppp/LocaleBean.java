package ppp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name = "lang")
@SessionScoped
public class LocaleBean {

    private String situation;
    private Map<String, Object> countryMap;

    public LocaleBean() {       
        countryMap = new LinkedHashMap<String,Object>();
        countryMap.put("Turkish",new Locale("tr","TR"));
        countryMap.put("English",new Locale("en","ENG"));
        countryMap.put("русский",new Locale("ru","RU"));       
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Map<String, Object> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, Object> countryMap) {
        this.countryMap = countryMap;
    }
    public void control(ValueChangeEvent e){
        String localeStr=e.getNewValue().toString();
        for(Map.Entry<String,Object> entry:countryMap.entrySet()){
            if(entry.getValue().toString().equals(localeStr)){
                Locale locale=(Locale) entry.getValue();
                FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
            }
            
        }
        
    }
}
