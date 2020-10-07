package exam1007;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String a;
		System.out.print("학점을 입력하세요.(A~D,F): ");
		a=s1.nextLine();
		if(a.equals("A")){
			System.out.print("참 잘하엿습니다.");
		}
		else if(a.equals("B")){
				System.out.print("참 잘하엿습니다.");
		}else if (a.equals("C")){
			System.out.print("좀 더 노력하세요.");
		}
		else	if (a.equals("D")){
			System.out.print("좀 더 노력하세요.");
		}
		else if(a.equals("F")){
			System.out.print("다음 학기생 다시 수강하세요.");
		}else{
			System.out.print("잘못된 학점입니다.");
			}				
		}
			
		

	}


