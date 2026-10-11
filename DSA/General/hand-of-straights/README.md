# [228. Hand of Straights](https://takeuforward.org/practice/dsa/hand-of-straights)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given an array of integers hand, where hand[i] is the value on the i^th card that Alice owns.

Alice wants to split her entire hand into groups such that:

- every group contains exactly groupSize cards, and

- the card values in each group form a sequence of groupSize consecutive integers (e.g. [3, 4, 5], [10, 11, 12, 13]).

Return true if such a rearrangement is possible; otherwise return false.

### Example 1:

**Input:** &nbsp;hand = [1,2,3,6,2,3,4,7,8],&nbsp;groupSize = 3

**Output:** true

**Explanation:**

One possible partition is [1,2,3]&nbsp;[2,3,4]&nbsp;[6,7,8].

### Example 2:

**Input:** &nbsp;hand = [1,2,3,4,5],&nbsp;groupSize = 4

**Output:** false

**Explanation:**

There is no way to split the hand into groups of 4 consecutive cards.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ hand.length ≤ 10^4
- 0 ≤ hand[i] ≤ 10^9
- 1 ≤ groupSize ≤ hand.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
