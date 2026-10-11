# [744. Unbounded knapsack](https://takeuforward.org/practice/dsa/unbounded-knapsack)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given two integer arrays, val and wt, each of size N, representing the values and weights of N items respectively, and an integer W, representing the maximum capacity of a knapsack, determine the maximum value achievable by selecting a subset of the items such that the total weight of the selected items does not exceed the knapsack capacity W. The goal is to **maximize** the sum of the values of the selected items while keeping the total weight within the knapsack's capacity.

An **infinite** supply of each item can be assumed.

### Example 1:

**Input:** val = [5, 11, 13], wt = [2, 4, 6], W = 10

**Output:** 27

**Explanation:** Select 2 items with weights 4 and 1 item with weight 2 for a total value of 11+11+5 = 27.

### Example 2:

**Input:** val = [10, 40, 50, 70], wt = [1, 3, 4, 5], W = 8

**Output:** 110

**Explanation:** Select items with weights 3 and 5 for a total value of 40 + 70 = 110.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ N ≤ 500
- 1 ≤ W ≤ 1000
- 1 ≤ wt[i] ≤ 500
- 1 ≤ val[i] ≤ 500

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
