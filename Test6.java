package com.yechao;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 目标：对一串数字加密（每个数字+5再%10，最后反转），输出加密后的数字
        // 键盘输入要加密的数字位数
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 定义一个数组存储输入的数据
        int[] arr = new int[n];
        // 用户输入数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据：");
            int number = in.nextInt();
            arr[i] = number;
        }

        //打印一遍初始密码
        printArray(arr);

        // 开始对数字加密
        // +5 再 %10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 打印一遍数组
        printArray(arr);

        // 对数组进行反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 最后打印加密后的数组
        printArray(arr);
    }

    // 定义一个方法打印一遍初始密码和加密后的密码
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

}
