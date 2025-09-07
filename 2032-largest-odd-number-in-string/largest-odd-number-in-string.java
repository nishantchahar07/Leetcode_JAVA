class Solution {
    public String largestOddNumber(String num) {
     int n = num.length();
     String ans = "";
     int i = n-1;
    while(i >= 0){
        if((int)num.charAt(i) % 2 != 0){
            for(int k = 0 ; k <= i ; k++){
                ans = ans+num.charAt(k);
            }
            break;
        }
            else{
                i--;
            }
    }
    
            return ans ;
    }
        }