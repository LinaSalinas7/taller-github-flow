package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	
	public static void main(String args[]) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tam = br.readLine();
		int tamArr = Integer.parseInt(tam);
		
		String numbers = br.readLine();
		String[] arr = numbers.split(" ");
		int [] arreglo = new int[tamArr];
		
		for(int i = 0; i<arr.length;i++) {
			arreglo[i] = Integer.parseInt(arr[i]); 
		}
		System.out.println(simpleArraySum( tamArr,arreglo));
			
		
		br.close();
	}
	
	public static int simpleArraySum(int tam,int arr[]) {
		
		int result = 0;
		for(int i = 0; i<tam;i++) {
			result += arr[i];
		}
		return result;
	}
	
}
