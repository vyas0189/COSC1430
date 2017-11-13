#include <iostream>
#include <string>
#include "Car.h"
using namespace std;

void problemOne(int arraySize) {
	int numbers[arraySize];
	for (int i = 0; i < arraySize; ++i) {
		cout << "Enter next number" << endl;
		cin >> numbers[i];
	}
	int *p = numbers;
	for (int i = 0; i < arraySize;i++) {
		p = &numbers[i];

		cout << *p << " ";
	}
	cout << endl;
}
void problemTwo(int arraySize) {
	cout << "Problem 2" << endl;
	int* numbers = new int[arraySize];

	int temp;
	for (int i = 0; i < arraySize; i++)
	{
		cout << "Enter next Number: ";
		cin >> temp;
		*(numbers + i) = temp;
	}
	for (int j = 0; j <arraySize; j++)
	{
		cout << *(numbers + j) << " ";
	}
	cout << endl;
	delete[] numbers;
}
void problemThree(int arraySize) {

	cout << "Problem 3" << endl;
	
	Car *cars = new Car[arraySize];
	string model, color;
	int mileage;
	for(int i=0; i < arraySize; i++)
	{
		cout << "Enter model for car " << i+1 << ":";
		cin >> model;
		cout << "Enter color for car " << i+1 << ":";
		cin >> color;
		cout << "Enter the mileage for car " << i+1 << ":";
		cin >> mileage;

		*(cars +i)= Car(model, color, mileage);	
	}

	for (int j = 0; j< arraySize; j++)
	{
		cout << (cars+j)->model << " " << (cars+j)->color << " "<< (cars+j)->getMileage() << endl;
	}
	delete[] cars;
}
int main(int argc, char* argv[]) {
	problemOne(atoi(argv[1]));
	problemTwo(atoi(argv[2]));
	problemThree(atoi(argv[3]));
	return 0;
}