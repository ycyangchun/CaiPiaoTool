package yc;

public class DanTuo {
	static final int N = 11;
	static final int M = 5;
	
	static	int wanFa = 2; //玩法
	static	int danMa = 1; //胆码
	static	int tuoMa = 2; //拖码
	
	public static void main(String arrs[]) {
		/////// 任二
//		wanFa = 2; danMa = 1; tuoMa = 2; 
//		System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//		num2();
//		
//		wanFa = 2; danMa = 1; tuoMa = 3; 
//		System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//		num2();
		
		/////// 任三
//		for(int i = 3 ; i<= 9; i++){
//			wanFa = 3; danMa = 1; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 2 ; i<= 9; i++){
//			wanFa = 3; danMa = 2; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
		
		/////// 任四
		for(int i = 4 ; i<= 10; i++){
			wanFa = 4; danMa = 1; tuoMa = i; 
			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
			num2();
		}
		
		for(int i = 3 ; i<= 9; i++){
			wanFa = 4; danMa = 2; tuoMa = i; 
			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
			num2();
		}
		
		for(int i = 2 ; i<= 8; i++){
			wanFa = 4; danMa = 3; tuoMa = i; 
			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
			num2();
		}
		
		/////// 任五
//		for(int i = 5 ; i<= 10; i++){
//			wanFa = 5; danMa = 1; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 4 ; i<= 9; i++){
//			wanFa = 5; danMa = 2; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 3 ; i<= 8; i++){
//			wanFa = 5; danMa = 3; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 2 ; i<= 7; i++){
//			wanFa = 5; danMa = 4; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
		
		/////// 任六
//		for(int i = 6 ; i<= 9; i++){
//			wanFa = 6; danMa = 1; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 5 ; i<= 9; i++){
//			wanFa = 6; danMa = 2; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 4 ; i<= 8; i++){
//			wanFa = 6; danMa = 3; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 3 ; i<= 7; i++){
//			wanFa = 6; danMa = 4; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 2 ; i<= 6; i++){
//			wanFa = 6; danMa = 5; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
		
		/////// 任七
//		for(int i = 7 ; i<= 9; i++){
//			wanFa = 7; danMa = 1; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//	
//		for(int i = 6 ; i<= 8; i++){
//			wanFa = 7; danMa = 2; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 5 ; i<= 8; i++){
//			wanFa = 7; danMa = 3; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 4 ; i<= 7; i++){
//			wanFa = 7; danMa = 4; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 3 ; i<= 6; i++){
//			wanFa = 7; danMa = 5; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
//		
//		for(int i = 2 ; i<= 5; i++){
//			wanFa = 7; danMa = 6; tuoMa = i; 
//			System.out.println("任"+wanFa+" "+danMa+"胆"+tuoMa+"拖");
//			num2();
//		}
		
	}
	
	public static void num2(){
		if(wanFa <= M){
			num();
		} else {
			// 任6~任7
			num3();
		}
		
	}

	// 任6~任7
	public static int num3(){
		int a = 0 , b = 0 , k = 0;
		for(int j = danMa -(wanFa -M); j<= danMa; j++){
			if(j <= M){
				for(int i = M - j; i<= M; i++){
					k = j + i;
					if( k <= M){
						System.out.println(danMa + " "+j + " "+ tuoMa+ " "+i);
						a = C(danMa,j)*C(tuoMa ,i);
//						System.out.println("a = "+a);
						b +=a;
					}
				}
			}
		}
		System.out.println("=============  "+b);
		return b;
	}
	// 任2~任5
	public static int num(){
		int a = 0 ,b = 0, k = 0 , m = 0;
		for(int i = wanFa - danMa; i<= tuoMa; i++){
			k = M - i - danMa;
			m = N - tuoMa - danMa;
			if( k>= 0){
				System.out.println(tuoMa+ " "+i+ " "+m+ " "+k);
				a = C(tuoMa ,i) * C(m,k);
//				System.out.println("a = "+a);
				b +=a;
				
			}
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
