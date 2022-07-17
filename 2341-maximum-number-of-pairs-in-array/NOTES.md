Approach 1 :-
Sort the array first
if two elements are equal then increment the pair
return the pair and length of nums - double of pair(2 * pair)
// TC : O(n log n)
// SC : O(2)
​
Approach 2 :-
increment the number of times the element is repeated
then ans[0] = divide the element in arr by 2 ans[0]++
ans[1] = mod of element in arr by 2 and ans[1]++
// TC : O(n)
// SC : O(n)
​