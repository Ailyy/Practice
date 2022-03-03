package com.yechao;

public class Test4 {
    public static void main(String[] args) {
        // 需求：把一个数组中的数据复制到另一个新数组中去。
        int[] arr1 = {12, 13, 14, 15, 16};
        int[] arr2 = new int[arr1.length];
        System.out.println(arr1);
        System.out.println(arr2);
        copy(arr1, arr2);
        printArray(arr1);
        printArray(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
    }

    // 定义一个方法输出完成复制后的两个数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void copy(int[] arr1, int[] arr2){
        // 正式完成元素的复制
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
