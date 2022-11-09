package com.vucutkitleindeksi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen boyunuzu giriniz:");
        float boy=scanner.nextFloat();

        System.out.print("lütfen kilonuzu giriniz:");
        float kilo=scanner.nextFloat();
        float indeks=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:"+indeks);



    }
}
