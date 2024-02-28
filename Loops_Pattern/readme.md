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
```java
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
```java
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
```java
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

* So logic is **(rows + 1) - 1**
### Code Logic
```java
for(int row = 1; row<=rows; row++) {
	for(int column = 1; column<=((rows+1)-1); column++) {
		System.out.print("*");
	}
	    System.out.println();
}
```
### Code Logic (Another way)
```java
for(int row = rows; row>=1; row--) {
	for(int column = 1; column<=row; column++) {
		System.out.print("*");
	}
	    System.out.println();
}
```
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


    | **Row Count** | **Number of Spaces** | **Number of** ```*``` | Logic |
    | ----------- | ----------- |----------- |----------- |
    | Row-1 | 3 spaces | 1 ```*```| (4-1) = 3 spaces; (2x1 - 1) = 1 ```*```|
    | Row-2 | 2 spaces | 3 ```*```| (4-2) = 2 spaces; (2x2 - 1) = 3 ```*```|
    | Row-3 | 1 spaces | 5 ```*```| (4-3) = 1 spaces; (2x3 - 1) = 5 ```*```|
    | Row-4 | 0 spaces | 7 ```*```| (4-4) = 0 spaces; (2x4 - 1) = 7 ```*```|

3. For spaces logic is (4 - rowCount), here 4 is number of rows. So we can write logic as (No. of rows - row)
4. For ```*``` logic is (2xrow - 1)

### Code Logic
```java
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
```java
for(int row=rows; row>=1; row--) {
	for(int column=1; column<=(rows-row); column++) {
		System.out.print(" ");
	}
	for(int column=1; column<=(2*row - 1); column++) {
		System.out.print("*");
	}
	System.out.println();
}
```
---
# **```NumericalRectangularPattern```**
### Pattern
```
123456
234561
345612
456123
561234
612345
```
### Key Points
1. Lets break logic for above pattern.
2. Each row is starting with row number

<table>
<tr>
    <td>R1 -> 123456</td>
</tr>
<tr>
    <td>R2 -> 234561</td>
</tr>
<tr>
    <td>R3 -> 345612</td>
</tr>
<tr>
    <td>R4 -> 456123</td>
</tr>
</table>

* So from this we got logic as start from row number to number of rows.

3. Next we are having numbers continuation, for this starting from 1 to row-1
<table>
<tr>
    <td>R2 ->  234561 <strong>| (R2-1)<strong></td>
</tr>
<tr>
    <td>R3 ->  345612 <strong>| (R3-1)</strong></td>
</tr>
<tr>
    <td>R4 ->  456123 <strong>| (R4-1)</strong></td>
</tr>
</table>

### Code Logic
```java
for(int row=1; row<=rows; row++) {
	for(int column=row; column<=rows; column++) {
		System.out.print(column);
	}
	
	 for(int column=1; column<=row-1; column++) { 
		System.out.print(column);
	}
	System.out.println();
}
```
---
# **```NumberPattern```**
### Pattern
```
1212
2121
1212
2121
```
### Key Points
1. Lets break logic for above pattern.
2. Considering above pattern in the form of matrix as shown below

| <sup>R1</sup>[``` 1 ```]<sub>C1</sub> | <sup>R1</sup>[``` 2 ```]<sub>C2</sub> | <sup>R1</sup>[``` 1 ```]<sub>C3</sub> | <sup>R1</sup>[``` 2 ```]<sub>C4</sub> |
|----------------------------|----------------------------|----------------------------|----------------------------|
| <h5><sup>R2</sup>[``` 2 ```]<sub>C1</sub></h5> | <h5><sup>R2</sup>[``` 1 ```]<sub>C2</sub></h5> | <h5><sup>R2</sup>[``` 2 ```]<sub>C3</sub></h5> | <h5><sup>R2</sup>[``` 1 ```]<sub>C4</sub></h5> |
| <h5><sup>R3</sup>[``` 1 ```]<sub>C1</sub></h5> | <h5><sup>R3</sup>[``` 2 ```]<sub>C2</sub></h5> | <h5><sup>R3</sup>[``` 1 ```]<sub>C3</sub></h5> | <h5><sup>R3</sup>[``` 2 ```]<sub>C4</sub></h5> |
| <h5><sup>R4</sup>[``` 2 ```]<sub>C1</sub></h5> | <h5><sup>R4</sup>[``` 1 ```]<sub>C2</sub></h5> | <h5><sup>R4</sup>[``` 2 ```]<sub>C3</sub></h5> | <h5><sup>R4</sup>[``` 2 ```]<sub>C4</sub></h5> |

3. If we observer when Row + Column count is even having value 1, else 2

<table>
<tr>
    <td>Row-1, Col-1 -> 1 (1+1)</td>
</tr>
<tr>
    <td>Row-1, Col-3 -> 1 (1+3)</td>
</tr>
<tr>
    <td>Row-2, Col-2 -> 1 (2+2)</td>
</tr>
<tr>
    <td>Row-2, Col-2-> 1 (2+4)</td>
</tr>
</table>
</br>

```java
for(int row=1; row<=rows; row++) {
	for(int column=1; column<=columns; column++) {
	  if((row+column) % 2 == 0) {
			System.out.print("1");
		}else {
			System.out.print("2");
		}
	}
	System.out.println();
}
```
