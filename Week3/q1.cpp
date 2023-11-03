#include <iostream>
using namespace std;
int add(int a, int b) {
    return a + b;
}
int sub(int a, int b) {
    return a - b;
}
int multi(int a, int b) {
    return a * b;
}


int divide(int a, int b) {
    if (b == 0) {
        cout << "Error: Cannot divide by zero!\n";
        return 0;
    }
    return a / b;
}
int main() {
    int num1, num2;
    char op;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;
    cout << "Enter an operator (+, -, *, /): ";
    cin >> op;
    int result;
    switch (op) {
        case '+':
            result = add(num1, num2);
            break;
        case '-':
            result = sub(num1, num2);
            break;
        case '*':
            result = multi(num1, num2);
            break;
        case '/':
            result = divide(num1, num2);
            break;
        default:
            cout << "Invalid operator!\n";
            return 1;
    }

    cout << "Result: " << result << endl;

    return 0;}




