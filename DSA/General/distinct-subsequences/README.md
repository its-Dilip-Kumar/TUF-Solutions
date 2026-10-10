# [227. Distinct subsequences](https://takeuforward.org/practice/dsa/distinct-subsequences)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given two strings s and t, return the number of distinct subsequences of s that equal t.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. For example, "ace" is a subsequence of "abcde" while "aec" is not.

The task is to count how many different ways we can form t from s by deleting some (or no) characters from s. Return the result modulo 10^9+7.

### Example 1:

Input: s = "axbxax", t = "axa"

Output: 2

Explanation: In the string "axbxax", there are two distinct subsequences "axa":

(a)(x)bx(a)x

(a)xb(x)(a)x

### Example 2:

Input: s = "babgbag", t = "bag"

Output: 5

Explanation: In the string "babgbag", there are five distinct subsequences "bag":

(ba)(b)(ga)(g)

(ba)(bg)(ag)

(bab)(ga)(g)

(bab)(g)(ag)

(babg)(a)(g)

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length, t.length <= 1000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
