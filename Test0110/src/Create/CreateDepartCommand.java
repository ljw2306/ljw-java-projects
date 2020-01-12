package Create;

import java.util.Scanner;

import com.naver.Command;

import Depart.DepartDAO;
import Depart.DepartDTO;

public class CreateDepartCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("insert did");
		String did = sc.nextLine();
		
		System.out.println("insert dname;");
		String dname = sc.nextLine();
		
		DepartDAO dao = new DepartDAO();
		dao.create(new DepartDTO(did, dname));
	}
	
	
	
}
