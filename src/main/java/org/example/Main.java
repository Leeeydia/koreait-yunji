package org.example;

public class Main {
    public static void main(String[] args) {

        // 문제 1 arr1 변수에 t f t 연결
        boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

       // 2. arr2 변수에 [3.14, 7.77, 11.11] 연결

        double[] arr2 = new double[3];
        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 3. arr3 변수에 [1~10] 연결

        int[] arr3 = new int[10];
        for(int i =0; i<arr3.length; i++){
            arr3[i] = i+1;
            System.out.println("arr3[" + i +"]" +"=" + (i+1));
        }


    }
}