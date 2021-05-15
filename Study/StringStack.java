/* [2´Ü°è] ÀÎÅÍÆäÀÌ½º */
public class StringStack implements Stack {
	String[] stack;
	int index;
	
	public StringStack(int length) {
		stack = new String[length];
		index = 0;
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return stack.length;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (index == 0) {
			return null;
		}
		index--;
		return stack[index];
	}

	@Override
	public boolean push(Object ob) {
		// TODO Auto-generated method stub
		if(index == stack.length)
			return false;
		stack[index++] = (String) ob;
		return true;
	}

}
