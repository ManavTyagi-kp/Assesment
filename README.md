# Assesment\
Question 1 : Leader in the Array Given a unsorted array, kindly find the leader in array. 
  An element is called the leader of an array if there is no element greater than it on the right side. 
  #Test case int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7; 
                       Output: 10 6 5 2 
         #Constraint Please submit the optimize approach in 0(n)

Question 2 :Best Time to Buy and Sell Stock You are given an array prices where prices[i] is the price of a given stock on the ith day. 
  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
  #Test case 1: Input: prices = [7,1,5,3,6,4] Output: 5 
                Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
         #Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell 
  #Test case 2: Input: prices = [7,6,4,3,1] Output: 0 
                Explanation: In this case, no transactions are done and the max profit = 0. 
         #Constraints: 1 <= prices.length <= 105 0 <= prices[i] <= 104

Question 3:Sum of All Subset XOR Totals The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty. 
  For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1. 
  Given an array nums, return the sum of all XOR totals for every subset of nums. 
  Note: Subsets with the same elements should be counted multiple times. 
  An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
  #Test case 1: Input: nums = [1,3] Output: 6 
                Explanation: The 4 subsets of [1,3] are: 
                              The empty subset has an XOR total of 0. 
                              [1] has an XOR total of 1. 
                              [3] has an XOR total of 3. 
                              [1,3] has an XOR total of 1 XOR 3 = 2. 
                              0 + 1 + 3 + 2 = 6 
   #Test case 2: Input: nums = [5,1,6] Output: 28 
                 Explanation: The 8 subsets of [5,1,6] are: 
                              The empty subset has an XOR total of 0. 
                              [5] has an XOR total of 5. 
                              [1] has an XOR total of 1.
                              [6] has an XOR total of 6. 
                              [5,1] has an XOR total of 5 XOR 1 = 4. 
                              [5,6] has an XOR total of 5 XOR 6 = 3. 
                              [1,6] has an XOR total of 1 XOR 6 = 7.
                              [5,1,6] has an XOR total of 5 XOR 1 xor 6 = 2.
                              0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
