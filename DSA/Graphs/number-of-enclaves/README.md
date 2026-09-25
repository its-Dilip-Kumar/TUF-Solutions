# [481. Number of enclaves](https://takeuforward.org/practice/dsa/number-of-enclaves)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an N x M binary matrix grid, where 0 represents a sea cell and 1 represents a land cell. A move consists of walking from one land cell to another adjacent **(4-directionally)** land cell or walking off the boundary of the grid. Find the number of **land cells** in the grid for which we cannot walk off the boundary of the grid in any number of moves.

### Example 1:

<img src="https://static.takeuforward.org/content/ProblemSetter-BX7diqs5">

**Input:** grid = [[0, 0, 0, 0], [1, 0, 1, 0], [0, 1, 1, 0], [0, 0, 0, 0]]

**Output:** 3

**Explanation:**

<img src="https://static.takeuforward.org/content/ProblemSetter-4DMweAfF">

The highlighted cells represents the land cells.

### Example 2:

<img src="https://static.takeuforward.org/content/ProblemSetter-JKtYrVqX">

**Input:** grid = [[0, 0, 0, 1],[0, 0, 0, 1], [0, 1, 1, 0], [0, 0, 1, 0], [0, 0, 0, 0]]

**Output:** 3

**Explanation:**

<img src="https://static.takeuforward.org/content/ProblemSetter-zgfKADbg">

The highlighted cells represents the land cells.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;&nbsp;1 <= N, M <= 500
- &nbsp;&nbsp;grid[i][j] == 0 or 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
