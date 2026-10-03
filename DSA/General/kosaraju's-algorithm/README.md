# [212. Kosaraju's algorithm](https://takeuforward.org/practice/dsa/kosaraju's-algorithm)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are given a **directed** graph with **V** vertices, numbered from 0 to **V − 1** , and its adjacency list Adj, where **Adj[i]** contains all vertices j such that there is a **directed** edge from vertex **i to vertex j.**

Your task is to find the number of strongly connected components **(SCCs)** in the graph.

### Example 1:

**Input:** V=5, Adj=[[2,3],[0],[1],[4],[]]

<img src="https://static.takeuforward.org/content/1788102116_EcRJ1nfa.webp">

**Output:** 3

**Explanation:** Three strongly connected components are marked below:

<img src="https://static.takeuforward.org/content/1788102143_2carZ7O3.webp">

### Example 2:

**Input:** V=8, Adj=[[1],[2],[0,3],[4],[5,7],[6],[4,7],[]]

**Output:** 4

**Explanation:** Four strongly connected components are marked below:

<img src="https://static.takeuforward.org/content/1788102211_NSNRcDep.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

1 ≤ V ≤ 5000

0 ≤ E ≤ (V*(V-1))

0 ≤ a_i, b_i ≤ V-1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
