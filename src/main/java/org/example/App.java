package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną dodatnia. \n Wpisz n-tą liczbę z ciągu fibonacciego");
        int nFibonacciNumber = scanner.nextInt();
        int a=0, b=1;
        int wynik=0;
        for(int i=2; i<= nFibonacciNumber; i++){
wynik=a+b;
            a=b;
            b =wynik;
        }
        System.out.println(wynik);
    }
}
