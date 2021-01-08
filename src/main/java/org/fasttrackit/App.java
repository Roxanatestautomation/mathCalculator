package org.fasttrackit;

public class App
{
    public static void main( String[] args ) {

        Components components = new Components();
        int a = 4;
        int b = 2;
        int sum = a+b;
        int sub = a-b;
        int mut = a*b;

        components.addition(a,b);
        System.out.println(sum);

        components.subtraction(a,b);
        System.out.println(sub);

        components.multiplication(a,b);
        System.out.println(mut);





    }
}
