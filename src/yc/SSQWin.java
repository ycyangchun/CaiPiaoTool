package yc;

public class SSQWin {
	
	static final int R = 10;//Ͷע������  6~20
	static final int G = 12;//Ͷע������  1~16
	
	static	int r = 6; //���к����� 0~6
	static	int g = 1; //���������� 0~1
	static  int zuShu ;//ע��
	
	public static void main(String arrs[]) {
		zuShu = C(R,6) * C(G ,1);
		System.out.println("ע�� ��" + zuShu +" ��"+ zuShu * 2);
		
		//һ�Ƚ� 6+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,6);
		}
		if(zuShu > 0){
			System.out.println("һ�Ƚ� ע�� ��" + zuShu +" ��A");
		} else {
			System.out.println("һ�Ƚ� ע�� ��" + zuShu +" ��0");
		}
		
		//���Ƚ� 6+0
		zuShu = 0;
		zuShu = C(r,6) * C(G-g ,1) ;
		
		if(zuShu > 0){
			System.out.println("���Ƚ� ע�� ��" + zuShu +" ��B");
		} else {
			System.out.println("���Ƚ� ע�� ��" + zuShu +" ��0");
		}
		
		
		//���Ƚ�  5+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,5) * C(R -r ,1);
		} 
		System.out.println("���Ƚ� ע�� ��" + zuShu +" ��"+ zuShu * 3000);
		
		//�ĵȽ�  4+1 ,5+0
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,4) * C(R -r ,2);
		} 
		zuShu += C(r,5) * C(R -r ,1) * C(G-g ,1) ;
		
		System.out.println("�ĵȽ� ע�� ��" + zuShu +" ��"+ zuShu * 200);
		
		
		//��Ƚ�  3+1 ,4+0
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,3) * C(R -r ,3);
		} 
		zuShu += C(r,4) * C(R -r ,2) * C(G-g ,1) ;
		
		System.out.println("��Ƚ� ע�� ��" + zuShu +" ��"+ zuShu * 10);
		
		
		//���Ƚ�  2+1 ,1+1 , 0+1
		zuShu = 0;
		if(g == 1){
			zuShu = C(r,2) * C(R -r ,4)  + C(r,1)  * C(R -r ,5) + C(r,0) * C(R -r, 6);
		}
		System.out.println("���Ƚ� ע�� ��" + zuShu +" ��"+ zuShu * 5);
		
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
