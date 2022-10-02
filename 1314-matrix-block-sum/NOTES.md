1) Loop through array
2) for every ith element initialize p and q with given r and c
```
i - k <= r <= i + k,
j - k <= c <= j + k
```
3) if p, q is -ve increment till 0, because its the minimum index
4) Loop the array for ith element from p and q till r and c for rows and column respectively
5) calculate the addition at every stage and update it to final answer array
**TC & SC : O(m+n)**