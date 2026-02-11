# 🧩 Problem: Peak Index in a Mountain Array

🔗 LeetCode Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/  
🟡 Difficulty: Medium  
🏷 Topics: Array, Binary Search

---

## 📝 Problem Summary

A mountain array is defined as:

- Strictly increasing
- Then strictly decreasing

Given a mountain array `arr`, return the index of the peak element.

---

## 🧠 Intuition

In a mountain array:

- Left side → increasing
- Right side → decreasing
- The peak is where the trend changes

Instead of scanning linearly (O(n)), we use **Binary Search**.

Key observation:

If `arr[mid] < arr[mid + 1]`,  
we are in the increasing part → move right.

If `arr[mid] > arr[mid + 1]`,  
we are in the decreasing part → move left.

We keep narrowing the search space until `start == end`.

That index is the peak.

---

## 🚀 Approach(binary search universal method as given array is sorted)

1. Initialize `start = 0`, `end = n - 1`.
2. While `start < end`:
   - Compute `mid`.
   - If `arr[mid] < arr[mid + 1]`:
     - Move right → `start = mid + 1`
   - Else:
     - Move left → `end = mid`
3. When loop ends:
   - `start == end`
   - This is the peak index.

---

## ⏱ Time Complexity

- **Time:** O(log n)  
  Binary search reduces search space each step.

- **Space:** O(1)  
  No extra space used.

---

## ⚠️ Edge Cases Considered

- Smallest valid mountain array
- Peak at middle
- Strictly increasing then strictly decreasing guaranteed
- No need to check boundaries separately due to loop condition



