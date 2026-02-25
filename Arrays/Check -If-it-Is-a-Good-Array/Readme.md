# 🧩 Problem: Check If It Is a Good Array

🔗 LeetCode Link: https://leetcode.com/problems/check-if-it-is-a-good-array/  
🔴 Difficulty: Hard  
🏷 Topics: Math, Number Theory, GCD

---

## 📝 Problem Summary

You are given an array of positive integers `nums`.

The array is considered **good** if it is possible to select some subset of elements and multiply each element by any integer such that their sum becomes exactly `1`.

Return `true` if the array is good, otherwise return `false`.

---

## 🧠 Intuition

This problem is based on a key number theory concept:

An array is "good" **if and only if** the GCD (Greatest Common Divisor) of all elements is `1`.

Why?

From Bézout’s Identity:

If `gcd(a1, a2, ..., an) = 1`,  
then there exist integers x1, x2, ..., xn such that:

a1*x1 + a2*x2 + ... + an*xn = 1

So if overall GCD is 1 → answer is true.  
Otherwise → impossible.

---

## 🚀 Approach

1. Initialize `gcdValue` as the first element.
2. Compute GCD of all elements in the array:
3. If final `gcdValue == 1`, return `true`.
4. Otherwise return `false`.

GCD is computed using the **Euclidean Algorithm**.

---

## ⏱ Time Complexity

- Time: O(n log M)  
Where:
- n = number of elements  
- M = maximum value in array  

- Space: O(1)

---

## ⚠️ Edge Cases Considered

- Single element array
- Large numbers
- All elements same
- GCD greater than 1

---
