package kr.co.ca;

import java.util.Scanner;

import com.naver.Command;

import Create.CreateMenuCommand;

public class MainEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Command[] com = {new CreateMenuCommand()};
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.등록 2.종료");
			int idx = sc.nextInt()-1;
			
			if (idx < com.length) {
				Command c = com[idx];
				if (c != null) {
					c.execute(sc);
				}
			}else {
				isTrue = false;
			}
		}
		sc.close();
	}

}
