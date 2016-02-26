/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda.Observer;

/**
 *
 * @author Kleudson
 */
public class DadosObserver extends Observer {
    
    public DadosObserver (SujeitoAtualizar sujeito) {
        this.subject = sujeito;
        this.subject.addObserver((java.util.Observer) this);
    }
    
    @Override
    public void atualizarDados() {
        System.out.println("Atualizando Dados a Partir do Observer...");
    }
    
}
