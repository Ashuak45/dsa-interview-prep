# 🧩 Problem: Jump Game

🔗 LeetCode Link: https://leetcode.com/problems/jump-game/  
🟡 Difficulty: Medium  
🏷 Topics: Array, Greedy

---

## 📝 Problem Summary

You are given an integer array `nums` where each element represents the maximum jump length at that position.

Return `true` if you can reach the last index, otherwise return `false`.

---

## 🧠 Intuition

Instead of trying all possible jumps, we keep track of the farthest index we can reach while traversing the array.

If at any point the current index is greater than the farthest reachable index, it means we cannot proceed further.

This makes it a Greedy problem.

---

## 🚀 Approach

1. Initialize `farthest = 0`.
2. Traverse from index `0` to `n-1`.
3. If `i > farthest`, return `false`.
4. Update `farthest = max(farthest, i + nums[i])`.
5. If loop completes, return `true`.

---

## ⏱ Time Complexity

- Time: O(n)
- Space: O(1)

---

