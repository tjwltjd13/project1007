package exam1007;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String a;
		System.out.print("������ �Է��ϼ���.(A~D,F): ");
		a=s1.nextLine();
		
		switch (a)
		{
		case("A"):
			System.out.println("������.");
			break;
		case("B"):
			System.out.println("������.");
		break;
		case("C"):
			System.out.println("����ʿ�.");
		break;
		case("D"):
			System.out.println("����ʿ�.");
		break;
		case("F"):
			System.out.println("�����.");
		break;
		default:
			System.out.println("�ٽ��Է�.");

		}

	}

}
