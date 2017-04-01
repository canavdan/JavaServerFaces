/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Nemesis
 */
@ManagedBean
@ApplicationScoped
public class HelloBeanForApplicationScoped {
 
    public HelloBeanForApplicationScoped() {
    }
    public int commitTimes =0;
    private String name;

    public String doSomething(){
        commitTimes++;
        return "welcomeForApplicationScoped.xhtml";
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
