# [356. Cherry pickup II](https://takeuforward.org/practice/dsa/cherry-pickup-ii)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a n x m 2d integer array called matrix where matrix[i][j] represents the number of cherries you can pick up from the (i, j) cell.Given two robots that can collect cherries, one is located at the **top-leftmost (0, 0)** cell and the other at the **top-rightmost (0, m-1)** cell.

Return the **maximum** number of cherries that can be picked by the two robots in total, following these rules:

- Robots that are standing on (i, j) cell can only move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1), if it exists in the matrix.

- A robot will pick up all the cherries in a given cell when it passes through that cell.

- If both robots come to the same cell at the same time, only one robot takes the cherries.

- Both robots must reach the bottom row in matrix.

### Example 1:

**Input:** matrix = [[2, 1, 3], [4, 2, 5], [1, 6, 2], [7, 2, 8]]

**Output:** 37

**Explanation:**

Possible left robot path:-

Start at 0th cell (2) -> down (4) -> down-right (6) ->down-left (7)

Possible right robot path:-

Start at 2nd cell (3) -> down (5) -> down (2) -> down (8)

### Example 2:

**Input:** matrix = [[1, 4, 4, 1], [1, 2, 2, 1], [5, 6, 10, 11], [8, 1, 1, 1]]

**Output:** 32

**Explanation:**

Possible left robot path:-

Start at 0th cell (1) -> down-right (2) -> down (6) ->down-left (8)

Possible right robot path:-

Start at 3rd cell (1) -> down-left (2) -> down-right (11) -> down (1)

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- n == number of rows in matrix
- m == number of columns in matrix
- 2 <= n, m <= 70
- 0 <= matrix[i][j] <= 1000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
