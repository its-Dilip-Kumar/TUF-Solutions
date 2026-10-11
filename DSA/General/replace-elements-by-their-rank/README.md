# [1002. Replace Elements by Their Rank](https://takeuforward.org/practice/dsa/replace-elements-by-their-rank)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of N integers, replace each element by its rank in the array. The rank is defined as the position of the element in the sorted unique array **(1-based)** .

- Smaller numbers have smaller ranks.
- Duplicate elements have the same rank.
- The output array should contain the ranks corresponding to each element in the original order.

### Example 1:

**Input:** arr = [20, 15, 26, 2, 98, 6]

**Output:** [4, 3, 5, 1, 6, 2]

**Explanation:**

- Sorted unique array is [2, 6, 15, 20, 26, 98]
- Ranks: 2 → 1, 6 → 2, 15 → 3, 20 → 4, 26 → 5, 98 → 6

### Example 2:

**Input:** arr = [1, 5, 8, 15, 8, 25, 9]

**Output:** [1, 2, 3, 5, 3, 6, 4]

**Explanation:**

- Sorted unique array: [1, 5, 8, 9, 15, 25]
- Ranks: 1 → 1, 5 → 2, 8 → 3, 9 → 4, 15 → 5, 25 → 6

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= N <= 10^5
- -10^9 <= arr[i] <= 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
