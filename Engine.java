package com.jse.app;
import java.util.Random;
import java.util.Scanner;
import com.jse.app.Member;
public class Engine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		while(true) {
			System.out.println("0. 종료 "
					+ "1. 회원가입 "
					+ "2. 로그인"
					+ "5. 주사위 홀짝 맞추기"
					+ "3. 1부터 100까지의 합"
					+ "4. 가위바위보");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("회원가입");
				System.out.println("아이디 입력");
				String id = scanner.next();
				member.setId(id);
			break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디:"+ returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			}
		}
		
	}
	
	}
	
