package exam1007;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double a=0,num = 0,ave = 0,b = 0;
		
		
			System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
			while(a!=-1){
				a=s1.nextInt();
				num=num+a;
				b++;
				ave=num/b;
			
			}	
			System.out.printf("������ ������"+(b-1)+"���̸�"+"����"+(num-a)+"�̰� �����"+((num-a)/(b-1))+"�Դϴ�.");
		
			
	}

}
