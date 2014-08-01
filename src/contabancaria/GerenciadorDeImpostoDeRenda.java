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
public class GerenciadorDeImpostoDeRenda {

    Tributavel[] tributaveis = new Tributavel[10];
    int posicao;
    
    
    public GerenciadorDeImpostoDeRenda() {
        
    }

    public void adiciona(Tributavel tributavel) {
        tributaveis[posicao] = tributavel;
        posicao++;
    }
    
    public double getTotal(){
        double total=0;
        for(Tributavel t:tributaveis){
            System.out.println("loop");
            if(t != null){
                System.out.println("obj");
                total += t.calculaTributos();
            }
        }
        return total;
    }

}
