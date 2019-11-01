package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("輸入3跟木柴長度");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        if(x+y>z && x+z>y && x+z>y && y+z>x){
            System.out.println("可以排成一個三角形");
        }else{
            System.out.println("不能排成一個三角形");
        }


    }
}
