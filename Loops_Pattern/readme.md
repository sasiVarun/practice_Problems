# **```RecatangularPattern```**
### Pattern
```
*********
*********
*********
*********
```
### Key Points
1. Lets break logic for above pattern.
2. First we are having **n** number of rows & columns.
3. In each row having same number of  ```*```, so columns count is clear.
4. We know how many rows to be printed, so row count is clear.

### Code Logic
```
for(int row=1; row<=rows; row++) {
	for(int column=1; column<=columns; column++) {
	    System.out.print("*");
	}
		System.out.println();
}
```
-------
# **```RecatangleWithSpacePattern```**
```
*********
*       *
*       *
*       *
*********
```
## Key Points
1. Lets break logic for above pattern.
2. First we are having **n** number for rows & columns.
3. Only first & last rows are having continuous ```*```.
4. In between first & last rows, first column and last column having ```*```.
5. So we can write logic saying as
    * **row is first or last print continuous** ```*```
    * **column is first or last print single** ```*``` **rest all are spaces**

# Code Logic
```
for(int row=1; row<=rows; row++) {
	for(int column=1; column<=columns; column++) {
		if(row == 1 || row == rows ||column == 1 || column == columns) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
    }
	System.out.println();
}
	
```
---
# **```TrianglePattern```**
### Pattern
```
*
**
***
****
```
### Key Points
1. Lets break logic for above pattern.
2. First we are having **n** number of rows.
3. ```*``` count is based on row number.

    | **Row Count** | **Pattern** |
    | ----------- | ----------- |
    | Row-1 | * |
    | Row-2 | ** |
    | Row-3 | *** |
    | Row-4 | **** |

4. So we have to iterate on columns based on row count

### Code Logic
```
for(int row = 1; row<=rows; row++) {
	for(int column = 1; column<=row; column++) {
		System.out.print("*");
	}
	    System.out.println();
}
```

### Similarlly if we need to print reverse triangle pattern
### Pattern
```
****
***
**
*
```

| **Row Count** | **Pattern** |**Logic**|
| ----------- | ----------- | ----------- |
| Row-1 | **** | 4 we can write as **(5-1)**|
| Row-2 | *** | 3 we can write as **(5-2)**|
| Row-3 | ** | 2 we can write as **(5-3)**|
| Row-4 | * | 1 we can write as **(5-4)**|

* So we logic is **(rows + 1) - 1**
### Code Logic
<pre>
for(int row = 1; row<=rows; row++) {
	<span style="color:lightcoral"><strong> for(int column = 1; column<=((rows+1)-1); column++) {</strong></span>
		System.out.print("*");
	}
	    System.out.println();
}
</pre>
### Code Logic (Another way)
<pre>
<span style="color:lightcoral"><strong> for(int row = rows; row>=1; row--) {</strong></span>
	for(int column = 1; column<=row; column++) {
		System.out.print("*");
	}
	    System.out.println();
}
</pre>
---
# **```PyramidPattern```**
### Pattern
```
   *
  ***
 *****
*******
```
### Key Points
1. Lets break logic for above pattern.
2. First we are having **n** number of rows.


    | **Row Count** | **Spaces** | ```*``` | Logic |
    | ----------- | ----------- |----------- |----------- |
    | Row-1 | 3 spaces | 1 ```*```| (4-1) = 3 spaces; (2x1 - 1) = 1 ```*```|
    | Row-2 | 2 spaces | 3 ```*```| (4-2) = 2 spaces; (2x2 - 1) = 3 ```*```|
    | Row-3 | 1 spaces | 5 ```*```| (4-3) = 1 spaces; (2x3 - 1) = 5 ```*```|
    | Row-4 | 0 spaces | 7 ```*```| (4-4) = 0 spaces; (2x4 - 1) = 7 ```*```|

3. For spaces logic is (4 - rowCount), here 4 is number of rows. So we can write logic as (No. of rows - row)
4. For ```*``` logic is (2xrow - 1)

### Code Logic
```
for(int row=1; row<=rows; row++) {
	for(int column=1; column<=(rows-row); column++) {
		System.out.print(" ");
	}
	for(int column=1; column<=(2*row - 1); column++) {
		System.out.print("*");
	}
	System.out.println();
}
```

### Similarlly if we need to have reverse pyramid pattern
### Pattern
```
*******
 *****
  ***
   *  
```
### Code Logic
<pre>
<span style="color:lightcoral"><strong> for(int row=rows; row>=1; row--) {</strong></span>
	for(int column=1; column<=(rows-row); column++) {
		System.out.print(" ");
	}
	for(int column=1; column<=(2*row - 1); column++) {
		System.out.print("*");
	}
	System.out.println();
}
</pre>