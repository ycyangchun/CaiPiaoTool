package yc;

public class SSQWinDT {
	
	static  int RD = 2;//Ͷע������  �� 1~5  == D
	static  int RT = 18;//Ͷע������  �� 1~20
	static  int G = 15;//Ͷע������ 1~16
	
	static	int rd = 2; //���к�����  ��  0 ~ D
	static	int rt = 3; //���к�����  ��  0 ~ 6-D
	static	int g = 1; //���������� 0~1
	

	static  int t,wint;//��Ҫ���������������и���
	static  int zuShu;//ע��
	
	public static void main(String arrs[]) {
		
		zuShu = C(RT ,6 - RD) * C(G ,1);
		System.out.println("ע�� ��" + zuShu +" ��"+ zuShu * 2);
		
		t = 6 -RD;
		int W[] = new int[]{0,0,0,0,0,0};
		String arrTAG;
		int arr;
		if(t == rt){
			wint = t;
		} else {
			wint = rt;
		}
		if(wint != 0){
			for(int i = 0; i <= t ; i++){
				arrTAG = (rd+i)+"+";
				arr = C(wint,i) * C(RT -wint, t -i) * C(G, 1);
				setWin(W, arrTAG, arr);
			}
		}else {
			arrTAG = (rd)+"+";
			arr = C(RT -wint, t) * C(G, 1);
			setWin(W, arrTAG, arr);
		}
		
		for(int i=0 ; i< 6; i++){
			System.out.println("===> "+(i+1)+" ע�� ��" +W[i]);
		}
	
		
	}

	private static void setWin(int[] W, String arrTAG, int arr) {
		System.out.println(arrTAG+" ע�� ��" +arr);
		if("6+".equals(arrTAG)){
			if(g ==1){
				W[0] = arr / C(G, 1);
				W[1] = arr - W[0];
			} else {
				W[1] = arr;
			}
			
		} else if("5+".equals(arrTAG)){
			if(g ==1){
				W[2] += arr / C(G, 1);
				W[3] += arr - W[2];
			} else {
				W[3] += arr;
			}
		} else if("4+".equals(arrTAG)){
			if(g ==1){
				W[3] += arr / C(G, 1);
				W[4] += arr - W[3];
			} else {
				W[4] += arr;
			}
		} else if("3+".equals(arrTAG)){
			if(g ==1){
				W[4] += arr/ C(G, 1);
			}
		} else if("2+".equals(arrTAG)){
			if(g ==1){
				W[5] += arr/ C(G, 1);
			}
		} else if("1+".equals(arrTAG)){
			if(g ==1){
				W[5] += arr/ C(G, 1);
			}
		} else if("0+".equals(arrTAG)){
			if(g ==1){
				W[5] += arr/ C(G, 1);
			}
		}
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
