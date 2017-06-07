import java.util.ArrayList;
import java.util.List;
//2017-3-30
public class EliminationGame {
	public int lastRemaining(int n) {
		int s = 1, d = 1;
		for(int i = 1; n>0;i++){
			if(n==0||n==1) return s;
			if(n==2||n==3) return (int) (s+d);
			if(n%4==0||n%4==1){s += d; d= (int) Math.pow(4, i);}
			else if(n%4==2||n%4==3){s += 3*d; d = (int) Math.pow(4, i);}
			n/=4;
		}
		return s;
//		List<Integer> list = new ArrayList<>();
//		for(int i = 1; i <= n; i++){
//			list.add(i);
//		}
//		for(int mm : list) System.out.print(mm+" ");
//		System.out.println();
//		while(list.size()>1){
//			for(int i = 0; i < list.size()&&list.size()>1; i++){
//				list.remove(i);
//			}
//			for(int mm : list) System.out.print(mm+" ");
//			System.out.println();
//			if(list.size()>1){
//				int m = list.size()-1;
//				for(int i = m; i >=0; i-=2){
//					list.remove(i);
//				}
//				for(int mm : list) System.out.print(mm+" ");
//				System.out.println();
//			}
//			
//		}
//		
//		return list.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EliminationGame test = new EliminationGame();
		int res = test.lastRemaining(5);
		System.out.println(res);
	}

}
