package exam1007;

import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double a=0,num = 0,i;
		
		
			System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
			
			for(i=0;i<10;i++){
				a=s1.nextInt();
				
				if(a<=0)
					continue;
				num=num+a;
			}System.out.print("양수의 합은 "+num);
			}
	

	}


