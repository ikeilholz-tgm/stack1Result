import static org.junit.Assert.*;

import org.junit.Test;

import stack1.Stack1;


public class JUnitTests {
	
	private Object[] os = new Object[1];
	private int tos=0;
	
	Stack1 s = new Stack1(0); 
	
	
	
	@Test
	public void testPop() {
		Object stack =s.pop();
		if(stack!= os[--tos]){
			throw new RuntimeException("Failed TestPop");
		}
	}
	
	
	@Test
	public void testIsEmpty() {
		s.isEmpty();
		if(tos!=0){
			throw new RuntimeException("Failed TestIsEmpty");
		}
	}
	
	@Test
	public void testIsFull() {
		boolean b= s.isFull();
		if(b==false){
			throw new RuntimeException("Failed TestIsEmpty");
		}
	}

}
