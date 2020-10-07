package exam1007;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double a=0,num = 0,ave = 0,b = 0;
		
		
			System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
			while(a!=-1){
				a=s1.nextInt();
				num=num+a;
				b++;
				ave=num/b;
			
			}	
			System.out.printf("정수의 개수는"+(b-1)+"개이며"+"합은"+(num-a)+"이고 평균은"+((num-a)/(b-1))+"입니다.");
		
			
	}

}
