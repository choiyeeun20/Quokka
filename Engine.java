package com.jse.app;
import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Calculator calculater = new Calculator();
		Dice dice = new Dice();
		RPSGame rpsgame = new RPSGame();
		
		while(true) {
			System.out.println("0. 종료 "
					+ " 1. 회원가입 "
					+ " 2. 로그인"
					+ " 3. 계산기"
					+ " 4. 주사위 홀짝 맞추기"
					+ " 5. 가위바위보 게임"
					+ " 6. 1부터 100까지의 합");
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
			case 3 :
				System.out.println("계산기");
				System.out.print("첫번째 수 입력");
				int a = scanner.nextInt();
				calculater.setNum1(a);
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculater.setNum2(b);
				int c = calculater.calculate();
				System.out.println("두수의 합:" + c);
				break;
			case 4: System.out.println("주사위 홀짝 맞추기");
					System.out.println("예상하는 홀짝을 입력해 주세요");
					String expect = scanner.next();
					System.out.println(String.format("사용자가 입력한 값: %s", expect));
					dice.setExpect(expect);
					int diceNumber = random.nextInt(4);
					System.out.println(String.format("컴퓨터가 생성한 값: %s", diceNumber));
					dice.setdice(diceNumber);
					String result = dice.switchDice();
					System.out.println(result);
				break;
			case 5: 
					System.out.println("***가위바위보 게임***");
					System.out.println("가위1, 바위2, 보3 를 입력하세요");
					int user = scanner.nextInt();
					System.out.println("사용자가 입력한 값:" + user );
					rpsGame.setUserValue(user);
					int com = random.nextInt(3)+1;
					System.out.println(String.format("컴퓨터의 값은 2입니다"));
					String result1 = "";
					if(user == com) {
						result = "비김";
					}else if (user > com) {
						result = "사용자 승리";
					}else{
						result = "컴퓨터 승리";
					break;
					}
			}
		}
	}
}	
		

	
	
	
