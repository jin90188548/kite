package test;

public class AAA {
	
	//Object o = new BBB();
	//Object o = new CCC();
	
	Object o ;
	
	void setObject(Object o) {
		this.o = o;
	}
	
	AAA(Object o){
		this.o = o;		
	}
	
	void print(){
		o.toString();
	}

}
