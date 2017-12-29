#include <iostream>
#include <cassert>
#include <fstream>
using namespace std;
double toInches(double inch)
{
	assert(inch >= 0);
	return 2.54 * inch;
}
int main()
{
	cerr << "Error testing" << endl;
	double in = toInches(5);
	cout << in << endl;
	/*try{
		ifstream myFile("examle.txt");
		ofstream outFile("new.txt");
		if (myFile.fail() || outFile.fail()) { throw - 1; }
		char letters[15];
		for(int i=0; i < 15;i++)
		{
			myFile >> letters[i];
		}
		for (int j=0; j < 15;j++)
		{
			if (letters[j] % 3 == 0)
				letters[j] += 3;
			else if(letters[j] % 2 == 0)
				letters[j] += 2;
			else
				letters[j] += 1;
		}
		for(int k= 0; k <15; k++)
		{
			cout << letters[k] << endl;
			outFile << letters[k]<< endl;
		}

		myFile.close();
		outFile.close();
	}
	catch(int e)
	{
		cout << "File not found"<< endl;
	}*/
	system("pause");
}