/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenderecos;

/**
 *
 * @author andre
 */
class Endereco {
    private String rua; 
    private String numero;
    private String cidade;

    public Endereco(String rua, String numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

public String getRua() { 
    return rua;
} 
public void setRua(String rua) { 
    this.rua = rua;
}
public String getNumero() {
return numero;
}
public void setNumero(String numero) {
this.numero = numero;
}
public String getCidade() {
return cidade;
}
public void setCidade(String cidade) {
this.cidade = cidade;
} 
public String toString(){ 
    return ": " + rua +"\t"+ numero +"\t"+ cidade;
}
}