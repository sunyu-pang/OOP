/* ex1 작은 수부터 출력하기 */
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num[] = new int[3];
		int i, j, temp;
		
		System.out.println("서로 다른 세 정수를 입력하세요: ");
		for(i=0; i<3; i++)
			num[i] = s.nextInt();
		
		temp = num[0];
		for(i=0; i<3; i++) {
			for(j=i+1; j<3; j++) {
				if(num[i]>num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		
		for(i=0; i<3; i++)
			System.out.println(num[i]);
		
		s.close();
	}

}
