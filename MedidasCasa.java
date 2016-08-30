/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricacasacachorro;

/**
 *
 * @author Mileto
 */
public class MedidasCasa {

    private double alturaLateralEFrente;
    private double larguraLateral;    
    private double larguraFrente;

    public double calcularMedidaTotal() {
        double medidaTotal;
        medidaTotal = (calcularMedidaLateral() + calcularMedidaFrenteTraseira()) + (calcularTelhado() * 2);
        return medidaTotal;
    }

    public double calcularMedidaLateral() {
        double metroLateral;
        metroLateral = (this.alturaLateralEFrente * this.larguraLateral) * 2;
        return metroLateral;
    }

    public double calcularMedidaFrenteTraseira() {
        double metrosFrente;
        metrosFrente = (this.alturaLateralEFrente * this.larguraFrente) * 2;
        return metrosFrente;
    }

    public double calcularTelhado() {
        return 0;
    }

    public double getAlturaLateralEFrente() {
        return alturaLateralEFrente;
    }

    public void setAlturaLateralEFrente(double alturaLateralEFrente) {
        this.alturaLateralEFrente = alturaLateralEFrente;
    }

    public double getLarguraLateral() {
        return larguraLateral;
    }

    public void setLarguraLateral(double larguraLateral) {
        this.larguraLateral = larguraLateral;
    }

    public double getLarguraFrente() {
        return larguraFrente;
    }

    public void setLarguraFrente(double larguraFrente) {
        this.larguraFrente = larguraFrente;
    }

}
