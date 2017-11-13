#include <iostream>
using namespace std;

class Vehicle {
protected:
	int fuel;
	int capacity;
	bool brake;

public:
	Vehicle() {

	}

	Vehicle(int a, int b, bool c) {
		fuel = a;
		capacity = b;
		brake = c;
	}

	void setFuelAmount(int a) {
		fuel = a;
	}

	void setCapacity(int b) {
		capacity = b;
	}

	void setBrake(bool c) {
		brake = c;
	}

	int getFuel() {
		return fuel;
	}

	int getCapacity() {
		return capacity;
	}

	bool getBrake() {
		return brake;
	}

	virtual void printInfo() {
		cout << "Info on Vehicle: Fuel = " << fuel;
		cout << " Capacity = " << capacity;
		cout << " Brake = " << true;
		cout << endl;
	}
};

class Bus : public Vehicle {
public:
	Bus() {}
	Bus(int a, int b, bool c) {
		fuel = a;
		capacity = b;
		brake = c;
	}

	void printInfo() {
		cout << "Info on Bus: Fuel = " << fuel;
		cout << " Capacity = " << capacity;
		cout << " Brake = " << true;
		cout << endl;

	}
};

class Truck : public Vehicle {
public:
	Truck() {}
	Truck(int a, int b, bool c) {
		fuel = a;
		capacity = b;
		brake = c;
	}

	void printInfo() {
		cout << "Info on Truck: Fuel = " << fuel;
		cout << " Capacity = " << capacity;
		cout << " Brake = " << true;
		cout << endl;
	}
};

class Car : public Vehicle {
public:
	Car() {}
	Car(int a, int b, bool c) {
		fuel = a;
		capacity = b;
		brake = c;
	}

	void printInfo() {
		cout << "Info on Car: Fuel = " << fuel;
		cout << " Capacity = " << capacity;
		cout << " Brake = " << true;
		cout << endl;
	}
};

int main(int args, char* argv[]) {
	Bus bus1(15, 12, false);
	bus1.printInfo();
	bus1.setCapacity(5);
	bus1.setFuelAmount(7);
	bus1.setBrake(true);
	bus1.printInfo();

	Car car1(12, 12, false);
	car1.printInfo();
	car1.setCapacity(10);
	car1.setFuelAmount(10);
	car1.setBrake(true);
	car1.printInfo();

	Truck truck1(9, 10, true);
	truck1.printInfo();
	truck1.setCapacity(20);
	truck1.setFuelAmount(22);
	truck1.setBrake(false);
	truck1.printInfo();

	//system("pause");
	return 0;
}