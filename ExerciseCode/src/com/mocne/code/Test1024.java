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
		 * StringBuilder �ַ���������
		 */
//		StringBuilder builder = new StringBuilder();
//		builder.append("k");
//		builder.append("asdasd");
//		builder.append(123);
//		String completeString = builder.toString();
//		System.out.println(completeString);
		
		/**
		 * ��׼������ Scanner
		 */
//		Scanner in= new Scanner(System.in);
//		System.out.println("What is your name ?");
//		String name = in.nextLine();
//		System.out.println("How old are you ?");
//		int age = in.nextInt();
//		System.out.println("My name is " + name + ", and I am " + age + " years old now.");
		
		/**
		 * ��׼������ Console
		 */
//		Console cons = System.console();
//		String username = cons.readLine();
//		char[] passwd = cons.readPassword();
//		System.out.printf("Your username is %s, and you password is %d", username, passwd);
//		
		
		/**
		 * �ļ����������
		 */
//		Scanner in1 = new Scanner(new File("E:\\desk\\app\\adb.txt"));
//		String test = in1.nextLine();
//		String test1 = in1.nextLine();
//		System.out.println(test);
//		System.out.println(test1);
		
		/**
		 * 3.8 �������� 
		 */
		/*
			1.��  {}
			2.������� if����{}
			3.ѭ�� while (){}  && do{}while()
			4.����ѡ��switch����{case 1�� ... case 2: ...}
			5.�жϿ�������break continue 
		*/
		
		
		/**
		 * 3.10 ����
		 * 3.10.1 for each ���δ��������е�ÿ��Ԫ��
		 */
		int[] a = new int[100];  //������һ�����Դ洢100������������
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		a = new int [] {11,12,13,14,15,16,17};
		for(int element : a)
			System.out.println(element);
		for(int element : b)
			System.out.println(element);
		
		/**
		 * ���鿽�� copyof  arraycopy
		 */
		
		/**
		 * ��������  ��������
		 */
		Arrays.sort(a);
		
		/**
		 * ��ά����
		 */
//		double[][] arr;
//		int[][] arr_1 = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
		
		/**
		 * ����������
		 */
//		double[] balances;
//		double[] temp = balances[i];
//		balances[i] = balances[i + 1];
//		balances[i + 1] = temp;
		
		/**
		 * ������ ��������
		 */
		
		
	}

}
