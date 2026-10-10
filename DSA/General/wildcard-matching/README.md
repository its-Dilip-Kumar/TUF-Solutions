# [293. Wildcard matching](https://takeuforward.org/practice/dsa/wildcard-matching)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a string str and a pattern pat, implement a pattern matching function that supports the following special characters:

'?' Matches any single character.

'*' Matches any sequence of characters (including the empty sequence).

The pattern must match the entire string.

### Example 1:

**Input:** str = "xaylmz", pat = "x?y*z"

**Output:** true

**Explanation:**

The pattern "x?y*z" matches the string "xaylmz":

- '?' matches 'a'

- '*' matches "lm"

- 'z' matches 'z'

### Example 2:

**Input:** str = "xyza", pat = "x*z"

**Output:** false

**Explanation:**

The pattern "x*z" does not match the string "xyza" because there is an extra 'a' at the end of the string that is not matched by the pattern.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 0 <= length of(str, pattern) <= 200

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
