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
@ManagedBean(name = "b")
@RequestScoped
public class infoBean {

    public infoBean() {
    }
    public String favColor1;
    public String favColor2;
    public String favColor3;

    public String getFavColor1() {
        return favColor1;
    }

    public void setFavColor1(String favColor1) {
        this.favColor1 = favColor1;
    }

    public String getFavColor2() {
        return favColor2;
    }

    public void setFavColor2(String favColor2) {
        this.favColor2 = favColor2;
    }

    public String getFavColor3() {
        return favColor3;
    }

    public void setFavColor3(String favColor3) {
        this.favColor3 = favColor3;
    }

    private static Map<String, Object> color2value;

    static {
        color2value = new LinkedHashMap<String, Object>();
        color2value.put("Color2-Red", "Red");
        color2value.put("Color2-Blue", "Blue");
        color2value.put("Color2-Green", "Green");
    }

    public Map<String, Object> getFavColor2Value() {
        return color2value;
    }

    public String[] getFavColor3Value() {

        String color3value[];
        color3value = new String[3];
        color3value[0]="Color3-Red";
        color3value[1]="Color3-Blue";
        color3value[2]="Color3-Green";
            return color3value;
    }
}
