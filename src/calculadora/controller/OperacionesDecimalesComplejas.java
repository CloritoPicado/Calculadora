/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.controller;

public class OperacionesDecimalesComplejas extends OperacionesAritmeticas{
        
    public OperacionesDecimalesComplejas()
    {
        System.out.println(sumar(15,15));
        System.out.println(restar(15,15));
        System.out.println(multiplicacion(15,15));
        System.out.println(division(16,3));
        System.out.println(modulo(16,3));
        
    }

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        int resultado = 0;
        while(b != 0)
        {
            resultado = resultado + a;
            b--;
        }
        return resultado;
    }

    @Override
    public int division(int numerador, int denominador) {
        int resultado = 0;
        while(numerador >= denominador)
        {
            numerador = restar(numerador, denominador);
            resultado++;
        }
        return resultado;
    }

    @Override
    public int modulo(int a, int b) {
        int resultado = 0;
        while(a >= b)
        {
            a = restar(a, b);
            resultado++;
        }
        return a;
    }
    
    public static void main(String args[]) {
        new OperacionesDecimalesComplejas();
    }


    
}
