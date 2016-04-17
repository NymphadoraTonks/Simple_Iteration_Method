

public class Main { 
    public static void main(String ... args) {
		/*A c = new C();
		c = new C("1");
		A d = new D();
		d = new D("1");
		
		c.a();
		d.a();
		
		D b = (D)d;
		b.a();*/
		
    	int n = 7;
    	int a = 0, b = n-1;
    	int [][] B = new int[n][n];
    	for(int i = 0; i<n; i++){
    		for(int j = 0; j<n; j++)
    			B[i][j] = 0;
    	}
    	
    	for(int i = 0; i<n; i++){
    		for(int j = a; j<=b; j++)
    			B[j][i] = 1;
    		if(i<n/2){
    			a++;b--;
    		} else {
    			a--;b++;
    		}
    	}
    	
    	for(int i = 0; i<n; i++){
    		for(int j = 0; j<n; j++)
    			System.out.print(B[i][j] + " ");
    		System.out.println();
    	}
    	
    }
} 