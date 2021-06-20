package com.alpha.company;

public class CommandLineArguments {

    public static void main(String[] args) {

        int[] array;

        int size = (args.length > 0) ? Integer.parseInt(args[0]) : 10;

        array = new int[size];

        System.out.printf("array length: %d%n", array.length);

    }

}
