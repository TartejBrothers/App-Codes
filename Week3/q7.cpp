#include <iostream>
#include <fstream>
#include <vector>
#include <string>
using namespace std;


int main() {
    string filename;
    cout << "Enter the name of the text file: ";
    cin >> filename;

    ifstream inputFile(filename);

    if (!inputFile.is_open()) {
        cout << "Error: Unable to open the file.\n";
        return 1;
    }

    vector<string> lines;
    string line;

    while (getline(inputFile, line)) {
        lines.push_back(line);
    }

    inputFile.close();

    if (lines.empty()) {
        cout << "The file is empty.\n";
        return 0;
    }

    cout << "Content of the file with line numbers:\n";
    for (size_t i = 0; i < lines.size(); i++) {
        cout << i + 1 << ". " << lines[i] << endl;
    }

    return 0;
}