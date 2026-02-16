# 🧩 Problem: Add Binary

🔗 LeetCode Link: https://leetcode.com/problems/add-binary/  
🟢 Difficulty: Easy  
🏷 Topics: String, Math, Simulation

---

## 📝 Problem Summary

Given two binary strings `a` and `b`,  
return their sum as a binary string.

You must simulate binary addition manually (like we do on paper).

---

## 🧠 Intuition

Binary addition follows simple rules:

- 0 + 0 = 0
- 1 + 0 = 1
- 1 + 1 = 0 (carry 1)
- 1 + 1 + 1 = 1 (carry 1)

Since addition happens from right to left,  
we traverse both strings from the end.

We maintain:

- Two pointers (i, j)
- A carry variable

This is just digit-by-digit simulation.

---

## 🚀 Approach

1. Initialize:
   - `i = a.length() - 1`
   - `j = b.length() - 1`
   - `carry = 0`
2. While either string has digits left or carry exists:
   - Add carry to sum.
   - If `i >= 0`, add `a[i]`.
   - If `j >= 0`, add `b[j]`.
   - Append `(sum % 2)` to result.
   - Update carry = `sum / 2`.
3. Reverse the result.
4. Return final string.

---

## ⏱ Time Complexity

- **Time:** O(max(n, m))  
  We traverse both strings once.

- **Space:** O(max(n, m))  
  For the result string.

---

## ⚠️ Edge Cases Considered

- Different length strings
- Final carry remains
- One string is "0"
- Both strings are "0"

---


