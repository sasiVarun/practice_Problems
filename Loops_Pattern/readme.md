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