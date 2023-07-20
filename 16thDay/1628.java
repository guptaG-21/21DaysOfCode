




class Solution {
    public String interpret(String command) {
        StringBuilder se = new StringBuilder();
        for(int i =0;i<command.length();i++){
            char c = command.charAt(i);
			//checking if G occurs
            if(c == 'G'){
                se.append('G');
				//checking if () occure
            }else  if(c == '(' && command.charAt(i+1)== ')'){
                se.append('o');
                i++;
				
				// for (ab)
            }else if (c == '(' && command.charAt(i+1)=='a'){
                se.append("al");
                i+=3;
            }
        }
        return se.toString();
    }
}