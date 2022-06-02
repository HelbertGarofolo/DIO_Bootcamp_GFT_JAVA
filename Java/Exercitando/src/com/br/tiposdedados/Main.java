package com.br.tiposdedados;

// não foi utilizado boas práticas
public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; Ultrapaça o limite suportado

        //int i1 = 10000000000; Ultrapaça o limite suportado
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 200400500050005500L;

        //float f1 = 4.5; //não utiliza convenção
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04d;// boas praticaa

        char c1 = 'W';
        //char cc2 = 'Tw'; somente 1 caracter no char
        char c3 = '\u0057'; // código unicode esse código equivale ao 'W'

        String st1 = "fulano";// tem que colocar em ""
        String st2 = "ciclano";
        String st3 = "oajd de oldjas 214464 dad eajr932 *%$ 564.654";

        //String dt1 = "21/03/1985"; boa prática não é interessante, existe um composto para data

        boolean bo1 = true; // somente 2 opções
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);


    }
}
