# 🧩 Problem: Rotate Array

🔗 LeetCode Link: https://leetcode.com/problems/rotate-array/  
🟡 Difficulty: Medium  
🏷 Topics: Array, Two Pointers

---

## 📝 Problem Summary

Given an integer array `nums`, rotate the array to the right by `k` steps.

Example:

Input: nums = [1,2,3,4,5,6,7], k = 3  
Output: [5,6,7,1,2,3,4]

---

## 🧠 Intuition

If we rotate right by `k`:

- Element at index `i` moves to `(i + k) % n`.

Since array is circular, we use modulo to wrap around.

---

## 🚀 Approach (Using Extra Array)

1. Compute `k = k % n` to handle large k.
2. Create temporary array `temp`.
3. For each index `i`:
   - Place `nums[i]` at `(i + k) % n` in `temp`.
4. Copy `temp` back into `nums`.


sometimes getting to the solution is more important than following the right approach to that particular ques....will update it later fs
---

## ⏱ Time Complexity

- **Time:** O(n)
- **Space:** O(n)

---
