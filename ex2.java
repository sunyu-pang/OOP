/* ex2 ���μ� �Ǻ� */
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		int i, temp, div=0;
		
		System.out.println("�� �ڿ����� �Է��ϼ���: ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(i=2; i<=num2; i++) {
			if ((num1%i==0) && (num2%i==0)) {
				div++;
				break;
			}
		}
		
		if(div==0)
			System.out.printf("%d�� %d�� ���μ��Դϴ�.\n", num1, num2);
		else
			System.out.printf("%d�� %d�� ���μҰ� �ƴմϴ�.\n", num1, num2);
			
		s.close();
	}

}
