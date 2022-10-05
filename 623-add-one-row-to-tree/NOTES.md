1) Recursively search at every depth, start from depth = 1 i.e root
2)Base Case```
```
if(root == null){
return;
}
```
3) if(currDepth == given depth) then insert val node at left and right each
4) else search at next depth
```
addRow(root.left, val, depth, currDepth + 1);
addRow(root.right, val, depth, currDepth + 1);
```
**TC & SC : O(n)**
​