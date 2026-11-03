class Solution {
    public List<String> generateParenthesis(int n) {

        StringBuilder current = new StringBuilder();
        List<String> result = new ArrayList<>();
        backtrack(n, 0 , 0 , current, result);
        return result;

    }

    static void backtrack(
            int n,
            int open,
            int close,
            StringBuilder current,
            List<String> result) {

        // 1. Base condition
        if (open == n && close == n) {
            result.add(current.toString());
            return;

        }

        // 2. Add opening bracket
        if (open < n) {
            current.append('(');
            backtrack(n, open + 1, close, current, result);
            current.deleteCharAt(current.length() - 1); // 3. Undo opening bracket (backtracking)
        }

        // 4. Add closing bracket
        if (close < open) {
            current.append(')');
            backtrack(n, open, close + 1, current, result);
            current.deleteCharAt(current.length() - 1); // 5. Undo closing bracket (backtracking)
        }

    }
}