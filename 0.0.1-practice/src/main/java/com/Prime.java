package com;

public class Prime {
	
	boolean checkPrime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		Prime p = new Prime();
		boolean sol=p.checkPrime(8);
		
		
	}

}
