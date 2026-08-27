# DSA Pattern Recognition Cheat Sheet

A quick-reference guide for identifying which algorithmic pattern a problem likely needs, based on the problem statement and its constraints.

## Pattern Signals

| Signal in the Problem | Likely Pattern |
|---|---|
| Array/string, need to find a duplicate/pair/frequency, `n` is large | **Hashing** (HashSet/HashMap) |
| Small, fixed value range (e.g., only lowercase letters, digits 0-9) | **Fixed-size array / counting array** |
| "Contiguous subarray/substring" + size or sum constraint | **Sliding Window** |
| Sorted array/two arrays, looking for a pair/target | **Two Pointers** |
| "Find all subsets/permutations/combinations" | **Backtracking** |
| "Maximum/minimum" + "choices at each step" + overlapping subproblems | **Dynamic Programming** |
| Tree/graph, "shortest path" or "level by level" | **BFS** |
| Tree/graph, "explore all paths" or "connected components" | **DFS** |
| "Kth largest/smallest", "top K" | **Heap / Priority Queue** |
| Range queries, "sum between index i and j" repeatedly | **Prefix Sum** |
| "Next greater/smaller element", nested/balanced structure | **Stack** |
| Linked list, "find cycle", "middle of list" | **Fast & Slow Pointers** |
| Matrix/grid traversal, "islands", "flood fill" | **BFS/DFS on Grid** |
| Intervals, "merge", "overlapping" | **Sorting + Interval Merging** |
| "Search in sorted/rotated array" | **Binary Search** |
| Constraints are tiny (n ≤ 20) | **Brute force / backtracking / bitmask** is fine |
| Constraints are huge (n ≥ 10^9) | Only **O(log n) / O(1)** works — often math or binary search |

## How Constraints Narrow the Pattern

1. **Input size (`n`)** → tells you the time complexity ceiling (see complexity-vs-size table below).
2. **Value range** → tells you whether a fixed-size array/bucket works, or whether you need a hash-based structure.
3. **Special properties** (sorted, all positive, no duplicates, etc.) → often exist specifically to enable one technique (e.g., binary search, two pointers).

## Complexity vs. Input Size (rule of thumb, ~10^8 ops/sec budget)

| n (size) | Safe complexity | Risky complexity |
|---|---|---|
| ≤ 10-12 | O(2^n), O(n!) | — |
| ≤ 20-25 | O(2^n) | O(n!) |
| ≤ 500 | O(n^3) | O(2^n) |
| ≤ 5,000 | O(n^2) | O(n^3) |
| ≤ 10^5 – 10^6 | O(n log n), O(n) | O(n^2) |
| ≤ 10^8 | O(n), O(log n) | O(n log n) can be too slow |
| ≥ 10^9 | O(log n), O(1) | almost anything else |

## How to Build This Skill

- After solving a problem, ask: *"What in the problem statement told me to use this pattern?"* — write down the signal, not just the code.
- Study problems grouped by pattern (e.g., Blind 75, NeetCode 150), not by difficulty.
- When stuck, ask *"what does this remind me of?"* before *"how do I solve this?"*
- Always read the constraints first — they eliminate most wrong patterns before you've fully parsed the problem.