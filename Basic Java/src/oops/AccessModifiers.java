package oops;
import oopstest.*;

public class AccessModifiers extends StaticKeyword/*extends Test*/{

	public static void main(String[] args) {
		StaticKeyword sk=new StaticKeyword();
		sk.change();
		// TODO Auto-generated method stub
		Test t= new Test();
		t.call();
		
		
	}
	void test(){
		change();
	}
	

}
