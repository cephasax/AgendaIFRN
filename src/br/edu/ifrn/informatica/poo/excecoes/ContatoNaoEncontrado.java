package br.edu.ifrn.informatica.poo.excecoes;

public class ContatoNaoEncontrado extends Exception{

    public ContatoNaoEncontrado() {
        super("Contato não encontrado!");
    }

    public ContatoNaoEncontrado(String message) {
        super(message);
    }
    
}
