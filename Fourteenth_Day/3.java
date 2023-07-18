
/*
que-> 3 Longest Substring without repeating character
approach-> simply use two pointer where we will use hashset to store the distict values of substring 
		first pointer will add the values to hashset it it contains then the other pointer will be used to remove the element,
		another variable is used to store max value of substring
*/
			
Class Solution {
	puclic int LongSubString(String str){
		int i=0,j=0,max=0;
		//store the distint values 
		HashSet<Integer> hs = new HashSet<>();
		while(i<str.length()){
			//if hs contains the value we will remove the first one
			if(hs.contains(str.chharAt(i))){
				hs.remove(str.chharAt(j));
				j++;
			}else{
				//otherwise add to the hashset
				hs.add(str.chharAt(i));
				max = Math.max(max,hs.size());
				i++;
			}
		}
		//returned the collected max value
		return max;
	}
}
			
			