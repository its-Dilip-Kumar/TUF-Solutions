# [95. Coin change II](https://takeuforward.org/practice/dsa/coin-change-ii)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Give an array coins of n integers representing coin denominations. Your task is to find the number of distinct combinations that sum up to a specified amount of money. If it's impossible to achieve the exact amount with any combination of coins, return 0.

Single coin can be used any number of times.

Return your answer with modulo 10^9+7.

### Example 1:

Input: coins = [2, 4,10], amount = 10

Output: 4

Explanation: The four combinations are:

10 = 10

10 = 4 + 4 + 2

10 = 4 + 2 + 2 + 2

10 = 2 + 2 + 2 + 2 + 2

### Example 2:

Input: coins = [5], amount = 5

Output: 1

Explanation: There is one combination: 5 = 5.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n, coins[i], amount <= 10^3
- All the values of **coins** are unique.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
