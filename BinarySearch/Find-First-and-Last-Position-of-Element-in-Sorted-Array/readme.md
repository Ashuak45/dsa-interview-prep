# 🧩 Problem: Find First and Last Position of Element in Sorted Array

🔗 LeetCode Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/  
🟡 Difficulty: Medium  
🏷 Topics: Array, Binary Search

---

## 📝 Problem Summary

Given a sorted integer array `nums` and a target value `target`,  
return the starting and ending position of the target.

If the target is not found in the array, return `[-1, -1]`.

The solution must run in **O(log n)** time complexity.

---

## 🧠 Intuition

Since the array is sorted, we must use **Binary Search**.

Instead of finding the target once, we need:

- First occurrence (leftmost index)
- Last occurrence (rightmost index)

This means performing **two modified binary searches**.

This is a classic:

> 🔎 Lower Bound + Upper Bound problem.

---

## 🚀 Approach

### Step 1: Search for Starting Index

- If target is found, store index.
- Continue searching in left half (`end = mid - 1`).
- This ensures we find the first occurrence.

### Step 2: Search for Ending Index

- If target is found, store index.
- Continue searching in right half (`start = mid + 1`).
- This ensures we find the last occurrence.

### Step 3: Return both indices

If target never appears, both remain `-1`.

---

## ⏱ Time Complexity

- Time: O(log n)  
  Two binary searches → still O(log n),bcoz the constant doesn't matter 

- **Space:** O(1)  
  No extra space used.

---

## ⚠️ Edge Cases Considered

- Target not present
- Array with one element
- All elements same
- Target at beginning
- Target at end




        return ans;
    }
}
