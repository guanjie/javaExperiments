package chapter10;

public class Q5 {
	public static void checkingIndex(String[] strs, String str){
		//Outter Layer. Inputting the strings' first and last int.
		int first = 0;
		int last = strs.length-1;
		
		System.out.println(searchStrings(strs, str, first, last));
		
	}
	
	
	public static int searchStrings(String[] strs, String str, int first,int last){
		//find mid--need to modify mid.
		int mid = (first+last)/2;
		if(strs[mid].isEmpty()){//mid is empty, find the closest mid that has value.
			int leftRunning = mid;
			int rightRunning = mid;
			while(true){
				if(!strs[leftRunning].isEmpty()&&(leftRunning)>=0){
					mid = leftRunning;
					break;
				}
				else if(!strs[rightRunning].isEmpty()&&(rightRunning)<=last){
					mid = rightRunning;
					break;
				}
				leftRunning--;
				rightRunning++;
				if(leftRunning<0&&rightRunning>last) break;//break out while if earches are over.
			}
			if(strs[mid].isEmpty()) return -1;//if still is empty, this whole strs are ""s.
		} 
		
		//mid now has contents! remember that this part doesn't need else from previos if.
		if(strs[mid]==str) return mid;
		else if(strs[mid].compareTo(str)==-1){//str bigger, search right branch
			return searchStrings(strs, str, mid+1, last);
		}
		else if(strs[mid].compareTo(str)==1){//str smaller, search left branch
			return searchStrings(strs, str, first, mid-1);
		}


		return -1;	
	}	
	
}
