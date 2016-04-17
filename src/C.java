
public class C implements B{
	public C (){
		System.out.println("C constructor");
	}
	
	public C (String s){
		System.out.println("C string constructor");
	}

	@Override
	public void a() {
		System.out.println("C.a");
	}
	
	private void c(){
		System.out.println("C.c");
	}
}
