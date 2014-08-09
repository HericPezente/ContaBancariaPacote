/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

/**
 *
 * @author i03
 */
public class TestaDeposita {
    
    public static void main(String[] args){
        Conta cp=new ContaPoupanca();
        
        try{
        cp.deposita(-100);
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
       
           //System.out.println("Você tentou depositar um valor invalido");
     //      System.out.println(e.getMessage());
       
            
       
    }
    
}
