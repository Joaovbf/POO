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
public class Ponto3D extends Ponto{
    
    private double z;

    public Ponto3D() throws Exception{
        this(0,0,0);
    }

    public Ponto3D(double _x, double _y, double z) throws Exception {
        super(_x, _y);
        this.z = z;
    }
    
    public double getZ() {
        return z;
    }

    public void setZ(double z) throws Exception{
        if (Ponto.isLimite(z))
            this.z = z;
        else
            throw new Exception ("valor de z fora dos limites");
    }
        
    @Override
    public Ponto3D clonar(){
        try{
            return new Ponto3D(this.getX(),this.getY(), this.getZ());
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }
    
    public boolean temEixoComum(Ponto3D ponto){
        return super.temEixoComum(ponto) || ponto.getZ() == this.getZ();
    }
    
    static public double distancia(double x1, double y1, double z1, double x2, double y2, double z2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
    }
        
    public double distancia(Ponto3D _ponto){
        return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_ponto.getX(),_ponto.getY(),_ponto.getZ());
    }
    
    public double distancia(double _x, double _y, double _z){
        return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),_x,_y,_z);
    }
    
    @Override
    public double distanciaDaOrigem(){
        return Ponto3D.distancia(this.getX(),this.getY(),this.getZ(),0,0,0);
    }
}
