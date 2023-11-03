#include <iostream>
using namespace std;
class Stack {
private:
    int* arr;
    int capacity;
    int top;
public:
    Stack(int capacity) {
        this->capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    ~Stack() {
        delete[] arr;
    }

    void push(int element) {
        if (top == capacity - 1) {
            cout << "Stack Overflow: Cannot push element, the stack is full.\n";
            return;
        }
        arr[++top] = element;
    }

    void pop() {
        if (top == -1) {
            cout << "Stack Underflow: Cannot pop element, the stack is empty.\n";
            return;
        }
        top--;
    }

    int peek() {
        if (top == -1) {
            cout << "Stack is empty.\n";
            return -1;
        }
        return arr[top];
    }

    bool isEmpty() {
        return top == -1;
    }

    void display() {
        if (top == -1) {
            cout << "Stack is empty.\n";
            return;
        }

        cout << "Stack elements from top to bottom:\n";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << endl;
        }
    }
};

int main() {
    int capacity,i,a;
    cout << "Enter the capacity of the stack: ";
    cin >> capacity;

    Stack stack(capacity);
    for(i=0;i<capacity;i++){
        cin>>a;
        stack.push(a);
    }

    cout << "Stack top element: " << stack.peek() << endl;

    stack.pop();

    stack.display();

    return 0;
}



