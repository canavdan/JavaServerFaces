/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
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
    public String[] lang1 = {"Java Web", "Java Mobile", "Java Database"};
    public String[] lang2;
    public String[] lang3;

    public String[] getLang1() {
        return lang1;
    }

    public void setLang1(String[] lang1) {
        this.lang1 = lang1;
    }

    public String[] getLang2() {
        return lang2;
    }

    public void setLang2(String[] lang2) {
        this.lang2 = lang2;
    }

    public String[] getLang3() {
        return lang3;
    }

    public void setLang3(String[] lang3) {
        this.lang3 = lang3;
    }
    public static Map<String, Object> lang3Val;

    static {
        lang3Val = new LinkedHashMap<String, Object>();
        lang3Val.put("JSF-JSP", "Java Web");
        lang3Val.put("Android-", "Java Mobile");
        lang3Val.put("Oracle", "Java Database");
    }

    public Map<String, Object> getLang3Valu() {
        return lang3Val;
    }

    public String[] getLang2Valu() {
        String lang2[];
        lang2 = new String[3];

        lang2[0] = "Java Web";
        lang2[1] = "Java Mobile";
        lang2[2] = "Java Database";
        return lang2;
    }

    public String getLang1Val() {
        return Arrays.toString(lang1);
    }

    public String getLang2Val() {
        return Arrays.toString(lang2);
    }

    public String getLang3Val() {
        return Arrays.toString(lang3);
    }

}
