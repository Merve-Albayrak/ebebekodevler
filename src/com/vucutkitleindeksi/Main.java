package com.vucutkitleindeksi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen boyunuzu giriniz:");
        float height=scanner.nextFloat();

        System.out.print("lütfen kilonuzu giriniz:");
        float weight=scanner.nextFloat();
        float index=weight/(height*height);

        System.out.println("Vücut Kitle İndeksiniz:"+index);



    }
}
