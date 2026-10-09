# [264. Best time to buy and sell stock with transaction fees](https://takeuforward.org/practice/dsa/best-time-to-buy-and-sell-stock-with-cooldown-and-transaction-fees)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an array arr where arr[i] represents the price of a given stock on the ith day. Additionally, you are given an integer fee representing a transaction fee for each trade. The task is to determine the maximum profit you can achieve such that **y** ou need to pay a transaction fee for each buy and sell transaction. The Transaction Fee is applied when you sell a stock.

You may complete as many transactions. You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before buying again).

### Example 1:

Input: arr = [1, 3, 4, 0, 2], fee = 1

Output: 3

Explanation: Buy at day 1, sell at day 3, then, buy at day 4, sell at day 5.

Profit calculation: ((4 - 1) - 1) + ((2 - 0) - 1) = 2 + 1 = 3.

### Example 2:

Input: arr = [1, 3, 2, 8, 4, 9], fee = 2

Output: 8

Explanation: Buy at day 1 (price = 1), sell at day 4 (price = 8), then Buy at day 5 (price = 4), sell at day 6 (price = 9),

Profit calculation: ((9 - 4) - 2) + ((8 - 1) - 2)= 8.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n<= 10^5
- 0 <= arr[i] ,fee<= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
