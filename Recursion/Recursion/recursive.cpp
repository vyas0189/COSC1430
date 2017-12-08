#include <iostream>
#include <fstream>
#include <string>
using namespace std;


void problemOneForward(int arr[],int size)
{
	if(size ==1)
	{
		cout << arr[0] << " ";
	}
	else
	{
		problemOneForward(arr, size - 1);
		cout << arr[size - 1] << " ";
	}
}

void problemOneBackward(int arr[], int size)
{
	
	if(size >0)
	{
		cout << arr[size - 1] << " ";
		problemOneBackward(arr, size - 1);
	}
}

bool isPal(string &str, int start, int end)
{
	if (start >= end)
		return true;
	if (str[start] != str[end])
		return false;
	return isPal(str, ++start, --end);
}
int main()
{
	cout << "PROBLEM 1" << endl;
	ifstream myFile("data.txt");
	int arr[10];
	for(int i=0; i <10; i++)
	{
		myFile >> arr[i];
	}

	cout << "Forward: ";
	problemOneForward(arr, 10);
	cout << endl;
	cout << "Backward: ";
	problemOneBackward(arr, 10);
	cout << endl;
	cout << "----------------------------------------------" << endl;

	cout << "PROBLEM 2" << endl;
	string pword;
	cout << "Enter a palindrome word: ";
	cin >> pword;
	int start = 0;
	int end = pword.length()-1;
	bool isPall = isPal(pword, start, end);
	if(isPall)
	{
		cout << "The word is palindrome" << endl;
	}
	else
	{
		cout << "The word is not palindrome" << endl;
	}
	cout << "----------------------------------------------" << endl;

	cout << "PROBLEM 3" << endl;


	system("pause");
	
}