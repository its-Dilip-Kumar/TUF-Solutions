# [121. Kth largest element in a stream of running integers](https://takeuforward.org/practice/dsa/kth-largest-element-in-a-stream-of-running-integers)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Implement a class **KthLargest** to find the **k** ^ **th** **largest** number in a stream. It should have the following methods:

- **KthLargest** (int k, int [] nums) Initializes the object with the integer **k** and the initial stream of numbers in **nums**
- int **add** (int val) Appends the integer **val** to the stream and returns the **k** ^ **th** largest element in the stream.

Note that it is the **k** ^ **th** **largest** element in the sorted order, not the **k** ^ **th** distinct element.

### Example 1:

**Input:** [KthLargest(3, [1, 2, 3, 4]), add(5), add(2), add(7)]

**Output:** [null, 3, 3, 4]

**Explanation:** initial stream = [1, 2, 3, 4], k = 3.

add(5): stream = [1, 2, 3, 4, 5] -> returns 3

add(2): stream = [1, 2, 2, 3, 4, 5] -> returns 3

add(7): stream = [1, 2, 2, 3, 4, 5, 7] -> returns 4

### Example 2:

**Input:** [KthLargest(2, [5, 5, 5, 5], add(2), add(6), add(60)]

**Output:** [null, 5, 5, 6]

**Explanation:** initial stream = [5, 5, 5, 5], k = 2.

add(2): stream = [5, 5, 5, 5, 2] -> returns 5

add(6): stream = [5, 5, 5, 5, 2, 6] -> returns 5

add(60): stream = [5, 5, 5, 5, 2, 6, 60] -> returns 6

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of instructions <= 1000
- -10^4 <= val & all initial values <= 10^4
- 1 <= k <= 10^4
- k - 1 <= nums.length <= 10^3
- The stream will have at least k elements after any add call.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
