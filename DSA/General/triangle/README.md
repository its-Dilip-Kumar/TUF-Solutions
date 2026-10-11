# [249. Triangle](https://takeuforward.org/practice/dsa/triangle)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a 2d integer array named triangle with n rows. Its first row has 1 element and each succeeding row has one more element in it than the row above it.

Return the **minimum falling path** sum from the first row to the last.

Movement is allowed only to the **bottom** or **bottom-right** cell from the current cell.

### Example 1:

**Input:** triangle = [[1], [1, 2], [1, 2, 4]]

**Output:** 3

**Explanation:**

One possible route can be:

Start at 1st row -> bottom -> bottom.

### Example 2:

**Input:** triangle = [[1], [4, 7], [4,10, 50], [-50, 5, 6, -100]]

**Output:** -42

**Explanation:**

One possible route can be:

Start at 1st row -> bottom-right -> bottom-right -> bottom-right

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- n == number of rows in triangle
- 1 <= n <= 200
- -10^4 <= triangle[i][j] <= 10^4
- triangle[0].length == 1
- triangle[i].length = triangle[i-1].length + 1
- The answer will not exceed 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
