package com.yechao;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 需求：
        // 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        // 按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，淡季11月到来年4月）头等舱7折，经济舱6.5折。
        // 4.定义一个输入语句输入原价，月份和舱型
        Scanner in = new Scanner(System.in);
        System.out.println("请输入原价：");
        double price = in.nextDouble();
        System.out.println("请输入要查找的月份：");
        int month = in.nextInt();
        System.out.println("请输入要查找的舱型：");
        String type = in.next();
        double rs = calc(price, month, type);
        System.out.println("您要查找的机票的价格是：" + rs);
    }

    // 1.定义一个方法计算机票价格并返回
    public static double calc(double money, int month, String type){
        // 2.定义一个if，判断是旺季还是淡季
        if (month >= 5 && month <= 10){
            // 3.定义一个switch，判断是头等舱还是经济舱
            switch (type){
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *=0.85;
                    break;
                default:
                    System.out.println("您输入的舱型有误！");
                    money = -1;
            }
        }else if (month == 11 || month ==12 || month >= 1 && month <= 4){
            switch (type){
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *=0.65;
                    break;
                default:
                    System.out.println("您输入的舱型有误！");
                    money = -1;
            }
        }else {
            System.out.println("您输入的月份有误！");
            money = -1;
        }
        return money;
    }
}
