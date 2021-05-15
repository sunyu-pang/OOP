
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1 = new A();
		A ob2 = new A(5);
		A ob3 = new A(ob2);
		A ob4 = ob2;
		
		System.out.println(ob1.a+","+ob2.a);
		System.out.println(ob3.a+","+ob4.a);
		
		ob1.a = 10;
		ob2.a = 15;
		ob3.a= 20;
		ob4.a= 25; //ob2.a = 25;
		
		System.out.println(ob1.a+","+ob2.a);
		System.out.println(ob3.a+","+ob4.a);
		
	}

}
