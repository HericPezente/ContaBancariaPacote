/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.banco.conta;



/**
 *
 * @author i03
 */


        
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
    
   

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * VALOR_PADRAO_MULTIPLICACAO;
    }
    
    
    
     // public void atualiza(double taxa){ this.saldo += this.saldo * taxa * 3; }

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
    @Override
    public int compareTo(ContaPoupanca o) {
    if(this.getNumero() < o.getNumero()){
    return -1;
    }
    if(this.getNumero() > o.getNumero()){ 
    return 1;
    }
    return 0;
    }
     */
    @Override
    public int compareTo(ContaPoupanca o) {
        return this.getNumero() - o.getNumero();
    }
 
    
    
     
    

}
