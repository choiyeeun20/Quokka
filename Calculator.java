package com.jse.app;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		// 첫번째 수 입력
		// 두번째 수 입력
		// 두 수의 합은?(정수)
		System.out.print("첫번째 수 입력");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("두번째 수 입력");
		Scanner scanner2 = new Scanner(System.in);
		int b = scanner2.nextInt();
		System.out.println("새번째 수 입력");
		Scanner scanner3 = new Scanner(System.in);
		int c = scanner3.nextInt();
		System.out.println("네번재 수 입력");
		Scanner scanner4 = new Scanner(System.in);
		int d = scanner4.nextInt();
		int e = a+b+c+d;
		System.out.println("네수의 합은" + e);
	}
}
