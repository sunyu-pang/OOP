/* ex4 10������ 2������ ��ȯ�ϱ� */
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dem, temp, i=0, j;
		int[] bin = new int[32];
		
		System.out.println("10������ �Է��ϼ���: ");
		dem = s.nextInt();
		
		temp = dem;
		while(temp != 0) {
			bin[i] = temp%2;
			temp = temp/2;
			i++;
		}
		
		System.out.printf("%d�� 2������ ��ȯ: ", dem);
		for(j=i; j>=0; j--)
			System.out.print(bin[j]);
		
		s.close();
	}

}
