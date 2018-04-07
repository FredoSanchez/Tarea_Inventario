/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Fredy Sánchez
 */
public class Administrador {
    private String userName, nombreUsuario, password;
    
    public Administrador(){}
    
    public Administrador(String userName, String nombreUsuario, String password){
        this.userName=userName;
        this.nombreUsuario=nombreUsuario;
        this.password=password;
    }
    
    public void setUserName(String userName){
        this.userName= userName;
    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public String getPassword(){
        return password;
    }
}
