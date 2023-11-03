a = int(input("Enter a number: "))
if a % 2 == 0:
    print("The number is even")
else:
    print("The number is odd")
if a > 1:
    for i in range(2, a):
        if a % i == 0:
            print("The number is not prime")
            break
    else:
        print("The number is prime")
else:
    print("The number is not prime")
