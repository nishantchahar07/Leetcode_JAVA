class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String ,  Integer> map = new HashMap<>();
        for(String i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);

        }
        int count  = 0;
        for(String i : nums){
            int suffixCount = 0;
           if(target.startsWith(i)){
            String suffix = target.substring(i.length());
            suffixCount  = map.getOrDefault(suffix , 0);
           
           if(i.equals(suffix)){
            count+= (suffixCount-1);
        }
        else{
             count+=suffixCount;
        }
           }
        }
        
        return count;
    }
}