#include <iostream>
using namespace std;

template<class T>
class FindMaxMin
{
private:
	T arr[6];
	T max;
	T min;
	T findMin()
	{
		min = arr[0];
		for(int i=1; i < 6; i++)
		{
			if (min > arr[i])
				min = arr[i];	
			
		}
		return min;
	}
	T findMax()
	{
		max = arr[0];
		for (int i = 1; i < 6; i++)
		{
			if (max < arr[i])
				max = arr[i];
		}
		return max;

	}

public:
	FindMaxMin(T arr1[])
	{
		for(int i=0; i < 6; i++ )
		{
			arr[i] = arr1[i];
			cout << arr[i];
		}
	}
	void display()
	{
		cout <<"MAX: " <<  findMax() << endl;
		cout <<"MIN: " <<  findMin() << endl;
	}
};

int main()
{
	int arr1[6] = { 1,2,3,4,5,6 };
	double arr2[6] = { 1.12,156.3,56.2,641.6,64.9,16.5 };
	float arr3[6] = { 1.5f,2.745f,7.5527f,4.6525f,524.57f,56275.42 };
	char arr4[6] = { 'a','b','c','d','e','f' };

	FindMaxMin<int> pass1(arr1);
	pass1.display();
	cin.get();
}