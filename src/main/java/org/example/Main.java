package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(List.of(input.nextLine().split(" ")));
        System.out.println(Arrays.toString(App.doStuff(list)));
    }
}