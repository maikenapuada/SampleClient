/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
/**
 *
 * @author maiken
 */
public class UserModule implements Serializable {
    private String username;
    private String password;
    private int ID;
    
    public UserModule(String username, String password, int ID)
    {
        this.username= username;
        this.password=password;
        this.ID= ID;
    }
    
    public UserModule(String username, String password)
    {
        this.password=password;
    }
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getID(){
        return ID;
    }
}
