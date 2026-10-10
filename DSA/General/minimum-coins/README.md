# [187. Minimum coins](https://takeuforward.org/practice/dsa/minimum-coins)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array of coins representing coins of different denominations and an integer amount representing a total amount of money. Return the **fewest** number of coins that are needed to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1. There are **infinite** numbers of coins of each type

### Example 1:

**Input:** coins = [1, 2, 5], amount = 11

**Output:** 3

**Explanation:** 11 = 5 + 5 + 1. We need 3 coins to make up the amount 11.

### Example 2:

**Input:** coins = [2, 5], amount = 3

**Output:** -1

**Explanation:** It's not possible to make amount 3 with coins 2 and 5. Since we can't combine the coin 2 and 5 to make the amount 3, the output is -1.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- n=number of distinct denominations
- 1 <= n <= 100
- 1 <= coins[i], amount <= 10^3

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
