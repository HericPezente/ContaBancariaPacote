/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

/**
 *
 * @author i03
 */
public enum TipoCliente {
    
    UNIVERSITARIO(2),
    CORPORATIVO(3),
    EXCLUSIVO(4);

    private double multiplicador;

    private TipoCliente(double multiplicador) {
        this.multiplicador=multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    
    
    
    
    
    
    
    
    
    
}
