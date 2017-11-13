#include <iostream>
#include <fstream>
#include <string>
using namespace std;

void readFile(string fileName, string words[], int numOfWords);
void replaceWord(string &word, char toReplaceInWord);
void writeFile(string fileName, string words[], int numberOfWords);

void readFile(string fileName, string words[], int numOfWords)
{
	ifstream input_file(fileName);
	for(int i=0; i < numOfWords; i++)
	{
		getline(input_file, words[i]);
	}
	input_file.close();
}


void replaceWord(string &word, char toReplaceInWord)
{
	if(word[0] == toReplaceInWord)
	{
		word = "----\r" ;
	}
}

void writeFile(string fileName, string words[], int numberOfWords)
{
	ofstream out_file(fileName);

	for(int i=0; i < numberOfWords; i++)
	{
		out_file << words[i]<< endl;
	}
	out_file.close();
}

int main(int argc, char* argv[]) {
	//Check correct number of arguments
	if (argc != 5) {
		cout << "Error" << endl;
		return 0;
	}
	//Handling cmd line args
	//YOU MUST INITIALIZE THEIR VALUES!
	string inputFileName = argv[1];
	string outputFileName = argv[2];
	int numberOfWords = atoi(argv[3]);
	char* lettersToReplace = argv[4];

	//Checking valid input	
	if (numberOfWords <= 0) {
		cout << "Error" << endl;
		return 0;
	}
	string words[numberOfWords];
	//Reading input from file
	readFile(inputFileName, words, numberOfWords);

	for(int i=0; i < numberOfWords; i++)
	{
		for (int k = 0; k < strlen(lettersToReplace); k++) {
			replaceWord(words[i], lettersToReplace[k]);
		}
	}

	//Output the file
	writeFile(outputFileName, words, numberOfWords);
	return 0;
}