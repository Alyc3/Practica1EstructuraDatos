/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoreodeobjetos;

import java.io.Serializable;


/**
 *
 * @author Edison
 */
public class Empleado implements Serializable{
    private String nombres;
    private String apellidos;
    private Pago pago;
    private Experiencia experiencia;
    public int length;
    

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    


    @Override
    public String toString() {
        return  nombres  +" " +apellidos  ;
    }
    
    
    
}
