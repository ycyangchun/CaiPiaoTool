package yc;

public class SSQWin {
	
	static final int R = 10;//投注红球数  6~20
	static final int G = 12;//投注篮球数  1~16
	
	static	int r = 6; //命中红球数 0~6
	static	int g = 1; //命中篮球数 0~1
	static  int zuShu ;//注数
	
	public static void main(String arrs[]) {
		zuShu = C(R,6) * C(G ,1);
		System.out.println("注数 ：" + zuShu +" 金额："+ zuShu * 2);
		
		//一等奖 6+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,6);
		}
		if(zuShu > 0){
			System.out.println("一等奖 注数 ：" + zuShu +" 金额：A");
		} else {
			System.out.println("一等奖 注数 ：" + zuShu +" 金额：0");
		}
		
		//二等奖 6+0
		zuShu = 0;
		zuShu = C(r,6) * C(G-g ,1) ;
		
		if(zuShu > 0){
			System.out.println("二等奖 注数 ：" + zuShu +" 金额：B");
		} else {
			System.out.println("二等奖 注数 ：" + zuShu +" 金额：0");
		}
		
		
		//三等奖  5+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,5) * C(R -r ,1);
		} 
		System.out.println("三等奖 注数 ：" + zuShu +" 金额："+ zuShu * 3000);
		
		//四等奖  4+1 ,5+0
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,4) * C(R -r ,2);
		} 
		zuShu += C(r,5) * C(R -r ,1) * C(G-g ,1) ;
		
		System.out.println("四等奖 注数 ：" + zuShu +" 金额："+ zuShu * 200);
		
		
		//五等奖  3+1 ,4+0
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,3) * C(R -r ,3);
		} 
		zuShu += C(r,4) * C(R -r ,2) * C(G-g ,1) ;
		
		System.out.println("五等奖 注数 ：" + zuShu +" 金额："+ zuShu * 10);
		
		
		//六等奖  2+1 ,1+1 , 0+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,2) * C(R -r ,4)  + C(r,1)  * C(R -r ,5) + C(r,0) * C(R -r, 6);
		}
		System.out.println("六等奖 注数 ：" + zuShu +" 金额："+ zuShu * 5);
		
	}
	
	public static int C(int n , int m){
		if(n == 0) return 0;
		if(m < 0) return 0;
		if(m > n) return 0;
		if(m == n) return 1;
		int c = 1;
		for(int i = 1; i <= m ;i++ ,n--){
			c =  c * n / i;
		}
		return c;
	}
}
