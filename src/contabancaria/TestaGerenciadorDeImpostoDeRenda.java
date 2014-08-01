/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TestaGerenciadorDeImpostoDeRenda {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        GerenciadorDeImpostoDeRenda gerenciador=new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv=new SeguroDeVida();
        gerenciador.adiciona(sv);
        
        ContaCorrente cc=new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        
        System.out.println("Total Tributavel:"+gerenciador.getTotal());
    }
}
