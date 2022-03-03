package com.yechao;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        int[] luckNumbers = createLuckNumbers();

        int[] userNumbers = userInputNumbers();

        judge(luckNumbers, userNumbers);
    }

    // 定义一个方法判断中奖金额
    public static void judge(int[] luckNumbers, int[] userNumbers){
        int hitRedNumbers = 0;
        int hitBlueNumbers = 0;
        // 判断红球中奖个数
        for (int i = 0; i < luckNumbers.length - 1; i++) {
            for (int j = 0; j < userNumbers.length - 1; j++) {
                if (luckNumbers[i] == userNumbers[j]){
                    hitRedNumbers++;
                    break;
                }
            }
        }

        // 判断蓝球中奖个数
        hitBlueNumbers = luckNumbers[luckNumbers.length-1] == userNumbers[userNumbers.length-1] ? 1 : 0;

        System.out.print("中奖号码是：");
        printArray(luckNumbers);
        System.out.print("您投注的号码是：");
        printArray(userNumbers);
        // 判断中奖金额
        if (hitBlueNumbers == 0 && hitRedNumbers < 3){
            System.out.println("恭喜你中了5元小奖！");
        }else if (hitBlueNumbers == 0 && hitRedNumbers == 4 || hitBlueNumbers == 1 && hitRedNumbers == 3){
            System.out.println("恭喜你中了10元小奖！");
        }else if (hitBlueNumbers == 0 && hitRedNumbers == 5 || hitBlueNumbers == 1 && hitRedNumbers == 4){
            System.out.println("恭喜你中了200元小奖！");
        }else if (hitBlueNumbers == 1 && hitRedNumbers == 5){
            System.out.println("恭喜你中了3000元小奖！");
        }else if (hitBlueNumbers == 0 && hitRedNumbers == 6){
            System.out.println("恭喜你中了500万元大奖！");
        }else if (hitBlueNumbers == 1 && hitRedNumbers == 6){
            System.out.println("恭喜你中了1000万元大奖！");
        }else {
            System.out.println("感谢你为福利事业作出了突出贡献！");
        }

    }


    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ?
                    arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    // 生成7个随机中奖号码
    public static int[] createLuckNumbers(){
        Random r = new Random();
        int[] luckNumbers = new int[7];
        for (int i = 0; i < luckNumbers.length - 1; i++) {
            // 6个红球
            while (true){
                int data = r.nextInt(33)+1;
                //
                boolean flag = true;

                for (int j = 0; j < i; j++) {
                    // 判断前面是否有与新生成的号码重复
                    if (luckNumbers[j] == data){
                         flag = false;
                        break;
                    }
                }

                if (flag){
                    // 没有重复，生成号码存入数组中
                    luckNumbers[i] = data;
                    break;
                }
            }

        }
        // 生成第7个中奖号码
        luckNumbers[ luckNumbers.length - 1] = r.nextInt(16)+1;
        return luckNumbers;
    }

    // 输入购买的数字
    public static int[] userInputNumbers(){
        Scanner in = new Scanner(System.in);
        int[] inputNumbers = new int[7];
        for (int i = 0; i < inputNumbers.length - 1; i++) {
            System.out.println("请输入要购买的第" + (i + 1) + "个红球号码：");
            inputNumbers[i] = in.nextInt(); // 输入红球号码1-33
        }
        System.out.println("请输入一个要购买的蓝球号码：");
        inputNumbers[6] = in.nextInt();// 输入蓝球号码1-16
        return inputNumbers;
    }
}
