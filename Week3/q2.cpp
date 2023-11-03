#include <iostream>
#include <string>
#include <vector>
using namespace std;
struct Student {
    string name;
    int id;
    double gpa;
};
vector<Student> students;
void addStudent() {
    Student student;
    cout << "Enter student name: ";
    getline(cin, student.name);
    cout << "Enter student ID: ";
    cin >> student.id;
    cout << "Enter student GPA: ";
    cin >> student.gpa;
    students.push_back(student);
    cout << "Student added successfully!" << endl;
}
void printStudents() {
    if (students.empty()) {
        cout << "No students in the database." << endl;
    } else {
        cout << "Students in the database:" << endl;
        for (const auto& student : students) {
            cout << "Name: " << student.name << ", ID: " << student.id << ", GPA: " << student.gpa << endl;
        }
    }
}
void searchStudent() {
    int id;
    cout << "Enter student ID to search for: ";
    cin >> id;
    for (const auto& student : students) {
        if (student.id == id) {
            cout << "Student found:" << endl;
            cout << "Name: " << student.name << ", ID: " << student.id << ", GPA: " << student.gpa << endl;
            return;
        }
    }
    cout << "Student not found." << endl;
}
void deleteStudent() {
    int id;
    cout << "Enter student ID to delete: ";
    cin >> id;
    for (auto it = students.begin(); it != students.end(); ++it) {
        if (it->id == id) {
            students.erase(it);
            cout << "Student deleted successfully!" << endl;
            return;
        }
    }
    cout << "Student not found." << endl;
}
int main() {
    while (true) {
        cout << "Select an option:" << endl;
        cout << "1. Add a student" << endl;
        cout << "2. Print all students" << endl;
        cout << "3. Search for a student" << endl;
        cout << "4. Delete a student" << endl;
        cout << "5. Quit" << endl;
        int option;
        cin >> option;
        cin.ignore();
        switch (option) {
            case 1:
                addStudent();
                break;
            case 2:
                printStudents();
                break;
            case 3:
                searchStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                return 0;
            default:
                cout << "Invalid option. Please try again." << endl;
        }
    }
}
