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
public class Cilindro implements ObjetoTridimensional,Escalavel {
    private Ponto3D topo;
    private Ponto3D base;
    private double raio;
    
    @Override
    public Ponto3D centro(){
        double x = (this.topo.getX() + this.base.getX())/2;
        double y = (this.topo.getY() + this.base.getY())/2;
        double z = (this.topo.getZ() + this.base.getZ())/2;
        
        try{
            return new Ponto3D(x,y,z);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public double calculaSuperficie(){
        return this.topo.distancia(base) * 2 * Math.PI * this.raio + 2 * Math.PI * Math.pow(this.raio,2);
    }
    
    @Override
    public double calculaVolume(){
        return Math.PI * Math.pow(this.raio,2) * this.topo.distancia(base);
    }
    
    @Override
    public void espelha(){
        
    }
    
    @Override
    public void amplia(double escala){
        this.raio = this.raio * escala;
    }
}
