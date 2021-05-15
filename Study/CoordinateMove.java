/* 좌표 평행이동 라이브러리 클래스 */
public class CoordinateMove {

	int x, y;
	
	CoordinateMove() {
		x=0;
		y=0;
	}
		
	void Move(int x_mov, int y_mov) {
		this.x += x_mov;
		this.y += y_mov;
	}
	
	void display() {
		System.out.println("(x,y) = "+x+","+y);
	}

}
