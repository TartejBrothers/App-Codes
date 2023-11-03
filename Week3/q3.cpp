#include <iostream>
#include <cmath>
using namespace std;
void circleProperties(double radius, double& area, double& perimeter) {
    const double pi = 3.14159;
    area = pi * radius * radius;
    perimeter = 2 * pi * radius;}
void rectangleProperties(double length, double width, double& area, double& perimeter) {
    area = length * width;
    perimeter = 2 * (length + width);}
void triangleProperties(double side1, double side2, double side3, double& area, double& perimeter) {
    double s = (side1 + side2 + side3) / 2;
    area = sqrt(s * (s - side1) * (s - side2) * (s - side3));
    perimeter = side1 + side2 + side3;}
int main() {
    int choice;
    double area, perimeter;
    do {
        cout << "Select a shape to calculate properties:\n";
        cout << "1. Circle\n";
        cout << "2. Rectangle\n";
        cout << "3. Triangle\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice) {
            case 1: {
                double radius;
                cout << "Enter the radius of the circle: ";
                cin >> radius;
                circleProperties(radius, area, perimeter);
                cout << "Area: " << area << "\n";
                cout << "Perimeter: " << perimeter << "\n";
                break;}
            case 2: {
                double length, width;
                cout << "Enter the length of the rectangle: ";
                cin >> length;
                cout << "Enter the width of the rectangle: ";
                cin >> width;
                rectangleProperties(length, width, area, perimeter);
                cout << "Area: " << area << "\n";
                cout << "Perimeter: " << perimeter << "\n";
                break;}
            case 3: {
                double side1, side2, side3;
                cout << "Enter the length of side 1 of the triangle: ";
                cin >> side1;
                cout << "Enter the length of side 2 of the triangle: ";
                cin >> side2;
                cout << "Enter the length of side 3 of the triangle: ";
                cin >> side3;
                triangleProperties(side1, side2, side3, area, perimeter);
                cout << "Area: " << area << "\n";
                cout << "Perimeter: " << perimeter << "\n";
                break;}
            case 4:{
                cout << "Exiting the program.\n";
                break;}
            default:
                cout << "Invalid choice. Try again.\n";}
        cout << endl;
    } while (choice != 4);
    return 0;}