# [885. Requirements needed to construct a unique BT](https://takeuforward.org/practice/dsa/requirements-needed-to-construct-a-unique-bt)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a pair of tree traversal, return **true** if a unique binary tree can be constructed otherwise **false** . Each traversal is represented with integer: 1 -> Preorder , 2 -> Inorder , 3 -> Postorder.

### Example 1:

**Input:** 1 2

**Output:** true&nbsp;

**Explanation:** Answer is True.

It is possible to construct a unique binary tree. This is because the preorder traversal provides the root of the tree, and the inorder traversal helps determine the left and right subtrees.

### Example 2:

**Input:** 2 2

**Output:** false

**Explanation:** Two inorder traversals are insufficient to uniquely determine a binary tree.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= a, b <= 3

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
