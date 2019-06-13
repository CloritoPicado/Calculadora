/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.controller;

/**
 *
 * @author Patrixito
 */
abstract class OperacionesAritmeticas implements Controlador{
    
    @Override
    public abstract  int sumar(int a, int b);
    @Override
    public abstract int restar(int a, int b);
    @Override
    public  abstract int multiplicacion(int a, int b);
    @Override
    public abstract int division(int numerador, int denominador);
    @Override
    public abstract int modulo(int a, int b);
    
}
