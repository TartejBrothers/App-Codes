#include <iostream>
#include <string>
#include <vector>
using namespace std;
struct Transaction {
    string type;
    double amount;
};

struct Account {
    int accountNumber;
    string customerName;
    double balance;
    vector<Transaction> transactions;
};


Account* createAccount(int accountNumber, const string& customerName) {
    Account* newAccount = new Account;
    newAccount->accountNumber = accountNumber;
    newAccount->customerName = customerName;
    newAccount->balance = 0.0;
    return newAccount;
}


void deposit(Account* account, double amount) {
    account->balance += amount;
    Transaction transaction;
    transaction.type = "Deposit";
    transaction.amount = amount;
    account->transactions.push_back(transaction);
    cout << "Amount deposited successfully.\n";
}


bool withdraw(Account* account, double amount) {
    if (account->balance >= amount) {
        account->balance -= amount;
        Transaction transaction;
        transaction.type = "Withdrawal";
        transaction.amount = amount;
        account->transactions.push_back(transaction);
        cout << "Amount withdrawn successfully.\n";
        return true;
    } else {
        cout << "Insufficient balance.\n";
        return false;
    }
}


void displayAccountInfo(const Account* account) {
    cout << "Account Number: " << account->accountNumber << "\n";
    cout << "Customer Name: " << account->customerName << "\n";
    cout << "Account Balance: " << account->balance << "\n";
}


void displayTransactionHistory(const Account* account) {
    cout << "Transaction History for Account Number " << account->accountNumber << ":\n";
    for (const auto& transaction : account->transactions) {
        cout << "Type: " << transaction.type << "\tAmount: " << transaction.amount << "\n";
    }
}

void deleteAccount(Account* account) {
    delete account;
}

int main() {
    vector<Account*> accounts;

    int accountNumber = 1001;
    int choice;
    do {
        cout << "\nBanking System Menu:\n";
        cout << "1. Create Account\n";
        cout << "2. Deposit\n";
        cout << "3. Withdraw\n";
        cout << "4. View Account Information\n";
        cout << "5. View Transaction History\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                string customerName;
                cout << "Enter customer name: ";
                cin.ignore(); 
                getline(cin, customerName);

                Account* newAccount = createAccount(accountNumber, customerName);
                accounts.push_back(newAccount);
                cout << "Account created successfully. Account number: " << accountNumber << "\n";
                accountNumber++;
                break;
            }
            case 2: {
                int accountNum;
                double amount;
                cout << "Enter account number: ";
                cin >> accountNum;

                Account* account = nullptr;
                for (const auto& acc : accounts) {
                    if (acc->accountNumber == accountNum) {
                        account = acc;
                        break;
                    }
                }

                if (account == nullptr) {
                    cout << "Account not found.\n";
                    break;
                }

                cout << "Enter amount to deposit: ";
                cin >> amount;
                deposit(account, amount);
                break;
            }
            case 3: {
                int accountNum;
                double amount;
                cout << "Enter account number: ";
                cin >> accountNum;

                Account* account = nullptr;
                for (const auto& acc : accounts) {
                    if (acc->accountNumber == accountNum) {
                        account = acc;
                        break;
                    }
                }

                if (account == nullptr) {
                    cout << "Account not found.\n";
                    break;
                }

                cout << "Enter amount to withdraw: ";
                cin >> amount;
                withdraw(account, amount);
                break;
            }
            case 4: {
                int accountNum;
                cout << "Enter account number: ";
                cin >> accountNum;

                Account* account = nullptr;
                for (const auto& acc : accounts) {
                    if (acc->accountNumber == accountNum) {
                        account = acc;
                        break;
                    }
                }

                if (account == nullptr) {
                    cout << "Account not found.\n";
                    break;
                }

                displayAccountInfo(account);
                break;
            }
            case 5: {
                int accountNum;
                cout << "Enter account number: ";
                cin >> accountNum;

                Account* account = nullptr;
                for (const auto& acc : accounts) {
                    if (acc->accountNumber == accountNum) {
                        account = acc;
                        break;
                    }
                }

                if (account == nullptr) {
                    cout << "Account not found.\n";
                    break;
                }

                displayTransactionHistory(account);
                break;
            }
            case 6:

                for (const auto& account : accounts) {
                    deleteAccount(account);
                }
                cout << "Exiting the program.\n";
                break;
            default:
                cout << "Invalid choice. Try again.\n";
        }
    } while (choice != 6);

    return 0;
}
