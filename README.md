# january1_2025
The problem that i solved today in leetcode
LeetCode Daily Challenge - January 1, 2025
Problem: Max Score After Splitting a String
Given a binary string s, you are required to split the string into two non-empty substrings (left and right) and maximize the score by summing up the number of 0s in the left substring and the number of 1s in the right substring.

Solution (Java)
The following code efficiently computes the maximum score after splitting the string:

java
Copy code
class Solution {
    public int maxScore(String s) {
        int i, j, n = s.length();
        int one = 0, zero = 0;
        
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }
        }
        
        int max = 0;
        int o = 0, z = 0;
        
        for (i = 1; i < n; i++) { // Start from 1 to ensure both substrings are non-empty
            String l = s.substring(0, i);
            o = 0;
            z = 0;
            for (j = 0; j < l.length(); j++) {
                if (l.charAt(j) == '1') {
                    o++;
                } else {
                    z++;
                }
            }
            max = Math.max(max, z + (one - o));
        }
        
        return max;
    }
}
Performance
Runtime: 7ms (Beats 18.78% of submissions)
Memory: 43.26MB (Beats 9.18% of submissions)
