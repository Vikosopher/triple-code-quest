## Daily Challenges

### Day 12 ( 12 FEB 2025)

1. **Problem 1: Two Sum**
   - **Problem Statement:** 
   
   ````
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   You can return the answer in any order.

   Input: nums = [2,7,11,15], target = 9
   Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

   ````
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/two-sum/description/)
---

2. **Problem 2: Search in Rotated Sorted Array**
   - **Problem Statement:** 
   
   ```
   There is an integer array nums sorted in ascending order (with distinct values).

   Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

   Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

   You must write an algorithm with O(log n) runtime complexity.

   Input: nums = [4,5,6,7,0,1,2], target = 0
   Output: 4

   ```
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)
---

3. **Problem 3: 3Sum**
   - **Problem Statement:** 
   
   ````
   Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

   Notice that the solution set must not contain duplicate triplets.

   Input: nums = [-1,0,1,2,-1,-4]
   Output: [[-1,-1,2],[-1,0,1]]
   Explanation: 
   nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
   nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
   nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
   The distinct triplets are [-1,0,1] and [-1,-1,2].
   Notice that the order of the output and the order of the triplets does not matter.

   ````
   - **Problem Link:** [LeetCode](https://leetcode.com/problems/3sum/description/)
   
---