package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int x;
        Random random = new Random();
        x = random.nextInt(1,10);
        System.out.println("Your lucky number: " +x);
    }
}
