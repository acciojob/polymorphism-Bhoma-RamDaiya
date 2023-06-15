package com.driver;

import java.sql.SQLOutput;

public class Main {


    public static class Product {
        public int product(int x , int y){
            return x*y;
        }
        public int product(int x , int y, int z){
            return x*y*z;
        }
        public double product(double x , double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
       int result = p.product(2, 5);
       int r =  p.product(2, 3, 5);
      double b =  p.product(2.5, 3.2);
        System.out.println(result);
        System.out.println(r);
        System.out.println(b);
    }

}