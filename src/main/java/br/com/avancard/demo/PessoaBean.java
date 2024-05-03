package br.com.avancard.demo;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import javax.xml.namespace.QName;
import java.io.Serializable;

@Named
@ViewScoped

public class PessoaBean implements Serializable {

    private String nome = "img.net";
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
