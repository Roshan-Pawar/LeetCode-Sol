1) Insert co-ordinates in ans array by their cell numbers
2) sort the ans array by the Mahatten distance between two matrix which is given in problen statement.
```
Arrays.sort(ans,(a, b) -> {
int box1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
int box2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
return box1 - box2;
});
```
3) return the sorted array
**TC : O(n ^ 2) SC : O(n)**
​