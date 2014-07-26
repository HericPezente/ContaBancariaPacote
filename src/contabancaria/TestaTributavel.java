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
public class TestaTributavel {

    public static void main(String[] args){
        ContaCorrente cc= new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        
        Tributavel t= cc;
        System.out.println(t.calculaTributos());
        
        //System.out.println(t.getSaldo()); gera um erro
    }
    
}
