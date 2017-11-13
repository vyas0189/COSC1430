#include <iostream>
#include <fstream>
#include <string>
using namespace std;

void printArray(int arr[], int size)
{
	cout << "After: ";
	for (int i = 0; i < size-1; i++)
	{
		cout << arr[i] << " ";
	}
	cout << arr[size - 1];
}
void printArrayRec(int arr[], int size,int currentPos)
{
	if (currentPos == 1) {
		cout << "After: ";
		cout << arr[0] << " ";
	}
	else
	{
		printArrayRec(arr,size, currentPos - 1);
		if (currentPos == size)
			cout << arr[currentPos - 1];
		else
		{
			cout << arr[currentPos - 1] << " ";
		}
	}
}
int* getMin(int* arr, int size, int startIndex)
{
	int* minVal = &arr[startIndex];
	for (int i = startIndex; i < size; i++)
	{
		if (arr[i] < *minVal)
		{
			minVal = &arr[i];
		}
	}
	return minVal;
}

int* getMax(int* arr, int size, int startIndex)
{
	int* maxVal = &arr[startIndex];
	for (int i = startIndex; i < size; i++) {
		if (arr[i] > *maxVal)
		{
			maxVal = &arr[i];
		}
	}
	return maxVal;
}
void swap(int&first, int&second) noexcept
{
	int temp = first;
	first = second;
	second = temp;
}

void normalSort(int* arr, int size, string order)
{

	if (order == "ascending")
	{
		for (int i = 0; i < size; i++) {
			int* minValue = getMin(arr, size, i);
			swap(*minValue, arr[i]);
		}
	}
	else if (order == "descending")
	{
		for (int i = 0; i < size; i++)
		{
			int* maxValue = getMax(arr, size, i);
			swap(*maxValue, arr[i]);
		}
	}
}
void recursiveSort(int arr[], int numOfLines, string order, int counter =0)
{
	if (order == "ascending")
	{
		if (counter > numOfLines - 1)
		{
			return;
		}
		int*minValue = getMin(arr, numOfLines, counter);
		swap(*minValue, arr[counter]);

		recursiveSort(arr, numOfLines,order, ++counter);
	}
	else if (order == "descending")
	{
		if (counter > numOfLines - 1)
		{
			return;
		}
		int*maxValue = getMax(arr, numOfLines, counter);
		swap(*maxValue, arr[counter]);


		recursiveSort(arr, numOfLines, order, ++counter);
	}
}

int main(int argc, char* argv[])
{
	string fileName = argv[1];
	int numLines = atoi(argv[2]);
	string order = argv[3];
	string sorting = argv[4];

	cout << sorting << " " << order << endl;
	cout << "Before: ";
	ifstream infile(fileName);
	int* arr = new int[numLines];

	for (int i = 0; i < numLines; i++)
	{
		infile >> *(arr + i);
		cout << *(arr + i) << " ";
	}
	cout << endl;

	if (sorting == "normal")
	{
		normalSort(arr, numLines, order);
		printArray(arr, numLines);
	}
	else if (sorting == "recursive")
	{
		recursiveSort(arr, numLines, order);
		printArrayRec(arr, numLines,numLines);
	}
	cout << endl;

	delete[] arr;
	return 0;
}