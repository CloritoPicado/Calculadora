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
interface Controlador {
    
    public int sumar(int a, int b);
    public int restar(int a, int b);
    public int multiplicacion(int a, int b);
    public int division(int numerador, int denominador);
    public int modulo(int a, int b);
    
}
