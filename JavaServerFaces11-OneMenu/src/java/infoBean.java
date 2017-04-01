/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedHashMap;
import java.util.Map;
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
    public String favCoffee1 = "Extreme Mocha";
    public String favCoffee2;
    public String favCoffee3;

    public String getFavCoffee1() {
        return favCoffee1;
    }

    public void setFavCoffee1(String favCoffee1) {
        this.favCoffee1 = favCoffee1;
    }

    public String getFavCoffee2() {
        return favCoffee2;
    }

    public void setFavCoffee2(String favCoffee2) {
        this.favCoffee2 = favCoffee2;
    }

    public String getFavCoffee3() {
        return favCoffee3;
    }

    public void setFavCoffee3(String favCoffee3) {
        this.favCoffee3 = favCoffee3;
    }

    //By map
    public static Map<String, Object> coffee3;

    static {
        coffee3 = new LinkedHashMap<String, Object>();
        coffee3.put("C2-Mocha", "Mocha");
        coffee3.put("C2-Latte", "Latte");
        coffee3.put("C2-Americano", "Americano");
    }

    public Map<String,Object> getCoffee3() {
        return coffee3;
    }

    public String[] getCoffee2() {
        String coffee2[];
        coffee2 = new String[3];

        coffee2[0] = "C1-Mocha";
        coffee2[1] = "C1-Latte";
        coffee2[2] = "C1-Americano";
        return coffee2;
    }

}
