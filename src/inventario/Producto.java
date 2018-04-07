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
public class Producto {

    private String nombre;
    private int cantidad;
    private float precio;
    
    public Producto(){}
    
    public Producto(String nombre, int cantidad, float precio){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public float getPrecio(){
        return precio;
    }

}
