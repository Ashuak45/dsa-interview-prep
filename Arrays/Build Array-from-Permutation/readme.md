# 🧩 Problem: Build Array from Permutation

🔗 LeetCode Link: https://leetcode.com/problems/build-array-from-permutation/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Simulation

---

## 📝 Problem Summary

You are given a zero-based permutation `nums` (0-indexed), meaning:

- It contains distinct integers
- Values range from `0` to `n - 1`

Build an array `ans` such that:

ans[i] = nums[nums[i]]

Return the resulting array.

---

## 🧠 Intuition

Since `nums` is a valid permutation:

- Every value is a valid index.
- We can safely use `nums[i]` as an index.

For each position `i`:
1. Take `nums[i]`
2. Use that as an index again → `nums[nums[i]]`
3. Store it in `ans[i]`

This is simply double indexing.

---

## 🚀 Approach

1. Create a new array `ans` of same length.
2. Loop from `i = 0` to `n - 1`.
3. Assign:

   ans[i] = nums[nums[i]]

4. Return `ans`.

---

## ⏱ Time Complexity

- **Time:** O(n)  
  Single traversal of array.

- **Space:** O(n)  
  Extra array `ans` used.

---

## ⚠️ Edge Cases Considered

- Single element array
- Already identity permutation
- Reverse permutation

Since it's guaranteed to be a permutation:
- No out-of-bounds errors.

---
