/* ��ǥ �����̵� */
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		
		CoordinateMove move = new CoordinateMove();
		
		move.display();
		
		System.out.print("�̵���: ");
		a = s.nextInt();
		b = s.nextInt();
		
		move.Move(a, b);
		move.display();
		
		s.close();
	}

}
