public class Maze{
	public Maze(){
	
		maze[0][0]="*";
		maze[1][0]="*";
		maze[2][0]="*";
		maze[3][0]="*";
		maze[4][0]="*";
		maze[5][0]="*";
		maze[6][0]="*";
		maze[7][0]="*";
		maze[8][0]="*";
		//colum 2
		maze[0][1]="*";
		maze[1][1]="0";
		maze[2][1]=" ";
		maze[3][1]=" ";
		maze[4][1]=" ";
		maze[5][1]=" ";
		maze[6][1]="*";
		maze[7][1]=" ";
		maze[8][1]="*";
		//colum 3
  	maze[0][2]="*";
		maze[1][2]=" ";
		maze[2][2]="*";
		maze[3][2]="*";
		maze[4][2]="*";
		maze[5][2]=" ";
		maze[6][2]="*";
		maze[7][2]=" ";
		maze[8][2]="*";
		//colum 4 
		maze[0][3]="*";
		maze[1][3]=" ";
		maze[2][3]="*";
		maze[3][3]=" ";
		maze[4][3]=" ";
		maze[5][3]=" ";
		maze[6][3]=" ";
		maze[7][3]=" ";
		maze[8][3]="*";
		// colum 5
		maze[0][4]="*";
		maze[1][4]=" ";
		maze[2][4]="*";
		maze[3][4]="*";
		maze[4][4]="*";
		maze[5][4]="*";
		maze[6][4]="*";
		maze[7][4]=" ";
		maze[8][4]="*";
		//colum 6 
		maze[0][5]="*";
		maze[1][5]=" ";
		maze[2][5]="*";
		maze[3][5]=" ";
		maze[4][5]="*";
		maze[5][5]=" ";
		maze[6][5]=" ";
		maze[7][5]=" ";
		maze[8][5]="*";
		//colum 7
		maze[0][6]="*";
		maze[1][6]="*";
		maze[2][6]="*";
		maze[3][6]=" ";
		maze[4][6]="*";
		maze[5][6]=" ";
		maze[6][6]="*";
		maze[7][6]="*";
		maze[8][6]="*";
		//colum 8
		maze[0][7]="*";
		maze[1][7]=" ";
		maze[2][7]=" ";
		maze[3][7]=" ";
		maze[4][7]=" ";
		maze[5][7]=" ";
		maze[6][7]=" ";
		maze[7][7]=" ";
		maze[8][7]=" ";
		//colum 9
		maze[0][8]="*";
		maze[1][8]="*";
		maze[2][8]="*";
		maze[3][8]="*";
		maze[4][8]="*";
		maze[5][8]="*";
		maze[6][8]="*";
		maze[7][8]="*";
		maze[8][8]="*"; 
}
	
	
	public void printMaze(){
	
		for(int i = 0; i<9; i++) {
			
			for(int j = 0; j<9; j++) {
				
				System.out.print(maze[i][j]);
				
			}
			
			System.out.println();
		}
		System.out.println("row"+PostionRow);
		
		System.out.println("colum"+PostionColum);

}
	public boolean moveLeft(){


if (maze[PostionRow][PostionColum-1].equals("*")){
return false;

}
else{
	
	maze[PostionRow][PostionColum]=" ";
	maze[PostionRow][PostionColum-1]="O";
	PostionColum--;
	printMaze();
	return true;

}


	}
	public boolean moveRight(){

if (maze[PostionRow][PostionColum+1].equals("*")){
return false;
}
else{
	maze[PostionRow][PostionColum]=" ";
	maze[PostionRow][PostionColum+1]="O";
		PostionColum++;
	printMaze();

	return true;
	}
	}
public boolean moveUp(){

if (maze[PostionRow-1][PostionColum].equals("*")){
return false;
}
else{
	maze[PostionRow][PostionColum]=" ";
	maze[PostionRow-1][PostionColum]="O";
		PostionRow--;
	printMaze();

	return true;
	}
	}
public boolean moveDown(){
if (maze[PostionRow+1][PostionColum].equals("*")){
return false;
}
else{
	maze[PostionRow][PostionColum]=" ";
	maze[PostionRow+1][PostionColum]="O";
	PostionRow++;
	printMaze();

	return true;
	}
	}
public int getPostionColum(){
		return PostionColum;
	}
	public int GetPostionRow(){
		return PostionRow;
	}



 
String[][] maze = new String[9][9];

	int PostionColum=1;
	int PostionRow=1;
}