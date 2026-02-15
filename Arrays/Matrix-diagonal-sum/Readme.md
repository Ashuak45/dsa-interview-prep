# 🧩 Problem: Matrix Diagonal Sum

🔗 LeetCode Link: https://leetcode.com/problems/matrix-diagonal-sum/  
🟢 Difficulty: Easy  
🏷 Topics: Array, Matrix

---

## 📝 Problem Summary

Given a square matrix `mat` of size `n x n`,  
return the sum of:

- All elements on the primary diagonal
- All elements on the secondary diagonal

Do not double-count the center element if `n` is odd.

---

## 🧠 Intuition

In a square matrix:

- Primary diagonal → `mat[i][i]`
- Secondary diagonal → `mat[i][n - 1 - i]`

We can compute both in a single loop.

However, if `n` is odd, the center element gets added twice.  
So we subtract it once.

---

## 🚀 Approach

1. Initialize `sum = 0`.
2. Loop from `i = 0` to `n - 1`:
   - Add primary diagonal: `mat[i][i]`
   - Add secondary diagonal: `mat[i][n - 1 - i]`
3. If `n` is odd:
   - Subtract middle element `mat[n/2][n/2]`
4. Return `sum`.

---

## ⏱ Time Complexity

- **Time:** O(n)  
  We iterate once through the matrix.

- **Space:** O(1)  
  No extra space used.

---

## ⚠️ Edge Cases Considered

- Single element matrix (`n = 1`)
- Odd-sized matrix (center element overlap)
- Even-sized matrix (no overlap)

---


