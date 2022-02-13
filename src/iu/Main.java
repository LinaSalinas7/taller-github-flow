package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	            int num=sc.nextInt();
	        int sum=0;
	        for(int i=0;i<num;i++)
	            sum+=sc.nextInt();
	        System.out.println(sum);
	        
	        sc.close();
	 
	    }

	/*public static void main(String args[]) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tam = br.readLine();
		int tamArr = Integer.parseInt(tam);
		int l = 0;
		
		while (l<tamArr) {
			String numbers = br.readLine();
			String[] arr = numbers.split(" ");
			int [] arreglo = null;
			for(int i = 0; i<arr.length;i++) {
				arreglo[i] = Integer.parseInt(arr[i]); 
			}
			simpleArraySum( tamArr,arreglo);
			l++;
			
		}
		br.close();
	}
	
	public static int simpleArraySum(int tam,int arr[]) {
		
		int result = 0;
		for(int i = 0; i<tam;i++) {
			result += arr[i] + arr[i+1];
		}
		return result;
	}*/
	
}
