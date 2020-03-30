/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryapp;

/**
 *
 * @author ACER
 */
public class ModelTr {
    private String full_name;
    private String service;
    private String weight;
    private String total;
    private String cash;
    private String return_cash;
    
    public String subtotal = "0";
    
    public void setFullName (String full_name){
        this.full_name = full_name;
    }
    
    public String getFullName(){
        return full_name;
    }
   
    public void setService (String service){
        this.service = service;
    }
    
    public String getService(){
        return service;
    }
    
    public void setWeight (String weight){
        this.weight = weight;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void setTotal (String total){
        this.total = total;
    }
    
    public String getTotal(){
        return total;
    }
    
    public void setCash (String cash){
        this.cash = cash;
    }
    
    public String getCash(){
        return cash;
    }

    public void setReturnCash (String return_cash){
        this.return_cash = return_cash;
    }
    
    public String getReturnCash(){
        return return_cash;
    }

    
}


