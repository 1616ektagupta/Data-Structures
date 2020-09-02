package com.newgen.ds.array;

//To find prime numbers between 0 to n
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		int n =20;
		boolean prime[] = new boolean[n+1];
		
		for(int i=0 ; i<prime.length; i++){
			prime[i] = true;
		}
		
		for(int p=2; p*p <= n ; p++){ //Upto square root of n 
			
			if(prime[p] == true){ //if p is true the it is a prime number 
				
				for(int i=p*2; i <= n ; i += p){ //Make divisible of p as false
					prime[i] = false;
				}
			}
		}

		for(int i=0 ; i<prime.length; i++){
			if(prime[i] == true){
				System.out.print(i + " ");
			}
		}
	}

}
