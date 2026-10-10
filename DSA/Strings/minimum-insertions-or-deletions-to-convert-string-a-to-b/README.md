# [416. Minimum insertions or deletions to convert string A to B](https://takeuforward.org/practice/dsa/minimum-insertions-or-deletions-to-convert-string-a-to-b)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given two strings str1 and str2, find the minimum number of **insertions** and **deletions** in string str1 required to **transform** str1 into str2.

Insertion and deletion of characters can take place at any position in the string.

### Example 1:

**Input:** str1 = "kitten", str2 = "sitting"

**Output:** 5

**Explanation:** To transform "kitten" to "sitting", delete "k" to get "itten", insert "s" at the beginning to get "sitten", delete "e" to get "sittn", then insert "i" to get "sittin", and insert "g" at the end to get "sitting".To transform "kitten" to "sitting", delete "k" and insert "s" to get "sitten", then insert "i" to get "sittin", and insert "g" at the end to get "sitting".

### Example 2:

**Input:** str1 = "flaw", str2 = "lawn"

**Output:** 2

**Explanation:** To transform "flaw" to "lawn", delete "f" and insert "n" at the end. Hence minimum number of operations required is 2".

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ str1.length, str2.length ≤ 1000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
