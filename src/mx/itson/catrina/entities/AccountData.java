/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author USER
 */
public class AccountData {
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transaction> transactions;

    public AccountData deserealize(String json) {
    AccountData account = new AccountData();
    try{
        account = new Gson().fromJson(json, AccountData.class);
    }catch(Exception ex ){
        System.err.println("Ocurrio un error: "+ex.getMessage());
    }
    return account;
    }
    
    
    
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   

    
    
    
}
