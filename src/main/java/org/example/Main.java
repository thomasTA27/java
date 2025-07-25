package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[ ] arr =  { 3 ,2,5,3,2 };

        bubbleSort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("end");
    }

    public static void bubbleSort(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length - 1; i++) {
        for (int j = 0; j < length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }

    }
}