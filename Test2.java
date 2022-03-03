package com.yechao;

public class Test2 {
    public static void main(String[] args) {
        // 求101~200之间的素数并输出
        System.out.println("101~200之间的素数有：");
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;// 开始认为这个数是素数
            for (int j = 2; j < i / 2; j++) {
                // 判断数据是否是素数
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            // 根据判断结果输出数据
            if (flag){
                System.out.print(i + "\t");
            }
        }
    }
}
