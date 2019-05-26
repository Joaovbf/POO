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
public interface Escalavel {
    /**
    * O método amplia modifica os campos do objeto para alterar o seu tamanho.
    * @param escala a escala para modificação do objeto
    */
    void amplia(double escala);

    /**
    * O método espelha modifica os campos do objeto para alterar a sua posição (fazendo
    * com que o objeto fique refletido nas suas coordenadas horizontais)
    */
    void espelha();
}
