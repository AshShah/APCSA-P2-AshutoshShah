
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze 
{
	private int[][] maze;
	private boolean foundExit;

	public Maze() 
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line) 
	{
		foundExit = false;
		Scanner keyboard = new Scanner(line);
		maze = new int[size][size];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = keyboard.nextInt();
			}
		}

	}

	public boolean hasExitPath(int r, int c) {
		if ((r >= 0 && r < maze.length) && (c >= 0 && c < maze[r].length) && (maze[r][c] == 1)) {
			maze[r][c] = 0;
			if ((c == maze[r].length - 1)) 
			{
				foundExit = true;
			} 
			else 
			{
				hasExitPath(r - 1, c);
				hasExitPath(r, c - 1);
				hasExitPath(r + 1, c);
				hasExitPath(r, c + 1);
			}
		}
		return foundExit;
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				output = output + maze[i][j] + " ";
			}
			output = output + "\n";
		}
		if (hasExitPath(0, 0)) {
			output = output + " An Exit Exists";
		} else {
			output = output + " No Exit Exists";
		}
		return output;
	}
}