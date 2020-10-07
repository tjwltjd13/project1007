package exam1007;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String a;
		System.out.print("학점을 입력하세요.(A~D,F): ");
		a=s1.nextLine();
		
		switch (a)
		{
		case("A"):
			System.out.println("잘했음.");
			break;
		case("B"):
			System.out.println("잘했음.");
		break;
		case("C"):
			System.out.println("노력필요.");
		break;
		case("D"):
			System.out.println("노력필요.");
		break;
		case("F"):
			System.out.println("재수강.");
		break;
		default:
			System.out.println("다시입력.");

		}

	}

}
