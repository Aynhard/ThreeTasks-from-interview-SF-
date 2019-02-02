package ScaleFocus;

import java.util.Arrays;
import java.util.Scanner;

public class Hotels {

	public static void main(String[] args) {
		int n;
		int m;
		int [] hotels;
		boolean flag=false;
		int sum=0;
		int total=0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			n = s.nextInt();
			m = s.nextInt();
		}while((n<=1 || n>=300000) || (m<=1 || m>=Math.pow(2, 31)) );
		
		hotels = new int[n];
		do {
			flag=false;
		for(int i=0; i<n;i++) {
			hotels [i]=s.nextInt();
			if(hotels[i]<=0 || hotels[i]>=Math.pow(10, 6)) {
				flag=true;
				break;
			}
		}
		}while(flag);
		
		Arrays.sort(hotels);
		for(int i=(hotels.length-1);i>0;i--) {
			sum=hotels[i];
			for(int j=i-1;j>=0;j--) {
				sum +=hotels[j];
				if(sum<=m ) {
					if(sum>total) {
						total=sum;
					}
				}else {
					break;
				}
			}
		}
		System.out.println(total);
	}

}
