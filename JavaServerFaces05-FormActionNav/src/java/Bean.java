/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean(name="b")
@RequestScoped
public class Bean {

    public Bean() {
    }
    public String goPage(){
        return "go";
    }
    public String goPage2(){
        return "go";
    }
    public String goPage3(){
        return "go3";
    }
}
