class Solution {
    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int b = map.getOrDefault('b', 0) / 1;
        int a = map.getOrDefault('a', 0) / 1;

        int count = Math.min(b, a);

        int l = map.getOrDefault('l', 0) / 2;

        count = Math.min(count, l);
        int o = map.getOrDefault('o', 0) / 2;
        count = Math.min(count, o);
        int n = map.getOrDefault('n', 0) / 1;
        count = Math.min(count, n);

        return count;

        //  return Collections.min(Arrays.asList(b, a, l, o, n));

        // while (map.getOrDefault('b', 0) >= 1 &&
        //         map.getOrDefault('a', 0) >= 1 &&
        //         map.getOrDefault('l', 0) >= 2 &&
        //         map.getOrDefault('o', 0) >= 2 &&
        //         map.getOrDefault('n', 0) >= 1) {
        //     count++;

        //     map.put('b', map.get('b') - 1);
        //     map.put('a', map.get('a') - 1);
        //     map.put('l', map.get('l') - 2);
        //     map.put('o', map.get('o') - 2);
        //     map.put('n', map.get('n') - 1);
        // }

        // return count;

    }
}