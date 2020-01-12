package Create;

import java.util.Scanner;

import com.naver.Command;

public class CreateMenuCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("등록 메뉴를 선택하세요");
		System.out.println("1.member 2.depart");
		
		Command[] com = {new CreateMemberCommand(), new CreateDepartCommand()};
		
		boolean isTrue = true;
		
		while (isTrue) {
			int idx = sc.nextInt()-1;
			if (idx < com.length) {
				Command c = com[idx];
				if (c != null) {
					c.execute(sc);
				}else {
					return;
				}
			}

		}
	}
}
