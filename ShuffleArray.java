package cloudvandhana;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key value to shuffle it from there :");
		int n = sc.nextInt();
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i] = a[n++];
			if(n==a.length) {
				n=0;
			}
		}
		for(int i:b) {
			System.out.print(i+" ");
		}

	}

}
