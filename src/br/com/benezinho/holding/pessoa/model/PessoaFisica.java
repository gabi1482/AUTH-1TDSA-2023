package br.com.benezinho.holding.pessoa.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {
    private String CPF;

    private Collection<PessoaFisica> filhos = new Vector<>();






    public PessoaFisica addFilho(PessoaFisica filho){
        this.filhos.add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho){
        this.filhos.remove(filho);
        return this;
    }

    public Collection<PessoaFisica> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }



    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome, LocalDate nascimento, String CPF, Collection<PessoaFisica> filhos) {
        super(id, nome, nascimento);
        this.CPF = CPF;
        this.filhos = filhos;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}
