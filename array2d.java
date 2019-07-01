
// Tessa Biava
// CST-105
// June 30th, 2019
// This is my own work

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class array2d {
	public static void main(String[] args) throws IOException {

		// Create instance of the file
		FileReader fr = new FileReader("ArrayText");
		BufferedReader br = new BufferedReader(fr);

		// Declare variables
		char[][] matrix = new char[6][7]; // makes the 6*7 table
		String text = "";

		// Create Scanner
		Scanner input = new Scanner(br);

		// Row-major ordered array
		for (int row = 0; row < matrix.length; row++) { // loop through rows
			for (int column = 0; column < matrix[row].length; column++) { // loop through rows
				matrix[row][column] = (char) br.read();
				System.out.print(matrix[row][column]); // this will print out the rows
			}

			System.out.println(); // will make a new line, will prevent everything print on same row

		}

		// Column-major ordered String
		for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++) {
				text = (text + matrix[row][column]);
			}
		}

		System.out.print(text);
		input.close();
	}
}