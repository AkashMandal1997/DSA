class Solution {
    public int longestPalindrome(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
       
       int sum = 0;
       boolean odd = false;

       for( int val : map.values()){
        if(val % 2 == 0){
            sum = sum + val;
        }else{
            sum += val - 1;
            odd=true;
        }
       }

        // for(Map.Entry<Character,Integer> entry : map.entrySet()){
           
        //     if(entry.getValue()%2==0){
        //          sum = sum + entry.getValue();
        //     }else{
        //          odd=true;
        //          sum = sum +  entry.getValue() - 1;
        //     }
        // }

     //if(map.containsKey()==1) return sum+1;


     return (odd)?sum+1:sum;
    }
}