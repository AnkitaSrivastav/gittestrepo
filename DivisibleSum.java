import java.util.Scanner;


public class Solution {

	public static void main(String args[]){
		
		int n,k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		int[] arr = new int[n];
		for(int r =0;r<n;r++)
			arr[r] = in.nextInt();
		int ctr=0;
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<j){
					int temp = arr[i]+arr[j];
					
					if(temp%k==0){
						ctr++;
					}
				}
			}
		}
		System.out.println(ctr);
		
	}
}
