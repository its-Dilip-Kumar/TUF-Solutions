# [210. Best Time to Buy and Sell Stock with Cooldown](https://takeuforward.org/practice/dsa/best-time-to-buy-and-sell-stock-with-cooldown)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given an integer array prices where prices[i] is the price of a stock on the iᵗʰ day.

You may complete any number of transactions (buy one share and sell one share of the stock multiple times) subject to these rules:

- After you sell a share, you cannot buy on the very next day (i.e. there is a one-day cooldown).
- You may not hold more than one share at a time; that is, you must sell before you buy again.

Return the maximum profit you can achieve.

### Example 1:

**Input:** prices = [1,2,3,0,2]

**Output:** 3

**Explanation:** transactions = [buy, sell, cooldown, buy, sell]

### Example 2:

**Input:** prices = [1]

**Output:** 0

**Explanation:** Only one day — no transaction is possible.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ prices.length ≤ 5000
- 0 ≤ prices[i] ≤ 1000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
