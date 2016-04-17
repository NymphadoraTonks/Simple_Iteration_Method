
public class D extends C implements A{

	public D(){
		System.out.println("D constructor");
	}
	
	public D (String s){
		System.out.println("D string constructor");
	}
	
	public void a (){
		System.out.println("D.a");
	}
	
	public void c(){
		System.out.println("D.c");
	}
}
