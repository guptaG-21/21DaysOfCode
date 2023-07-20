


class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for(int i =0;i<indices.length;i++){
			//getting the index
            int num = indices[i];
			//shiffling it
            ans[num] = s.charAt(i);
        }
        return new String(ans);
    }
}