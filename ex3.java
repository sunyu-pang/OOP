/* ex3 �־��� �������� ������� ���� ã�� */
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, i, temp, gcd=1, gcp, num;
		
		System.out.println("�� �ڿ����� �Է��ϼ���: ");
		a = s.nextInt();
		b = s.nextInt();
		
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(i=2; i<=b; i++) {
			if ((a%i==0) && (b%i==0))
				gcd = i;
		}
		
		gcp = (a*b) / gcd;
		
		num = 1000/gcp;
		System.out.printf("1���� 1000������ �� �߿��� %d�� %d�� ������� ������ %d�Դϴ�.\n", a, b, num);
	
		s.close();
	}

}
