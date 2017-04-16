package com.haut.suanfa;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 问题描述：
 * 本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。
 * 你需要输出商数Q和余数R，使得A = B * Q + R成立。
 * 输入描述：
 * 输入在1行中依次给出A和B，中间以1空格分隔。
 * 输出描述：
 * 在1行中依次输出Q和R，中间以1空格分隔。
 * 实例：
 * 123456789050987654321 7
 * 输出：17636684150141093474 3
 * 参考CSDN的大数，java内部的包装类
 * http://blog.csdn.net/forebe/article/details/39256087
 * @author zhao
 *
 */
public class ASubB {
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args){
		BigInteger bi1 = in.nextBigInteger();
		BigInteger bi2 = in.nextBigInteger();
		System.out.println(bi1.divide(bi2)+" "+bi1.remainder(bi2));
		
	}
}
