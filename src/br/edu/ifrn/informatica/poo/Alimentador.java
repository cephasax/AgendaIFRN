/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.informatica.poo;

import java.util.ArrayList;

/**
 *
 * 
 */
public class Alimentador {
    public static ArrayList<Contato> criarContatos(){
        Contato c1 = new Contato();
        c1.setCPF("04352134567");
        c1.setNome("Jose manoel");
        c1.setEmail("jose@gmail.com");
        c1.setTelefone("98888-0001");
        
        Contato c2 = new Contato();
        c2.setCPF("04352134545");
        c2.setNome("Jose ricardo");
        c2.setEmail("ricardo@gmail.com");
        c2.setTelefone("98888-0002");
        
        Contato c3 = new Contato();
        c3.setCPF("04352134523");
        c3.setNome("Jose chico");
        c3.setEmail("chico@gmail.com");
        c3.setTelefone("98888-0003");
        
        Contato c4 = new Contato();
        c4.setCPF("04352135677");
        c4.setNome("Manel da goma");
        c4.setEmail("man@gmail.com");
        c4.setTelefone("98888-0004");
        
        Contato c5 = new Contato();
        c5.setCPF("04352130000");
        c5.setNome("Francisco toscano");
        c5.setEmail("fran@gmail.com");
        c5.setTelefone("98888-0005");
        
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(c4);
        contatos.add(c5);
        
        return contatos;
    }
}
