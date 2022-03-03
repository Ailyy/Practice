package com.yechao;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 6个评委打分，去掉最大值和最小值，剩下的求平均值就是最后的得分。
        int[] scores = new int[6];
        Scanner in = new Scanner(System.in);
        // 输入6个评委的打分
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            int score = in.nextInt();
            scores[i] = score;
        }

        // 对6个分值处理：求出总分，减去最大值和最小值然后求剩下4个分数的平均值
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            // 找出最大值
            if (max < scores[i]){
                max = scores[i];
            }

            // 找出最小值
            if (min > scores[i]){
                min = scores[i];
            }

            // 求总分数
            sum += scores[i];
        }

        // 计算最终得分
        double result = (sum - max - min) * 1.0 / (scores.length - 2);
        System.out.println("该选手的最终得分是：" + result);
    }
}
