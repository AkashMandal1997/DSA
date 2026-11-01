// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {

//         Map<Character, Integer> map1 = new HashMap<>();
//         Map<Character, Integer> map2 = new HashMap<>();

//         for (int i = 0; i < ransomNote.length(); i++) {
//             map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
//         }

//         for (int i = 0; i < magazine.length(); i++) {
//             map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
//         }

//         // for (Character key : map1.keySet()) {

//         //     if( !map2.containsKey(key)){
//         //         return false;
//         //     }

//         //     if(map1.get(key) > map2.get(key)){
//         //         return false;
//         //     }
//         // }

//         for (char ch : map1.keySet()) {
//             if (map2.getOrDefault(ch, 0) < map1.get(ch)) {
//                 return false;
//             }

//         }

//         return true;
//     }
// }



class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Use characters required by ransomNote
        for (char ch : ransomNote.toCharArray()) {

            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}