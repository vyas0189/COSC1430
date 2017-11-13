#include <iostream>
#include <ctime>
using namespace std;

class Vehicle {
	int am, capp;
	bool app;
public:

	void setfuelAmount(int amount) {
		am = amount;
	}
	void setcapacity(int cap) {
		capp = cap;
	}
	void setapplyBrakes(bool apply) {
		app = apply;
	}
	int getfuelAmount() {
		return am;
	}
	int getcapacity() {
		return capp;
	}
	bool getapplyBrakes() {
		return app;
	}
};

class Bus : public Vehicle {};
class Car : public Vehicle {};
class Truck : public Vehicle {};

int main() {
	Bus bus;
	Car car;
	Truck truck;

	bus.setfuelAmount(100);
	bus.setcapacity(10);
	bus.setapplyBrakes(true);

	car.setfuelAmount(100);
	car.setcapacity(110);
	car.setapplyBrakes(false);

	truck.setfuelAmount(100);
	truck.setcapacity(150);
	truck.setapplyBrakes(true);

	cout << "Bus " << bus.getfuelAmount() << " " << bus.getcapacity() << " " << bus.getapplyBrakes() << endl;
	cout << "Car " << car.getfuelAmount() << " " << car.getcapacity() << " " << car.getapplyBrakes() << endl;
	cout << "Truck " << truck.getfuelAmount() << " " << truck.getcapacity() << " " << truck.getapplyBrakes() << endl;

	int start_s = clock();
	// the code you wish to time goes here
	int stop_s = clock();
	cout << "time: " << (stop_s - start_s) / double(CLOCKS_PER_SEC) * 1000 << endl;


	system("pause");
	return 0;
}