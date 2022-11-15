package com.playground.java.Arrays;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        int[] nums = {1,343,323,435,656,3,4,23};

        int[] copy = Arrays.copyOf(nums, nums.length);

        for(int x = 0; x<copy.length; x++){
            System.out.println(copy[x]);
        }

        int[] ints = sortingArray(copy);
        System.out.println("==========");
        printArrays(ints);

    }
    // {1,343,323,435,656,3,4,23}
    public static int[] sortingArray(int[] numbers){
        int menor;
        int maior;

        boolean flag = true;
        while(flag) {
            flag=false;

            for (int aux = 0; aux < numbers.length - 1; aux++) {

                if (numbers[aux] < numbers[aux + 1]) {
                    menor = numbers[aux];
                    numbers[aux] = numbers[aux + 1];
                    numbers[aux + 1] = menor;
                    flag=true;
                }
            }

        }
        return numbers;
    }

    public static void printArrays(int[] arrays){
        for(int x = 0; x<arrays.length; x++){
            System.out.println(arrays[x]);
        }
    }
}
