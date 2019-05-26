/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

/**
 *
 * @author joao
 */
public class Paralelepipedo implements ObjetoTridimensional {

    private Ponto3D opostoSuperior;
    private Ponto3D opostoInferior;
    private Ponto3D centro;

    //Metodo construtor
    public Paralelepipedo(Ponto3D _opostoSuperior, Ponto3D _opostoInferior, Ponto3D _centro) {
        this.opostoSuperior = _opostoSuperior;
        this.opostoInferior = _opostoInferior;
        this.centro = _centro;
    }

    //Metodo que retorna o centro do paralelepipedo
    @Override
    public Ponto3D centro() {
        return centro;
    }

    //Metodo que calcula a area de superficie
    @Override
    public double calculaSuperficie() {
        return 2*(this.getLargura()*this.getProfundidade() + this.getProfundidade()*this.getAltura() + this.getLargura()*this.getAltura());
    }

    //Metodo que calcula o volume
    @Override
    public double calculaVolume() {
        return this.getLargura()*this.getProfundidade()*this.getAltura();
    }

    //Metodo toString
    @Override
    public String toString() {
        return centro + " - " + this.calculaVolume() + " - " + this.calculaSuperficie();
    }    
    
    public double getLargura(){
        return Ponto3D.distancia(opostoInferior.getX(), opostoInferior.getY(), opostoInferior.getZ(), opostoSuperior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
    }
    
    public double getProfundidade(){
        return Ponto3D.distancia(opostoSuperior.getX(), opostoInferior.getY(), opostoSuperior.getZ(), opostoInferior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
    }
    
    public double getAltura(){
        return Ponto3D.distancia(opostoSuperior.getX(), opostoSuperior.getY(), opostoSuperior.getZ(), opostoInferior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
    }
}   
