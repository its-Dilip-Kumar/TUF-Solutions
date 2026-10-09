# [159. Best time to buy and sell stock III](https://takeuforward.org/practice/dsa/best-time-to-buy-and-sell-stock-iii)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Given an array, arr, of n integers, where arr[i] represents the price of the stock on an ith day, determine the **maximum profit** achievable by completing at most two transactions in total.

Holding **at most** one share of the stock at any time is allowed, meaning buying and selling the stock twice is permitted, but the stock must be sold before buying it again. Buying and selling the stock on the same day is allowed.

### Example 1:

**Input:** arr = [4, 2, 7, 1, 11, 5]

**Output:** 15

**Explanation:** Buy on day 2 (price = 2) and sell on day 3 (price = 7), profit = 7 - 2 = 5. Then buy on day 4 (price = 1) and sell on day 5 (price = 11), profit = 11 - 1 = 10. Total profit is 5 + 10 = 15.

### Example 2:

**Input:** arr = [1, 3, 2, 8, 4, 9]

**Output:** 12

**Explanation:** Buy on day 1 (price = 1) and sell on day 4 (price = 8), profit = 8 - 1 = 7. Then buy on day 5 (price = 4) and sell on day 6 (price = 9), profit = 9 - 4 = 5. Total profit is 7 + 5 = 12.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n<= 10^5
- 0 <= arr[i] <= 10^6

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
