/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

/**
 *
 * @author i03
 */
public class TestaContas {
    
    public static void main(String[] args){
        
        //Conta c=new Conta();

	//ContaCorrente cc=new ContaCorrente();

	ContaPoupanca cp=new ContaPoupanca();


	//c.deposita(1000);

        //cc.deposita(1000);
        
         
	cp.deposita(1000);
        
		

	
 	//System.out.println(c.getSaldo());

 	//System.out.println(cc.getSaldo());

 	System.out.println(cp.getSaldo());
 
 	System.out.println("----------------------");	

	//c.atualiza(0.01);

	//cc.atualiza(0.01);

	cp.atualiza(0.01);

 		//System.out.println(c.getSaldo());

 		//System.out.println(cc.getSaldo());

 		System.out.println(cp.getSaldo());
                
          
    Conta conta= new ContaCorrente();
    conta.deposita(100);
    System.out.println(conta);    
    }
    
    
    
    
}
