package com.BattingAverage; 

import java.util.Scanner;

public class BattingAverage {

	
	
	public static void main(String[] args) {
		
		System.out.println("***Welcome to Justin's Batting Average Calculator***");
		System.out.println();
		System.out.println("How many at-bats?");
		Scanner sc = new Scanner(System.in);
	    int atBats = sc.nextInt();
	    System.out.println("How many singles?");
	    int singles = sc.nextInt();
	    System.out.println("How many doubles?");
	    int doubles = sc.nextInt();
	    System.out.println("How many triples?");
	    int triples = sc.nextInt();
	    System.out.println("How many home runs?");
	    int hommers = sc.nextInt();
	    
	    double hits = (singles + doubles + triples + hommers);
	    double battingAvg = (hits/atBats);
	    double totalBases = (singles + (doubles* 2) + (triples * 3) + (hommers* 4));
	    double sluggingPct = (totalBases/atBats);
	    String batAvg = String.format("%.3f", battingAvg);
	    String slugPct = String.format("%.3f", sluggingPct);
	    
	    System.out.println("Your batting average is: " + batAvg);
	    System.out.println("Your slugging percentage is: " + slugPct);
	 
	    
	    System.out.println("**Here are your batting statistics**");

	}
	

}
