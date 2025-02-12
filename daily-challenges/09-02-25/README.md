## Daily Challenges

### Day 9 ( 09 FEB 2025)

1. **Problem 1: Remove Outermost Parentheses**
   - **Problem Statement:** 
   
   ````
   A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

   For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
   A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

   Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

   Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

   Input: s = "(()())(())"
   Output: "()()()"
   Explanation: 
   The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
   After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

   ````
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/remove-outermost-parentheses/)
---

2. **Problem 2: Reverse Words in a String**
   - **Problem Statement:** 
   
   ```
   Given an input string s, reverse the order of the words.

   A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

   Return a string of the words in reverse order concatenated by a single space.

   Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

   Input: s = "  hello world  "
   Output: "world hello"
   Explanation: Your reversed string should not contain leading or trailing spaces.

   ```
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/reverse-words-in-a-string/description/)
---

3. **Problem 3: Largest Odd Number in String**
   - **Problem Statement:** 
   
   ````
   You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

   A substring is a contiguous sequence of characters within a string.

   Input: num = "52"
   Output: "5"
   Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

   ````
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/largest-odd-number-in-string/description/)
   
---