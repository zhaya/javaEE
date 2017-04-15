package com.haut.suanfa;

import java.util.Scanner;
/**
 * 问题描述：
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。
 * 例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 * 现给定A、DA、B、DB，请编写程序计算PA + PB。
 * 
 * 举例：
 * 输入：3862767 6 13530293 3
 * 输出：399
 * @author zhao
 *
 */
public class PartAAddB {
	/**
	 * 分析思路：
	 * 利用字符串，进行读入数据，然后利用append方法进行连接
	 * @param args
	 */
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String DA = scan.next();
		String B = scan.next();
		String DB = scan.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < A.length(); i++){
			if(A.charAt(i) == DA.charAt(0)){
				sb1.append(DA);
			}
		}
		for(int j = 0; j < B.length(); j++){
			if(B.charAt(j) == DB.charAt(0)){
				sb2.append(DB);
			}
		}
		
		long a = sb1.length() == 0?0:Long.parseLong(sb1.toString());
		long b = sb2.length() == 0?0:Long.parseLong(sb2.toString());
		System.out.println(a+b);
	}
}
