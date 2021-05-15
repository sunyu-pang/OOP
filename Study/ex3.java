/* ex3 주어진 범위에서 공배수의 개수 찾기 */
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b, i, temp, gcd=1, gcp, num;
		
		System.out.println("두 자연수를 입력하세요: ");
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
		System.out.printf("1부터 1000까지의 수 중에서 %d와 %d의 공배수의 개수는 %d입니다.\n", a, b, num);
	
		s.close();
	}

}
