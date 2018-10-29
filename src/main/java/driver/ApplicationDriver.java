package driver;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StudentDetailsService;

public class ApplicationDriver {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		StudentDetailsService studentService = context.getBean("studentService", StudentDetailsService.class);

		System.out.println("Select \n1.getAllDetails \n2.getDetailsById \n");
		
		Scanner scan = new Scanner(System.in);
		
		int opt = scan.nextInt();
		
		
		switch(opt) {
		case 1:
			studentService.getAllDetails().stream().forEach(System.out::println);
			break;
			
		case 2:
			System.out.println("\nEnter ID:\n");
			System.out.println(studentService.getDetails(scan.nextInt()));
			break;

			
		default:
			System.out.println("No option selected");
			break;
		}
				
		scan.close();
	}

}
