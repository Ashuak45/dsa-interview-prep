# 🧩 Problem: Kids With the Greatest Number of Candies

🔗 LeetCode Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Simulation

---

## 📝 Problem Summary

You are given:

- An array `candies` where `candies[i]` is the number of candies the ith kid has.
- An integer `extraCandies`.

For each kid, determine if giving them all `extraCandies` would make them have the greatest number of candies among all kids.

Return a boolean list indicating the result for each kid.

---

## 🧠 Intuition

If we know the **maximum number of candies currently present**,  
we only need to check:

(candies[i] + extraCandies) >= max

If true → that kid *can* have the greatest number.

So the solution becomes:

1. Find the maximum candy count.
2. Compare each kid after adding extraCandies.

---

## 🚀 Approach

### Step 1: Find Maximum

Traverse the array and find the maximum value.

### Step 2: Compare After Adding Extra

For each kid:
- Check if `candies[i] + extraCandies >= max`
- Add result (`true/false`) to the answer list.

Return the list.

---

## ⏱ Time Complexity

- **Time:** O(n)  
  Two linear passes over the array.

- **Space:** O(n)  
  For storing the result list.

---

## ⚠️ Edge Cases Considered

- All kids have same candies
- Only one kid has maximum
- extraCandies = 0
- Minimum constraints

---

