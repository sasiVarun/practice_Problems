```
*********
*       *
*       *
*       *
*********
```
## Key Points
1. Lets break logic for above pattern.
2. First we are having **n** number for rows.
3. Only first & last rows are having continuous ```*```.
4. In between first & last rows, first column and last column having ```*```.
5. So we can write logic saying as
    * **row is first or last print continuous** ```*```
    * **column is first or last print single** ```*```

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