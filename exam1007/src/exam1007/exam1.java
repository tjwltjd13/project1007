package exam1007;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a=0;
		System.out.print("점수를 입력하세오: ");
		a=s1.nextInt();
		
		if(a>=80){
			System.out.print("축하합니다! 합격입니다.");
		}else{
			System.out.print("불합격입니다.");
		}
	}

}
