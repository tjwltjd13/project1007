package exam1007;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a=0;
		System.out.print("������ �Է��ϼ���: ");
		a=s1.nextInt();
		
		if(a>=80){
			System.out.print("�����մϴ�! �հ��Դϴ�.");
		}else{
			System.out.print("���հ��Դϴ�.");
		}
	}

}
