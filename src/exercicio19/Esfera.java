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
public class Esfera implements ObjetoTridimensional {
    
    private double raio;
    private Ponto3D centro;
    
    @Override
    public Ponto3D centro(){
        try{
            return this.centro.clonar();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public double calculaSuperficie(){
        return 4 * Math.pow(this.raio, 2);
    }
    
    @Override
    public double calculaVolume(){
        return 4/3 * Math.pow(this.raio, 3);
    }
}
