package com.mocne.code;

import java.io.File;
import java.io.IOException;
import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Test1024 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * StringBuilder 字符串构建器
		 */
//		StringBuilder builder = new StringBuilder();
//		builder.append("k");
//		builder.append("asdasd");
//		builder.append(123);
//		String completeString = builder.toString();
//		System.out.println(completeString);
		
		/**
		 * 标准输入流 Scanner
		 */
//		Scanner in= new Scanner(System.in);
//		System.out.println("What is your name ?");
//		String name = in.nextLine();
//		System.out.println("How old are you ?");
//		int age = in.nextInt();
//		System.out.println("My name is " + name + ", and I am " + age + " years old now.");
		
		/**
		 * 标准输入流 Console
		 */
//		Console cons = System.console();
//		String username = cons.readLine();
//		char[] passwd = cons.readPassword();
//		System.out.printf("Your username is %s, and you password is %d", username, passwd);
//		
		
		/**
		 * 文件收入与输出
		 */
//		Scanner in1 = new Scanner(new File("E:\\desk\\app\\adb.txt"));
//		String test = in1.nextLine();
//		String test1 = in1.nextLine();
//		System.out.println(test);
//		System.out.println(test1);
		
		/**
		 * 3.8 控制流程 
		 */
		/*
			1.块  {}
			2.条件语句 if（）{}
			3.循环 while (){}  && do{}while()
			4.多重选择：switch（）{case 1： ... case 2: ...}
			5.中断控制流：break continue 
		*/
		
		
		/**
		 * 3.10 数组
		 * 3.10.1 for each 依次处理数组中的每个元素
		 */
		int[] a = new int[100];  //创建了一个可以存储100个整数的数组
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		a = new int [] {11,12,13,14,15,16,17};
		for(int element : a)
			System.out.println(element);
		for(int element : b)
			System.out.println(element);
		
		/**
		 * 数组拷贝 copyof  arraycopy
		 */
		
		/**
		 * 数组排序  快速排序
		 */
		Arrays.sort(a);
		
		/**
		 * 多维数组
		 */
//		double[][] arr;
//		int[][] arr_1 = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
		
		/**
		 * 不规则数组
		 */
//		double[] balances;
//		double[] temp = balances[i];
//		balances[i] = balances[i + 1];
//		balances[i + 1] = temp;
		
		/**
		 * 第四章 对象与类
		 */
		
		
	}

}
