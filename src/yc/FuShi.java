package yc;

public class FuShi {
	static final int N = 11;
	static final int M = 5;
	
	static	int wanFa = 2; //玩法
	static	int fuShi = 3; //几码复式
	static  int zuShu ;
	
	public static void main(String arrs[]) {
		for(int i = 3 ; i<= 4; i++){
			wanFa = 2; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		////////////////////////////
		for(int i = 4 ; i<= 6; i++){
			wanFa = 3; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		////////////////////////////
		for(int i = 5 ; i<= 7; i++){
			wanFa = 4; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		
		////////////////////////////
		for(int i = 6 ; i<= 10; i++){
			wanFa = 5; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		
		
		////////////////////////////
		for(int i = 7 ; i<= 9; i++){
			wanFa = 6; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		////////////////////////////
		for(int i = 8 ; i<= 9; i++){
			wanFa = 7; fuShi = i; 
			System.out.println("任"+wanFa+" "+fuShi+"码复式");
			num2();
		}
		////////////////////////////
		wanFa = 8;  fuShi = 9; 
		System.out.println("任"+wanFa+" "+fuShi+"码复式");
		num2();	
		
	}
	
	public static void num2(){
		if(wanFa <= M){
			num();
		} else {
			// 任6~任8
			num3();
		}
		
	}

	// 任6~任8
	public static int num3(){
		int a = 0 ;
		a =  C(fuShi ,M);
		System.out.println(fuShi +" "+M);
		System.out.println("=============  "+a);
		return a;
	}
	// 任2~任5
	public static int num(){
		int w = wanFa , k;
		int a = 0 ,b = 0;
		if(fuShi <= M){
			zuShu = fuShi - wanFa + 1;
		} else{
			zuShu = M - wanFa +1;
		} 
		for(int i = 0; i< zuShu; i++){
			k = w + i;
			System.out.println(fuShi+ " "+k+ " "+(N - fuShi)+ " "+(M - k));
			a = C(fuShi ,k) * C(N - fuShi ,M - k);
//			System.out.println("a="+a);
			b +=a;
		}
		System.out.println("=============  "+b);
		return b;
	}
	
	
	public static int C(int n , int m){
		if(m > n) return 0;
		if(m == n) return 1;
		int c = 1;
		for(int i = 1; i <= m ;i++ ,n--){
			c =  c * n / i;
		}
		return c;
	}
}
