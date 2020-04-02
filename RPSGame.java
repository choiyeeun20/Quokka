package com.jse.app;
import java.util.Random;
import java.util.Scanner;
public class RPSGame {
	public static void main(String[] args) {
	game();}
		static void game() {
			System.out.println("가위1 바위2 보3를 입력하세요");
			 Scanner scanner = new Scanner(System.in);
			 int user = scanner.nextInt();
			 System.out.println(String.format("사용자의 값: %d",user));
			 Random random = new Random();
			 int com = random.nextInt(3)+1;
			 System.out.println(String.format("컴퓨터의 값: %d",com));
			 String result = "";
			if(user==com) { 
				System.out.println("비김");	
			}else if (user > com) {
				System.out.println("승");
			}else {
				System.out.println("패");
			}
			
		}
		}
				
	
	
		


		
	

	