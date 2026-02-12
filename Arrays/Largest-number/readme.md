# 🧩 Problem: Largest Number

🔗 LeetCode Link: https://leetcode.com/problems/largest-number/  
🟡 Difficulty: Medium  
🏷 Topics: Array, Sorting, Greedy, Custom Comparator

---

## 📝 Problem Summary

Given a list of non-negative integers `nums`, arrange them such that they form the **largest possible number**.

Since the result may be very large, return it as a string.

---

## 🧠 Intuition

We cannot simply sort numbers in descending order.

Example:

nums = [3, 30]

If we sort normally:
30 > 3 → wrong order.

But:

"330" > "303"

So 3 should come before 30.

### 🔑 Key Observation

For two numbers `a` and `b`:

- Compare `a + b`
- With `b + a`

Whichever combination forms a larger number should come first.

This is a classic **custom comparator sorting problem**.

---

## 🚀 Approach

1. Convert all integers to strings.
2. Sort the string array using a custom comparator:
   - Compare `(b + a)` with `(a + b)`
3. If the first element is `"0"`, return `"0"` (handles cases like `[0,0]`).
4. Append all strings to build the final result.
5. Return the final string.

---

## ⏱ Time Complexity

- **Time:** O(n log n × k)  
  - Sorting takes O(n log n)
  - Each comparison may take up to O(k) string operations  
  (k = average digit length)

- **Space:** O(n)  
  For string array and result builder.

---

## ⚠️ Edge Cases Considered

- All zeros → `[0, 0]` → return `"0"`
- Single element array
- Large numbers
- Different digit lengths

---

