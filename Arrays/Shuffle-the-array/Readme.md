# 🧩 Problem: Shuffle the Array

🔗 LeetCode Link: https://leetcode.com/problems/shuffle-the-array/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Simulation

---

## 📝 Problem Summary

Given an array `nums` consisting of `2n` elements in the form:

[x1, x2, ..., xn, y1, y2, ..., yn]

Return the array in the form:

[x1, y1, x2, y2, ..., xn, yn]

---

## 🧠 Intuition

The array is split into two halves:

- First half → x1 to xn
- Second half → y1 to yn

We need to interleave them.

For every index `i` from `0` to `n - 1`:

- Place `nums[i]` at position `2 * i`
- Place `nums[i + n]` at position `2 * i + 1`

So we construct the answer by jumping in steps of 2.

---

## 🚀 Approach

1. Create a new array of size `2 * n`.
2. Loop from `i = 0` to `n - 1`.
3. Assign:
   - ans[2 * i] = nums[i]
   - ans[2 * i + 1] = nums[i + n]
4. Return the result.

---

## ⏱ Time Complexity

- **Time:** O(n)
- **Space:** O(n)

---

## ⚠️ Edge Cases Considered

- n = 1
- All elements same
- Minimum input size
- Large values

---

