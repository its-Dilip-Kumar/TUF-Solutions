# [41. Word Break](https://takeuforward.org/practice/dsa/word-break)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given a string s and a dictionary of strings wordDict, return true if s can be **segmented** into a space-separated sequence of one or more dictionary words otherwise return false.

Note : The **same** **word** in dictionary can be used **multiple** **times** in segmentation.

### Example 1:

**Input:** s = "takeuforward" , wordDict = ["take" , "forward" , "you", "u"]

**Output:** true

**Explanation:** Return true because "takeuforward" can be segmented as "take" , "u" , "forward".

### Example 2:

**Input:** s = "applepineapple" , wordDict = ["apple"]

**Output:** false

**Explanation:** Return false because "applepineapple" can be segmented as "apple" , "pine" , "apple" but here we do not have "pine" word in dictionary.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 300
- 1 <= wordDict.length <= 1000
- 1 <= wordDict[i].length <= 20
- s and wordDict[i] consist only of English lowercase letters.
- All strings in wordDict are **unique** .

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
