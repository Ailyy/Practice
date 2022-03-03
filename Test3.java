package com.yechao;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // 需求：随机生成一个5位数的验证码（由大写字母、小写字母、数字组成）
        String code = createCode(5);
        System.out.println("随机验证码：" + code);
    }

    public static String createCode(int n){
        // 先生成一个空字符串用于存储字符
        String code = "";
        // 定义一个for循环生成5个随机字符
        for (int i = 0; i < n; i++) {

            Random r = new Random();
            int type = r.nextInt(3);//随机生成一个类型：0代表大写字母，1代表小写字母，2代表数字
            switch (type){
                case 0:
                    // 生成一个大写字母（A 65 - Z 65+25）
                    char ch1 = (char) (r.nextInt(25) + 65);
                    code += ch1;
                    break;
                case 1:
                    // 生成一个小写字母（a 97 - z 97+25）
                    char ch2 = (char) (r.nextInt(25) + 97);
                    code += ch2;
                    break;
                case 2:
                    // 生成一个数字字符（A 65 - Z 65+25）
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
