import java.io.*;
import java.util.*;
public class prime_factors{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		//LinkedList<Integer> factors=new LinkedList<Integer>();
		int n=in.nextInt();
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				int count=0;
				while(n%i==0){
					n=n/i;
					count++;
				}
				System.out.print(i+"^"+count+",");
			}
		}
		if(n!=1)
		System.out.print(n);
	}
}