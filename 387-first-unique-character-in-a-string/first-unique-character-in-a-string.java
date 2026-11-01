class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char k = s.charAt(i);

            map.put( k , map.getOrDefault( k ,0 )+1);

            // if (map.containsKey(k)) {
            //     map.put(k, map.get(k) + 1);
            // } else {
            //     map.put(k, 1);
            // }
        }

        

        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;

        }

        return -1;
    }
}