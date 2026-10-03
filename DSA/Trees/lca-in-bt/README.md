# [88. LCA in BT](https://takeuforward.org/practice/dsa/lca-in-bt)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a root of binary tree, find the **lowest common ancestor (LCA)** of two given nodes (p, q) in the tree.

The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).

**Note** : Return the TreeNode itself, not its value.

### Example 1:

**Input:** root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4] , p = 5, q = 1

**Output:** 3

**Explanation:**

<img src="https://static.takeuforward.org/content/1789463127_MDAJ7HN7.webp">

### Example 2:

**Input:** root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4] , p = 5, q = 4

**Output:** 5

**Explanation:**

<img src="https://static.takeuforward.org/content/1789463132_DAdzqPqV.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 2 <= Number of Nodes <= 10^5
- -10^6 <= node.val <= 10^6
- All values in tree are **unique.**

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
