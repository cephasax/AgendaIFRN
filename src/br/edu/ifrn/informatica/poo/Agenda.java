package br.edu.ifrn.informatica.poo;

import br.edu.ifrn.informatica.poo.excecoes.ContatoNaoEncontrado;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }
    
    public void inserirContato(Contato c){
        contatos.add(c);
    }
    public boolean removerContato(Contato c){
        return contatos.remove(c);
    }
    public Contato removerContatoPorIndice(int id){
        return contatos.remove(id);
    }
    public Contato buscarContatoPorCPF(String CPF) throws ContatoNaoEncontrado{
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getCPF().equalsIgnoreCase(CPF))
                return contatos.get(i);
        }
        throw new ContatoNaoEncontrado();
    }
    
    public Contato buscarContatoPorEmail(String email) throws ContatoNaoEncontrado{
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getEmail().equalsIgnoreCase(email))
                return contatos.get(i);
        }
        throw new ContatoNaoEncontrado();
    }
    public List<Contato> buscarContatoPorNome(String nome){
        List<Contato> lista = new ArrayList<Contato>();
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().contains(nome))
                lista.add(contatos.get(i));
        }
        return lista;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
    
    public void setContatos(ArrayList<Contato> contatos){
        this.contatos = new ArrayList<Contato>(contatos);
    }
}
