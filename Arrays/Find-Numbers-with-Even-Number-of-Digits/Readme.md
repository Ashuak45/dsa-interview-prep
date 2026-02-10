# 🧩 Problem: Find Numbers with Even Number of Digits

🔗 LeetCode Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Math

---

## 📝 Problem Summary

Given an integer array `nums`, return how many of the numbers contain an **even number of digits**.

---

##  Intuition

To determine whether a number has an even number of digits, we first need to calculate the total number of digits in each number.

There are two possible approaches:

- Convert the number to a string and check its length.
- Use mathematical operations (division by 10 repeatedly) to count digits.

In this solution, we use the **mathematical approach** to avoid extra space usage from string conversion.

---

## Approach i used

1. Initialize a counter variable `count = 0`.
2. Traverse through each number in the array.
3. For each number:
    Count the number of digits.
    Check if the digit count is even.
4. If even, increment the counter.
5. Return the final count.

###  How Digit Counting Works

- If the number is `0`, it has 1 digit.
- If the number is negative, convert it to positive.
- Keep dividing the number by 10 until it becomes 0.
- Count how many times division happens.

---

## ⏱ Time Complexity

- **Time:** O(n × d)  
  Where:
  - `n` = number of elements in array  
  - `d` = number of digits in each number  

In worst case, digit counting runs in O(d).

- **Space:** O(1)  
  No extra space used.

---

## ⚠️ Edge Cases Considered

- Number is `0`
- Negative numbers
- Single-digit numbers
- Large numbers

---
