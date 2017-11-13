#include <iostream>
using namespace std;

void sort(int arr[], int size);

void sort(int arr[], int size)
{
	for(int i=0; i <size; i++)
	{
		for(int j=0; j<size; j++)
		{
			if(arr[i] < arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	cout << "Sorted Array: " << " ";
	for(int i =0; i < size; i++)
	{
		cout << arr[i] << " ";
	}
}


int main()
{
	int arr[10];
	cout << "Enter the elements: " << endl;

	for(int i=0; i < 10; i++)
	{
		cin >> arr[i];
	}
	sort(arr, 10);
	system("pause");
}

