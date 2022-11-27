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
public class Bono {
    private Double porcentajeSenior;
    private Double porcentajeVeterano;

    public Double getPorcentajeSenior() {
        return porcentajeSenior;
    }

    public void setPorcentajeSenior(Double porcentajeSenior) {
        this.porcentajeSenior = porcentajeSenior;
    }

    public Double getPorcentajeVeterano() {
        return porcentajeVeterano;
    }

    public void setPorcentajeVeterano(Double porcentajeVeterano) {
        this.porcentajeVeterano = porcentajeVeterano;
    }

    @Override
    public String toString() {
        return  "PorcentajeSenior = " + porcentajeSenior + 
                "\n PorcentajeVeterano=" + porcentajeVeterano ;
    }
    
    
}
