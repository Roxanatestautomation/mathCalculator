package org.fasttrackit;

public class App
{
    public static void main( String[] args ) {

        Components components = new Components();
        int a = 4;
        int b = 2;

        System.out.println("Calculating the sum of "+ a +" and "+b);
        int addition = components.addition(a,b);
        System.out.println("The sum is: "+addition);

        System.out.println("Calculating the subtraction of "+a+" and "+b);
        int subtraction = components.subtraction(a,b);
        System.out.println("The subtraction is "+subtraction);

        System.out.println("Calculating the multiplication of "+a+" and "+b);
        int multiplication = components.multiplication(a,b);
        System.out.println("The multiplication is "+multiplication);









    }
}
