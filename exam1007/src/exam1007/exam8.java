package exam1007;

import java.util.Scanner;

public class exam8 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String a;
		do{
			a=s1.next();
			if(a.equals("exit")){
					System.out.println("종료합니다...");
			break;
		  }
		}while(true);
}
}