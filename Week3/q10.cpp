#include <iostream>
using namespace std;
class Image { 
    private:
int width; int height; int** pixels;
    public:
    Image(int w, int h) : width(w), height(h) { pixels = new int*[height];
    for (int i = 0; i < height; ++i) {
    pixels[i] = new int[width];}}
~Image() {
for (int i = 0; i < height; ++i) {
delete[] pixels[i];
}
delete[] pixels;
   }
void resize(int newWidth, int newHeight) {
cout << "Resizing image to " << newWidth << "x" << newHeight << endl; }
void manipulate() {

cout << "Applying image manipulation" << endl;
}
void printDetails() {
cout << "Image details:" << endl;
cout << "Width: " << width << endl;
cout << "Height: " << height << endl;}};
int main() {
int width, height;
cout << "Enter image width: ";
cin >> width;
cout << "Enter image height: ";
cin >> height;
Image image(width, height); image.printDetails();
int newWidth, newHeight;
cout << "Enter new width for resizing: "; cin >> newWidth;
cout << "Enter new height for resizing: ";
cin >> newHeight; image.resize(newWidth, newHeight); image.manipulate();
return 0;
}