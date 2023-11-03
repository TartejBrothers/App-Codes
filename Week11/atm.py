# create an atm app
a = 0
b = 0
c = 0
d = 0
e = 0
flag = 0
while True:
    print("Welcome to the ATM")
    print("1. Deposit")
    print("2. Withdraw")
    print("3. Balance")
    print("4. Exit")
    choice = int(input("Enter your choice: "))
    if choice == 1:
        a = int(input("Enter the amount to be deposited: "))
        print("Amount deposited: ", a)
        flag = 1
    elif choice == 2:
        if flag == 0:
            print("Please deposit some amount first")
        else:
            b = int(input("Enter the amount to be withdrawn: "))
            if b > a:
                print("Insufficient balance")
            else:
                print("Amount withdrawn: ", b)
                a = a - b
    elif choice == 3:
        print("Balance: ", a)
    elif choice == 4:
        print("Thank you for using the ATM")
        break
    else:
        print("Invalid choice")
