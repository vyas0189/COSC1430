#include <iostream>
#include <fstream>
#include <string>
using namespace std;


int** readMatrix(string filename, int rows, int cols);
int** transpose(int** mat,int rows,int col);
void printFile(int** matx, int row, int col);
void debug(int** matt, int row, int col);

int	**	readMatrix(string fileName, int	rows, int	cols) {
	ifstream infile;
	infile.open(fileName);
	int	**	matrix = new	int*[rows];
	for (int index1 = 0; index1 < rows; ++index1) {
		matrix[index1] = new	int[cols];
	for (int index2 = 0; index2 < cols; ++index2) {
			infile >> matrix[index1][index2];
			cout << matrix[index1][index2] << "	";
			cin.get();
		}
		cout << endl;
	}
	infile.close();
	return	matrix;
}

int** transpose(int** mat,int rows,int col)
{
	int** a = new int*[col];
	for (int i = 0; i < rows; ++i) {
		a[i] = new int[col];
		for (int j = 0; j < col; ++j)
		{
			a[i][j] = mat[j][i];
		}
	}
	return a;

}

void printFile(int** matx, int row, int col)
{
	ofstream outputFile;
	outputFile.open("output.txt");

	for(int index1 =0; index1 < row; index1++)
	{
		for(int index2=0; index2<col;index2++)
		{
			outputFile << matx[index1][index2] << " ";
		}
	}
	outputFile.close();
}


void debug(int** matt, int row, int col)
{
	for(int i=0; i<row;i++)
	{
		for(int j=0; j<col;j++)
		{
			cout << matt[i][j];
		}
		cout << endl;
	}

}
int main()
{

	int ** a = readMatrix("Text.txt", 10, 5);
	 debug(a, 10, 5);
	int ** b = transpose(a,10,5);
	debug(a, 10, 5);
		printFile(b,10,5);
	cin.get();

}