/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoreodeobjetos;

/**
 *
 * @author Edison
 */
public class Pago {
    private Double sueldo;
    private Experiencia experiencia;
    private Bono bono;

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Pago{" + "sueldo=" + sueldo + ", experiencia=" + experiencia + ", bono=" + bono + '}';
    }
    
    
    
    
}
