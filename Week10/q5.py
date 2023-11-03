def reverse(s):
    print("The reverse of the string is:", s[::-1])
    return s[::-1]


def isPalindrome(s):
    rev = reverse(s)
    if s == rev:
        print("The string is a palindrome")
    else:
        print("The string is not a palindrome")


s = input("Enter a string: ")
isPalindrome(s)
