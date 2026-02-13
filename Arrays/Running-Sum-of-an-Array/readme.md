# 🧩 Problem: Running Sum of 1D Array

🔗 LeetCode Link: https://leetcode.com/problems/running-sum-of-1d-array/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Prefix Sum

---

## 📝 Problem Summary

Given an array `nums`, compute its running sum such that:

runningSum[i] = nums[0] + nums[1] + ... + nums[i]

Return the resulting array.

---

## 🧠 Intuition

The running sum at index `i` depends on:

- The running sum at index `i - 1`
- Plus the current element `nums[i]`

So instead of recomputing the sum every time,
we build it incrementally.

This is the basic idea of **Prefix Sum**.

---

## 🚀 Approach

1. Create a new array `runningSum` of same length.
2. Set:
   - runningSum[0] = nums[0]
3. Loop from `i = 1` to `n - 1`:
   - runningSum[i] = runningSum[i - 1] + nums[i]
4. Return the array.

---

## ⏱ Time Complexity

- **Time:** O(n)  
  Single traversal of array.

- **Space:** O(n)  
  Extra array used.

---

## ⚠️ Edge Cases Considered

- Single element array
- Negative numbers
- Large values
- All elements same

---

