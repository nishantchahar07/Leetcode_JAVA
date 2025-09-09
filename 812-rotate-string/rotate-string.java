class Solution {
    public boolean rotateString(String str, String goal) {
       for(int i = 0 ; i < str.length() ; i++){
           String s1 = str.substring(0 , i);
            String s2 = str.substring(i);
            if((s2+s1).equals(goal))return true;
       }
       return false;
    }
}