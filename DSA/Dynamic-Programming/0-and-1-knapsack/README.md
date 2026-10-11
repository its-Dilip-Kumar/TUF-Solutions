# [186. 0 and 1 Knapsack](https://takeuforward.org/practice/dsa/0-and-1-knapsack)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given two integer arrays, val and wt, each of size n, which represent the values and weights of n items respectively, and an integer W representing the maximum capacity of a knapsack, determine the **maximum** value achievable by selecting a **subset** of the items such that the total weight of the selected items does not exceed the knapsack capacity W.

Each item can either be picked in its entirety or not picked at all (0-1 property). The goal is to **maximize** the sum of the values of the selected items while keeping the total weight within the **knapsack's** capacity.

### Example 1:

**Input:** val = [60, 100, 120], wt = [10, 20, 30], W = 50

**Output:** 220

**Explanation:** Select items with weights 20 and 30 for a total value of 100 + 120 = 220.

### Example 2:

**Input:** val = [10, 40, 30, 50], wt = [5, 4, 6, 3], W = 10

**Output:** 90

**Explanation:** Select items with weights 4 and 3 for a total value of 40 + 50 = 90.

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
