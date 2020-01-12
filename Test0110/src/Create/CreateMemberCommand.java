package Create;

import java.util.Scanner;

import com.naver.Command;

import Member.MemberDAO;
import Member.MemberDTO;

public class CreateMemberCommand implements Command {
	
	@Override
	public void execute(Scanner sc) {
		

		
		System.out.println("insert id");
		String id = sc.nextLine();
		sc.nextLine();
		
		System.out.println("insert name");
		String name = sc.nextLine();
		
		System.out.println("insert age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("insert did");
		String did = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();	
		dao.create(new MemberDTO(id, name, age, did));
		
		
	}
	
}
