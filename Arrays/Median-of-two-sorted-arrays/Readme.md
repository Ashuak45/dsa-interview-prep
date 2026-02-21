# 🧩 Problem: Median of Two Sorted Arrays

🔗 LeetCode Link: https://leetcode.com/problems/median-of-two-sorted-arrays/  
🔴 Difficulty: Hard  
🏷 Topics: Array, Binary Search, Divide and Conquer

---

## 📝 Problem Summary

Given two sorted arrays `nums1` and `nums2`, return the median of the two sorted arrays.

The overall time complexity should ideally be **O(log (m + n))**.

---

## 🧠 Intuition

The simplest way to solve this problem:

1. Merge both arrays into a single array.
2. Sort the merged array.
3. Compute the median based on total length.

Although this works, it does **not meet the optimal time complexity requirement** of O(log(m+n)).

This solution is a straightforward merge + sort approach.

---

## 🚀 Approach (Brute Force)

1. Create a new array of size `nums1.length + nums2.length`.
2. Copy elements from both arrays.
3. Sort the combined array.
4. If total length is odd:
   - Return middle element.
5. If even:
   - Return average of the two middle elements.

---

## ⏱ Time Complexity

- Time: O((m + n) log (m + n))  
  (Due to sorting)

- Space: O(m + n)  
  (For merged array)

---

## ⚠️ Important Note

This solution is correct but **not optimal**.

The optimal solution uses:
- Binary Search
- Partition logic
- Runs in O(log(min(m, n)))

That version is typically expected in high-level interviews.

---

