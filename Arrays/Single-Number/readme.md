# 🧩 Problem: Single Number

🔗 LeetCode Link: https://leetcode.com/problems/single-number/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Bit Manipulation

---

## 📝 Problem Summary

Given a non-empty array of integers `nums`, every element appears twice except for one.  
Find that single element.

The solution should ideally run in linear time and constant extra space.

---

## 🧠 My Initial Approach (Brute Force)

Since every number appears twice except one,  
I compared each element with every other element:

- If a duplicate is found → ignore it.
- If no duplicate exists → return that number.

This approach works but is inefficient.

---

##  Brute Force Approach

1. Loop through each element.
2. For each element, compare with all other elements.
3. If no duplicate is found → return it.
4. If nothing found → return -1 (fallback).

---

## ⏱ Time Complexity (Brute Force)

- **Time:** O(n²)
- **Space:** O(1)

--

ofc i m gonna change this when i learn new concept...marking it for future

