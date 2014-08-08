/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

/**
 *
 * @author Munique
 */
public class ValorInvalidoException extends RuntimeException {
    
    public ValorInvalidoException(String exception){
        super(exception);
    }
    
    public ValorInvalidoException(double valor){
        super("Valor Invalido:"+valor);
    }
    
}
