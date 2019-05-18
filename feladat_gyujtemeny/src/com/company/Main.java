package com.company;

import java.util.Scanner;

public class Main {

    public static void elag_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az életkorát: ");
        if (sc.nextInt() >= 18){
            System.out.println("Őn 18 év fölött van!");
        }
        else System.out.println("Ön még kiskorú nem szavazhat!");
    }

    public static void elag_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot: ");
        if (sc.nextInt()%2 == 0){
            System.out.println("A szám páros!");
        }
        else System.out.println("A szám páratlan!");
    }

    public static void elag_3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nírjon be egy számot: ");
        int szam = sc.nextInt();
        if (szam > 0){
            System.out.println("A szám pozitív!");
        }
        else if (szam < 0){
            System.out.println("A szám negatív!");
        }
        else System.out.println("A szám 0!");
    }

    public static void elag_4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot 1-től 7-ig:");
        int szam = sc.nextInt();
        switch (szam){
            case 1:
                System.out.println("Hétfő van!");
                break;
            case 2:
                System.out.println("Kedd van!");
                break;
            case 3:
                System.out.println("Szerda van!");
                break;
            case 4:
                System.out.println("Csütörtök van!");
                break;
            case 5:
                System.out.println("Péntek van!");
                break;
            case 6:
                System.out.println("Szombat van!");
                break;
            case 7:
                System.out.println("Vasárnap van!");
                break;
            default:
                System.out.println("A szám hibás, nincs ilyen nap!");

        }
    }

    public static void  elag_5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot 1-től 12-ig:");
        int szam = sc.nextInt();
        switch (szam){
            case 1:
                System.out.println("A január 31 napos");
                break;
            case 2:
                System.out.println("A február 28 napos");
                break;
            case 3:
                System.out.println("A március 31 napos");
                break;
            case 4:
                System.out.println("Az április 30 napos");
                break;
            case 5:
                System.out.println("A május 31 napos");
                break;
            case 6:
                System.out.println("A június 30 napos");
                break;
            case 7:
                System.out.println("A július 31 napos");
                break;
            case 8:
                System.out.println("Az augusztus 31 napos");
                break;
            case 9:
                System.out.println("A szeptember 30 napos");
                break;
            case 10:
                System.out.println("Az oktober 31 napos");
                break;
            case 11:
                System.out.println("A november 30 napos");
                break;
            case 12:
                System.out.println("A december 31 napos");
                break;
                default:
                    System.out.println("Nincs ilyen hónap!");
        }
    }

    public static void elag_6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot:");
        int szam = sc.nextInt();
        if ((szam % 3 == 0) && (szam % 2 == 0)){
            System.out.println("A szám osztható 3-mal és 2-vel!");
        }
        else System.out.println("A szám NEM osztható 3-mal és 2-vel!");
    }

    public static void elag_7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot:");
        int szam = sc.nextInt();
        if ((szam % 3 == 0) || (szam % 2 == 0)){
            System.out.println("A szám osztható 3-mal vagy 2-vel!");
        }
        else System.out.println("A szám NEM osztható 3-mal vagy 2-vel!");
    }

    public static void  elag_8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be 3 számot:");
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        int szam3 = sc.nextInt();
        if (szam1 > szam2 && szam1 > szam3){
            System.out.println("Az első szám a legnagyobb");
        }
        else if (szam2 > szam1 && szam2 > szam3){
            System.out.println("A második szám a legnagyobb");
        }
        else if (szam3 > szam2 && szam3 > szam1) {
            System.out.println("A harmadik szám a legnagyobb");
        }
        else System.out.println("A három szám egyenlő");
    }

    public static void  elag_18(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írjon be egy számot: ");
        int szam = sc.nextInt();
        System.out.println("áfa: " + (szam*0.27));
        System.out.println("bruttó: " + (szam*1.27));
        System.out.println("nettó: " + szam);
    }

    public static void ciklus_6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írja be meddig akarja kiiratni a fibonacci sorozatott:");
        long szam = sc.nextLong();
        long a = 0;
        long b = 1;
        long ossz = 0;
        for (int i = 0; i < szam; i++) {
            ossz = a + b;
            b = a;
            a = ossz;


            System.out.println(ossz);
        }
    }

    public static long ciklus_8(long szam,double x){
        long ossz = 1;
        for (int i = 0; i < x; i++) {
            ossz = ossz * szam;
        }
        return ossz;

    }

    public static void ciklus_11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("írja be a számot: ");
        double szam = sc.nextInt();
        double gyok = 0;
        for (int i = 2; i < 10; i++) {
            gyok = szam / i;
            if (gyok %1 == 0){
                System.out.println("A szám egészgyöke: "+ gyok);
                break;
            }
            if (szam == i + 1){
                System.out.println("A szám gyöke -1");
                break;
            }






        }
    }


    public static void main(String[] args) {
        ciklus_11();


    }
}
