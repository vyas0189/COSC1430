#include <iostream>
using namespace std;


class Rectangle
{
	int height, width;
public:
	Rectangle();
	Rectangle(int w, int h);
	void setWidth(int w);
	void setHeight(int h);
	int getWidth();
	int getHeight();
	int getArea();
};


Rectangle::Rectangle(): height(0), width(0)
{
}

Rectangle::Rectangle(int w, int h)
{
	height = h;
	width = w;
}

void Rectangle::setWidth(int w)
{
	width = w;
}
void Rectangle::setHeight(int h)
{
	height = h;
}
int Rectangle::getWidth()
{
	return width;
}
int Rectangle::getHeight()
{
	return height;
}
int Rectangle::getArea()
{
	return getHeight() * getWidth();
}

int main()
{
	Rectangle rect(5,4);
	cout << "Height: " << rect.getHeight()<< endl;
	cout << "Width: " << rect.getWidth() << endl;
	cout << rect.getArea() << endl;
	
}



