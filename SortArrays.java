package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SortArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Digite o tamanho N da Array: ");
		n=input.nextInt();
		Integer[] numbers = new Integer[n];
		int[] div_3 = new int[n];
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
		
		System.out.print("Digite o " + (i+1) + "º" + " valor da array: ");
		numbers[i] = input.nextInt();
		div_3[i]=numbers[i];
		}
		
		System.out.println("\n");
		
		System.out.printf("A array foi digitada na seguinte ordem : %s", Arrays.toString(numbers));
		System.out.println();
		
//		Numeros da Array que são divisíveis por 3
		
		int count=0;
		for(int j : numbers) {
			if(j%3==0) {
				count++;}
			
		}
				System.out.println("");
				
				System.out.println("A quantidade de numeros divisíveis por 3 é: " + count +" e a array é: " + Arrays.toString((IntStream.of(div_3).filter(x->x%3==0).toArray())));
				
				
		System.out.println("\n");
		Arrays.sort(numbers);
		
		System.out.printf("A array em ordem crescente : %s", Arrays.toString(numbers));
		System.out.println();
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.printf("A array em ordem decrescente : %s", Arrays.toString(numbers));
		System.out.println();
		
//		System.out.println(Arrays.toString((IntStream.of(div_3).filter(x->x%3==0).toArray())));


	
		
		input.close();
	}

}
	

