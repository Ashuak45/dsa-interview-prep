# 🧩 Problem: How Many Numbers Are Smaller Than the Current Number

🔗 LeetCode Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Sorting, HashMap

---

## 📝 Problem Summary

Given an array `nums`, for each element `nums[i]`,  
find how many numbers in the array are strictly smaller than it.

Return the result as an array.

---

## 🧠 Intuition (Brute Force)

For each number:

- Compare it with every other number.
- Count how many are smaller.

This guarantees correctness but is not efficient.

---

## 🚀 Approach (Brute Force)

1. Create a result array `count`.
2. For each index `i`:
   - Initialize counter `c = 0`
   - Loop through all elements `j`
   - If `nums[i] > nums[j]`, increment `c`
3. Store `c` in `count[i]`
4. Return the array.

---

## ⏱ Time Complexity (Brute Force)

- **Time:** O(n²)
- **Space:** O(n)

---

