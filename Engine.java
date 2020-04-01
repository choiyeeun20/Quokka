package com.jse.app;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0. 종료 "
					+ "1. 가위바위보 "
					+ "2. 주사위 홀짝 맞추기"
					+ "3. 1부터 100까지의 합"
					+ "4 ");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("계산기");break;
			case 2:switchDice() ;break;
			}
		}
		
	}
	static void switchDice() {
		System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println("기대하는 값 홀/짝을 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한 값: %s", expect));
		Random random = new Random();
		int dice = scanner.nextInt(4);
		System.out.println(String.format("컴퓨터가 생성한 값: %s", dice));
		String result= "";
		switch(dice) {
		case 1: case 3: case 5: result = "홀"; break;
		case 2: case 4: case 6: result = "짝"; break;
		}
		System.out.println("컴퓨터의 결과 :짝");
		String result2 = "틀림";
		if(expect.equals(result)) {
			result2 = "맞음";	}
		System.out.println(String.format("결과 : %s", result2));
		}
	}

