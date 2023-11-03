a = int(input("Enter the first number:"))
b = int(input("Enter the second number:"))
c = int(input("Enter the third number:"))


def maximum(a, b, c):
    if a > b and a > c:
        print("The maximum number is:", a)
    elif b > a and b > c:
        print("The maximum number is:", b)
    else:
        print("The maximum number is:", c)
