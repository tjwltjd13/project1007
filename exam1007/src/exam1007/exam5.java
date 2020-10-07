package exam1007;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double a=0,num = 0,ave = 0,b = 0,i;
		
		
			System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
			do{
				
				a=s1.nextInt();
				if(a<0)
					continue;
				num=num+a;
				
				
			}while(a!=-1);
			System.out.print("정수의 합은"+num);
			}				

	}



