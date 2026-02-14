# 🧩 Problem: Number of Good Pairs

🔗 LeetCode Link: https://leetcode.com/problems/number-of-good-pairs/  
🟢 Difficulty: Easy  
🏷 Topics: Array, HashMap

---

## 📝 Problem Summary

Given an array of integers `nums`, return the number of **good pairs**.

A pair `(i, j)` is called good if:

- nums[i] == nums[j]
- i < j

---

## 🧠 Intuition

We need to count how many times the same number appears at different indices.

Brute force idea:
- Compare every pair `(i, j)` where `j > i`
- If values are equal → increment count

---

## 🚀 Approach (Brute Force)

1. Initialize `count = 0`.
2. Use two nested loops:
   - Outer loop → `i`
   - Inner loop → `j = i + 1`
3. If `nums[i] == nums[j]`, increment count.
4. Return count.

---

## ⏱ Time Complexity (Brute Force)

- **Time:** O(n²)
- **Space:** O(1)

---

