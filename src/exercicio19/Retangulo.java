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
public class Retangulo implements ObjetoGeometrico, Escalavel{
    
    private Ponto superior;
    private Ponto inferior;

    public Retangulo(Ponto superior, Ponto inferior) {
        this.superior = superior;
        this.inferior = inferior;
    }
    
    @Override
    public Ponto centro(){
        try{
            double x = (superior.getX() + inferior.getX())/2;
            double y = (superior.getY() + inferior.getY())/2;

            return new Ponto(x,y);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return null;
    }
    
    @Override
    public double calculaÁrea(){
        double altura = this.getAltura();
        double largura = this.getLargura();
        double area = altura*largura;
        return area;
    }
    
    @Override
    public double calculaPerímetro(){
        double altura = this.getAltura();
        double largura = this.getLargura();
        double perimetro = altura*2 + largura*2;
        return perimetro;
    }
    
    @Override
    public void amplia(double escala){
        try{
            double altura = this.getAltura() * escala;
            double largura = this.getLargura() * escala;

            double x = superior.getX() + largura;
            double y = superior.getY() + altura;
            this.inferior = new Ponto(x,y);
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    
    @Override
    public Retangulo clona(){
        return new Retangulo(this.superior,this.inferior);
    }
    
    @Override
    public void espelha(){
        
    }
    
    public double getAltura(){
        return Math.sqrt(Math.pow(superior.getY() - inferior.getY(),2));
    }
    
    public double getLargura(){
        return Math.sqrt(Math.pow(superior.getX() - inferior.getX(),2));
    }
}
