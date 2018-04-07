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
public class Proveedor {
    private String nombre, empresa, numTel;
    
    public Proveedor(){}
    
    public Proveedor(String nombre, String empresa, String numTel){
        this.nombre=nombre;
        this.empresa=empresa;
        this.numTel=numTel;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    
    public void setNumTel(String numTel){
        this.numTel=numTel;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    public String getNumTel(){
        return numTel;
    }
}
