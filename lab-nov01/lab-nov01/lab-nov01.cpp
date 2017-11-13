#include <iostream>
#include <string>
using namespace std;


void recursive(int i)
{
	using namespace std;
	if (i < 8)
	{
		i++;
		recursive(i);
		cout << i << " ";
	}
}


int main() {
	recursive(5);
	return 0;
}