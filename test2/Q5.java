package test2;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		int[] source = { 9, 12, 14, 21, 16, 13 };
		for(int i = 0 ; i<source.length;i++) {
			for(int j=i+1;j<source.length;j++) {
				if(source[i]<source[j]) {
					int temp=source[i];
					source[i]=source[j];
					source[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(source));
	}	
}