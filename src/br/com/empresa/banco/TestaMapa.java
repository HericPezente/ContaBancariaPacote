
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import java.util.HashMap;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TestaMapa {
    public static void main(String[] args){
        Conta c1= new ContaCorrente();
        c1.deposita(10000);
        
        Conta c2= new ContaCorrente();
        c2.deposita(3000);
        
        //cria o mapa
        //Map mapaDeContas= new HashMap();
        Map<String,Conta> mapaDeContas= new HashMap<String,Conta>();
        
        //adiciona duas chaves ao seus valores
        mapaDeContas.put("diretor",c1);
        mapaDeContas.put("gerente",c2);
        
        //qual a conta do diretor?
        //Conta contaDoDiretor= (Conta) mapaDeContas.get("diretor");
        Conta contaDoDiretor=  mapaDeContas.get("diretor");
        
        System.out.println("Conta do Diretor:"+contaDoDiretor.getSaldo());
        
    }
}
