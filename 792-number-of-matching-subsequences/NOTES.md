1. In the map just storing the every single String in words array if it repeating then incrementing its value by 1
2. initially ans is 0 & convering String s into character array /ch[]
3.   for every string in map temp = that i'th string in map i , j initially = 0
4.   i is representing ch which is our String s And  j is the String in the map which is our array words[]
5.   if value matches then increment both i & j
6.   else only increment the value of i   that is our ch[]
7.   if our j which is string in words array reached to length than subsequence found
8.   `ans += map.get(str);` this statement increment our ans for duplicates