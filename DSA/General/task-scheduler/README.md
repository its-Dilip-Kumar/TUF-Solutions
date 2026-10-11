# [54. Task Scheduler](https://takeuforward.org/practice/dsa/task-scheduler)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given a list of tasks represented by uppercase English letters ('A' to 'Z'), and an integer n representing a cooldown interval between two same tasks.

Each task takes exactly 1 CPU interval to complete.

Tasks can be executed in any order, but identical tasks must be separated by at least n intervals, during which the CPU may remain idle or execute other tasks.

Return the minimum number of **CPU** intervals required to complete all the tasks.

### Example 1:

**Input:** tasks = ["A","A","A","B","B","B"], n = 2

**Output:** 8

**Explanation:**

- One valid execution order is:
- A -> B -> idle -> A -> B -> idle -> A -> B
- Total intervals = 8

### Example 2:

**Input:** tasks = ["A","C","A","B","D","B"], n = 1

**Output:** 6

**Explanation:**

- A possible execution:
- A -> B -> C -> D -> A -> B
- No idle interval is needed as cooldown = 1.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= tasks.length <= 10^4
- tasks[i] is an uppercase English letter from 'A' to 'Z'
- 0 <= n <= 100

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
