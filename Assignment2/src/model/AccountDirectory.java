/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author chw
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;
    
    public AccountDirectory(){
        this.accounts = new ArrayList<Account>();
    }
    
    public ArrayList<Account> getAccounts(){
        return accounts;
    }
    
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public Account addAccount() {
        Account a = new Account();
        accounts.add(a);
        return a;
    }
    
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
    public Account SearchAccount(String name) {
        for (Account a : accounts) {
            // Check if either the first or last name contains the input name
            if (a.getLastName().contains(name) || a.getFirstName().contains(name)) {
                return a;
            }
        }
        return null;
    }


  
}


