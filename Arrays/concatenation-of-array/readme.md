# 🧩 Problem: Concatenation of Array

🔗 LeetCode Link: https://leetcode.com/problems/concatenation-of-array/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Simulation

---

## 📝 Problem Summary

Given an integer array `nums` of length `n`,  
create a new array `ans` of length `2n` such that:

- ans[i] = nums[i]
- ans[i + n] = nums[i]

for all `0 ≤ i < n`.

In simple terms:  
Return the array formed by concatenating `nums` with itself.

---

## 🧠 Intuition

We need to copy the same array twice into a new array.

If the original array has length `n`:

- First half → original elements
- Second half → same elements again

So for every index `i`:
- Put value at position `i`
- Put same value at position `i + n`

---

## 🚀 Approach

1. Let `n = nums.length`.
2. Create new array `ans` of size `2 * n`.
3. Loop from `i = 0` to `n - 1`:
   - ans[i] = nums[i]
   - ans[i + n] = nums[i]
4. Return `ans`.

---

## ⏱ Time Complexity

- **Time:** O(n)  
  Single loop over the array.

- **Space:** O(n)  
  New array of size `2n`.

---

## ⚠️ Edge Cases Considered

- Single element array
- Already symmetric array
- Large array size


