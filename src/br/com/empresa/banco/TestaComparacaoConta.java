/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TestaComparacaoConta {
    public static void main(String[] args){
        
        ContaCorrente cc1= new ContaCorrente();
        cc1.setNumero(123456);
        
        ContaCorrente cc2= new ContaCorrente();
        cc2.setNumero(123456);
        
        if(cc1.equals(cc2)){
            System.out.println("cc1 tem mesmo valor de cc2");
        }
        else{
            System.out.println("cc1 não o mesmo valor de cc2");
        }
    }
}
