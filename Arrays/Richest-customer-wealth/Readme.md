# 🧩 Problem: Richest Customer Wealth

🔗 LeetCode Link: https://leetcode.com/problems/richest-customer-wealth/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Matrix, Simulation

---

## 📝 Problem Summary

You are given an `m x n` integer grid `accounts` where:

- `accounts[i][j]` represents the amount of money the `i-th` customer has in the `j-th` bank.

A customer's total wealth is the sum of money across all their bank accounts.

Return the maximum wealth among all customers.

---

## Intuition

Each row in the matrix represents one customer.  
To find the richest customer:

- Calculate the sum of each row.
- Track the maximum row sum.

This is a straightforward 2D array traversal problem.

---

## Approach

1. Initialize a variable `max = 0`.
2. Traverse each row (customer).
3. For each row:
   - Calculate the sum of elements in that row.
4. Compare the row sum with `max`.
5. Update `max` if current sum is larger.
6. Return `max`.

---

## ⏱ Time Complexity

- **Time:** O(m × n)  
  We traverse all elements in the matrix once.

- **Space:** O(1)  
  No extra space used except variables.

---

##  Edge Cases Considered

- Only one customer
- Only one bank
- All customers having equal wealth
- Minimum constraints (m = 1, n = 1)

---

