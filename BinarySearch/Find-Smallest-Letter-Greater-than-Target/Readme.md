# 🧩 Problem: Find Smallest Letter Greater Than Target

🔗 LeetCode Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/  
🟡 Difficulty: Easy  
🏷 Topics: Array, Binary Search

---

## 📝 Problem Summary

Given a sorted character array `letters` and a target character `target`,  
return the smallest character in the array that is strictly greater than `target`.

If no such character exists, return the first character in the array  
(i.e., the array is circular).

---

## 🧠 Intuition

Since the array is sorted, we can apply **Binary Search**.

We are not looking for equality —  
we are looking for the **smallest element strictly greater than target**.

This is a classic:

> 🔎 "Upper Bound" problem.

If we go beyond the last index, we wrap around to index `0`.

---

## 🚀 Approach

1. Initialize `left = 0` and `right = n - 1`.
2. Perform binary search:
   - If `letters[mid] > target`,  
     move `right = mid - 1` (we try to find a smaller valid candidate).
   - Else, move `left = mid + 1`.
3. After the loop:
   - `left` will point to the smallest valid character.
4. Use modulo operation to handle wrap-around:
   `letters[left % letters.length]`

---

## ⏱ Time Complexity

- **Time:** O(log n)  
  Binary search halves the search space each iteration.

- **Space:** O(1)  
  No extra space used.

---

## ⚠️ Edge Cases Considered

- Target greater than all characters → wrap to first element.
- Target equal to last element.
- Single element array.
- Multiple duplicate characters.

---

## 💻 Implementation (Java)

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;   // try to find smaller valid character
            } else {
                left = mid + 1;
            }
        }

        return letters[left % letters.length];
    }
}
