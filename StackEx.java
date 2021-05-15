
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack s = new StringStack(10);
		
		for(int i=0; i<s.length(); i++) {
			//s.push("문자열 " + i);
			System.out.println(s.push("문자열 " + i));
		}
		
		for(int i=0; i<s.length(); i++)
			System.out.println(s.pop());
	}

}
