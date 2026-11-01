class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (Character key : map1.keySet()) {

            if( !map2.containsKey(key)){
                return false;
            }

            if(map1.get(key) > map2.get(key)){
                return false;
            }
        }

        return true;
    }
}