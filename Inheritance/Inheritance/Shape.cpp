#include <iostream>
using namespace std;

class Shape
{
private:
	double width, height;
public:
	virtual ~Shape() = default;

	Shape()
	{
		width = 10;
		height = 10;
	}
	Shape(double width, double height)
	{
		this->height = height;
		this->width = width;
	}
	void setHeight(double height)
	{
		this->height = height;
	}
	void setWidth(double width)
	{
		this->width = width;
	}
	double getHeight()
	{
		return height;
	}
	double setWidth()
	{
		return width;
	}
	virtual void getArea() = 0;
	
};
class Triangle: public Shape
{
	double width, height;
public:
	Triangle(double width,double height): Shape(width,height)
	{
		this->height = height;
		this->width = width;
	}
	Triangle(): Shape(), width(0), height(0)
	{
	}

	void getArea() override
	{
		cout << "The are of the Triangle is: " << (width*height) / 2 << endl;
	}
};
//class Rectangle : public Shape
//{
//	double width, height;
//public:
//	Rectangle(double width, double height) : Shape(width, height)
//	{
//		this->height = height;
//		this->width = width;
//	}
//	Rectangle() : Shape(), width(0), height(0)
//	{
//	}
//
//	void getArea() override
//	{
//		cout << "The are of the Rectangle is: " << (width*height) << endl;
//	}
//};

int main()
{
	Triangle triangle1;
	//Triangle triangle2(5, 10);
	triangle1.setHeight(3);
	triangle1.setWidth(5);
	triangle1.getArea();
	//triangle2.getArea();
	system("pause");
}
