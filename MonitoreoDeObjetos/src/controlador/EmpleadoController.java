/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import monitoreodeobjetos.Empleado;
import monitoreodeobjetos.Pago;

/**
 *
 * @author Edison
 */
public class EmpleadoController {
    Empleado[] empleados;
    Pago pago;
    Empleado empleado;

    public Pago getPago() {
        if (pago == null) {
            pago = new Pago();
        }
        return this.pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    

    public Empleado getEmpleado() {
        if(empleado == null)
            empleado = new Empleado();
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    

}
