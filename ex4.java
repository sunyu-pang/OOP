/* ex4 10진수를 2진수로 변환하기 */
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dem, temp, i=0, j;
		int[] bin = new int[32];
		
		System.out.println("10진수를 입력하세요: ");
		dem = s.nextInt();
		
		temp = dem;
		while(temp != 0) {
			bin[i] = temp%2;
			temp = temp/2;
			i++;
		}
		
		System.out.printf("%d를 2진수로 변환: ", dem);
		for(j=i; j>=0; j--)
			System.out.print(bin[j]);
		
		s.close();
	}

}
