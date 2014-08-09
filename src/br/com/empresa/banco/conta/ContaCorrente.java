/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco.conta;

import contabancaria.Cliente;
import contabancaria.TipoCliente;
import contabancaria.Tributavel;

/**
 *
 * @author i03
 */
public class ContaCorrente extends Conta implements Tributavel{ //ContaCorrente é uma classe concreta.
    
    private Cliente cliente;
    
    public ContaCorrente(){
    }  
    
    public ContaCorrente(Cliente cliente){
        this.cliente=cliente;
    };
    
    
    public void atualiza(double taxa){
        if(cliente != null){
            if(cliente.getTipoCliente() == TipoCliente.UNIVERSITARIO){
                this.saldo += this.saldo * taxa * TipoCliente.UNIVERSITARIO.getMultiplicador();
            }else 
                if(cliente.getTipoCliente() == TipoCliente.CORPORATIVO){
                    this.saldo += this.saldo * taxa * TipoCliente.CORPORATIVO.getMultiplicador();
                }
                else 
                   if (cliente.getTipoCliente() == TipoCliente.EXCLUSIVO){
                       this.saldo += this.saldo * taxa * TipoCliente.EXCLUSIVO.getMultiplicador();
                   }
        }
        else 
           this.saldo += this.saldo * taxa * 2;
    };

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void deposita(double conta){
        if(conta < 0){
            throw new IllegalArgumentException("Você tentou lançar um valor negativo na Conta Corrente.");
        }else{
            this.saldo += conta - VALOR_DESCONTO_DEPOSITO;
        }
        
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    
    

}
