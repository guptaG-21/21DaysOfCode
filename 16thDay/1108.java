


class Solution {
	//can use any way to solve the problem
    public String defangIPaddr(String address) {
        
        return address.replace(".","[.]");

        // StringBuilder sb = new StringBuilder();
        // for(char a : address.toCharArray()){
        //     sb.append(a=='.'?"[.]":a);
        // }
        // for(char a:address.toCharArray()){
        //     if(a == "."){
        //         sb.append("[.]");
        //     }else{
        //         sb.append(a);
        //     }
        // }
        // return sb.toString();
    }
}