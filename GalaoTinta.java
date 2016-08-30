/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricacasacachorro;

public class GalaoTinta {

    MedidasCasa medidasCasa = new MedidasCasa();

    int codGalaoTinta;
    double rendimento;
    double valorTinta;
    double volumeGalao;
    String cor;

//retorna a quantidade de galoes necessários
    public double quantGaloes() {
        return medidasCasa.calcularMedidaTotal() / rendimento * 2;        //2 demaos
    }

    public int calcularRendimento() {
        return 0;
    }

    public double tintaTotalUtilizada() {
        return (AreaTotal / rendimento) * volumeGalao;
    }

    public double quantidadeGaloes() {
        return ((volumeGalao / rendimento) * AreaTota) / volumeGalao;
    }

}
