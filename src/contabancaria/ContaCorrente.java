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
public class ContaCorrente extends Conta implements Tributavel{ //ContaCorrente é uma classe concreta.
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    public void deposita(double conta){
        this.saldo += conta - ContaPoupanca.VALOR_DESCONTO_DEPOSITO;
        
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    
    

}
