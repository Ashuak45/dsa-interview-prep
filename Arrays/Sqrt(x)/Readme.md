# 🧩 Problem: Sqrt(x)

🔗 LeetCode Link: https://leetcode.com/problems/sqrtx/  
🟡 Difficulty: Easy  
🏷 Topics: Math, Binary Search

---

## 📝 Problem Summary

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

You are not allowed to use built-in exponent functions like `Math.sqrt()`.

---

## 🧠 Intuition

We need the integer part of √x.

Instead of checking every number from 1 to x (which would be slow),  
we can apply **Binary Search** because:

If `mid * mid`:

- equals `x` → exact answer
- less than `x` → move right
- greater than `x` → move left

We store the last valid value whose square is less than `x`.

---

## 🚀 Approach

1. If `x < 2`, return `x`.
2. Set:
   - `left = 1`
   - `right = x / 2`
3. While `left <= right`:
   - Compute `mid`
   - If `mid * mid == x`, return `mid`
   - If `mid * mid < x`:
     - Store `mid` as possible answer
     - Move right (`left = mid + 1`)
   - Else:
     - Move left (`right = mid - 1`)
4. Return stored answer.

We cast to `long` to prevent integer overflow.

---

## ⏱ Time Complexity

- Time: O(log x)
- Space: O(1)

---

## ⚠️ Edge Cases Considered

- x = 0
- x = 1
- Large values of x
- Overflow when squaring (handled using long)

---

## 💻 Implementation (Java)

```java
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) {
                return mid;
            }

            if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
