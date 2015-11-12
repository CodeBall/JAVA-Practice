/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financefamly;

/**
 *
 * @author xqq
 */
public class Users {
    private String user_Name;
    private String user_Password;
    private int status;

    /**
     * @return the user_Name
     */
    public Users(){
        this.user_Name = "admin";
        this.user_Password = "123";
        this.status = 3;
    }
    public String getUser_Name() {
        return user_Name;
    }

    /**
     * @param user_Name the user_Name to set
     */
    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    /**
     * @return the user_Password
     */
    public String getUser_Password() {
        return user_Password;
    }

    /**
     * @param user_Password the user_Password to set
     */
    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    public int checkUsers(String Name,String Password){
        if(Name.equals(this.user_Name) && Password.equals(this.user_Password)){
            this.status = 0;
        }
        else if(Name != this.user_Name){
            this.status = 1;
        }
        else if(Password != this.user_Password){
            this.status = 2;
        }
        else
            this.status = 3;
        return this.status;
    }
    
}
