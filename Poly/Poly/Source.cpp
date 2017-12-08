#include <iostream> 
#include <string> 
using namespace std;
class Animal {
public: Animal();
		virtual ~Animal();
		void message();
};
Animal::Animal()
{
	cout << "Animal constructor...\n";
}
Animal::~Animal()
{
	cout << "Animal destructor...\n";
}
void Animal::message()
{
	cout << "I am an animal! \n";
}
class Horse : public Animal
{
public: Horse();
		~Horse();
		virtual void message();
};
Horse::Horse()
{
	cout << " Horse constructor...\n";
}
Horse::~Horse()
{
	cout << " Horse destructor...\n";
}
void Horse::message()
{
	cout << "I am a horse! \n";
}
class Unicorn : public Horse {
public: Unicorn();
		~Unicorn();
		virtual void message();
};
Unicorn::Unicorn()
{
	cout << " Unicorn constructor...\n";
}
Unicorn::~Unicorn()
{
	cout << " Unicorn destructor...\n";
}
void Unicorn::message()
{
	cout << "I am a unicorn! \n";
}
void main() {
	Animal *a_ptr = new Horse();
	Horse *h_ptr = new Unicorn();
	a_ptr->message();
	h_ptr->message();
	delete h_ptr;
	delete a_ptr;
	cin.get();
}