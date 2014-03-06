package chapter9;

import java.util.HashMap;

public class Q1 {

	//Recursion
	public static int runningSteps(int n){
		if ( n==0 ) {
			return 1;
		}
		else if ( n <0 ) {
			return 0;
		}
		else 
			return runningSteps(n-1)+runningSteps(n-2)+runningSteps(n-3);
	}
	
	//Using DP
	public static int runningStepsDP(int n, HashMap<Integer, Integer> map){
		if (map.containsKey(n)) return map.get(n);
		
		int value = 0;
		if (n==0) return 1;
		else if ( n<0 ) return 0;
		
		value = runningStepsDP(n-1, map)+runningStepsDP(n-2, map)+runningStepsDP(n-3, map);
		map.put(n, value);
		return value;
		
	}
}
