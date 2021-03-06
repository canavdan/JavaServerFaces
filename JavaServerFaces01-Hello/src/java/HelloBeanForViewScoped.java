/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean
@ViewScoped
public class HelloBeanForViewScoped {

    /**
     * Creates a new instance of HelloBeanForViewScoped
     */
    public HelloBeanForViewScoped() {
    }
     public int commitTimes =0;
    private String name;

    public String toAnotherView(){
        commitTimes++;
        return "welcomeForViewScoped.xhtml";
    }

    public void stayInThisView(){
        commitTimes++;
    }

    public String toThisView(){
        commitTimes++;
        return "helloForViewScoped";
    }

    public int getCommitTimes() {
        return commitTimes;
    }

    public void setCommitTimes(int commitTimes) {
        this.commitTimes = commitTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
