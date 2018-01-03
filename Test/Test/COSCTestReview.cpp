#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int stuID = 1;
int proID = 1;
class Person {
protected:
	string name;
	int age,id;
public:
	virtual void getdata() {};
	virtual void putdata() {};
};

class Professor :public Person {
public:
	//publications and cur_id
	int publications;
	Professor()
	{
		id = proID++;
	}
	void getdata()
	{
		cin >> name;
		cin >> age;
		cin >> publications;
	}
	void putdata()
	{
		cout << name << " " << age << " " << publications << id << endl;
	}
};
class Student :public Person {
public:
	int marks[6],score;
	int size = sizeof(marks) / sizeof(marks[0]);
	Student()
	{
		id = stuID++;
	}
	void getdata()
	{
		cin >> name >> age;
		int sum = 0;
		for(int i=0; i < size; i++)
		{
			cin >> marks[i];
			sum += marks[i];
		}
		score = sum;
	}
	void putdata() {
		cout << name << " " << age << " " << score << " " << id << endl;
	}
};

int main() {

	int n, val;
	cin >> n; //The number of objects that is going to be created.
	Person *per[n];

	for (int i = 0; i < n; i++) {

		cin >> val;
		if (val == 1) {
			// If val is 1 current object is of type Professor
			per[i] = new Professor;

		}
		else per[i] = new Student; // Else the current object is of type Student

		per[i]->getdata(); // Get the data from the user.

	}

	for (int i = 0; i<n; i++)
		per[i]->putdata(); // Print the required output for each object.

	return 0;

}

//double toInches(double inch)
//{
//	assert(inch >= 0);
//	return 2.54 * inch;
//}
//int main()
//{
//	cerr << "Error testing" << endl;
//	double in = toInches(5);
//	cout << in << endl;
//	/*try{
//		ifstream myFile("examle.txt");
//		ofstream outFile("new.txt");
//		if (myFile.fail() || outFile.fail()) { throw - 1; }
//		char letters[15];
//		for(int i=0; i < 15;i++)
//		{
//			myFile >> letters[i];
//		}
//		for (int j=0; j < 15;j++)
//		{
//			if (letters[j] % 3 == 0)
//				letters[j] += 3;
//			else if(letters[j] % 2 == 0)
//				letters[j] += 2;
//			else
//				letters[j] += 1;
//		}
//		for(int k= 0; k <15; k++)
//		{
//			cout << letters[k] << endl;
//			outFile << letters[k]<< endl;
//		}
//
//		myFile.close();
//		outFile.close();
//	}
//	catch(int e)
//	{
//		cout << "File not found"<< endl;
//	}*/
//	system("pause");
//}