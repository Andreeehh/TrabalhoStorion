/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerarseresvivos;

/**
 *
 * @author andre
 */
public class Arvores extends SeresVivos {
    private int anoPlantio;
    private int numeroAneis;

    public Arvores(int anoPlantio, int numeroAneis, String nome, int idade) {
        super(nome, idade);
        this.anoPlantio = anoPlantio;
        this.numeroAneis = numeroAneis;
    }

    public int getAnoPlantio() {
        return anoPlantio;
    }

    public void setAnoPlantio(int anoPlantio) {
        this.anoPlantio = anoPlantio;
    }

    public int getNumeroAneis() {
        return numeroAneis;
    }

    public void setNumeroAneis(int numeroAneis) {
        this.numeroAneis = numeroAneis;
    }

    @Override
    public String toString() {
        return "Arvores{" + "anoPlantio=" + anoPlantio + ", numeroAneis=" + numeroAneis + '}'+ super.toString();
    }
    @Override
    public void gerarIdade(int anoAtual){
        setIdade(anoAtual - getAnoPlantio());
        setNumeroAneis(getIdade());
    };
}
