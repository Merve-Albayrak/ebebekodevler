package com.manavkasa;

import java.util.Scanner;

public class Main {

    class Fruit{




    }
    public static void main(String[] args) {
	// write your code here
        float pricePear= 2.14f;
        float priceApple=3.67f;
        float priceTomato=1.11f;
        float priceBanana=0.95f;
        float priceAubergine=5.00f;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        float pear=scanner.nextFloat();

        System.out.print("Elma Kaç Kilo ? :");
        float apple=scanner.nextFloat();

        System.out.print("Domates Kaç Kilo ? :");
        float tomato=scanner.nextFloat();

        System.out.print("Muz Kaç Kilo ? :");
        float banana=scanner.nextFloat();

        System.out.print("Patlıcan Kaç Kilo ? :");
        float aubergine=scanner.nextFloat();


        float total=(priceAubergine*aubergine)+(priceApple*apple)+
                (priceBanana*banana)+(priceTomato*tomato)+(pricePear*pear);

        System.out.print("Toplam Tutar :"+total);

    }
}
