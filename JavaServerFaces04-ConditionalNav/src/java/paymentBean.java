/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="a")
@RequestScoped
public class paymentBean implements Serializable{

    public paymentBean() {
    }
    private static final long serialVersionUID = 1L;
    
    private boolean onay=true;
    private int money=50;

    public boolean isOnay() {
        return onay;
    }

    public void setOnay(boolean onay) {
        this.onay = onay;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public String openOrder(){
        return "order";
    }
    public String openPayment(){
        money=this.getMoney();
        return "payment";
    }
    public String openProducts(){
        return "products";
    }
    public String openRegister(){
        return "register";
    }
}
