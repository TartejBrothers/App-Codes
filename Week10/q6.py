def fibonacci(n):
    a, b = 0, 1
    for i in range(n):
        yield a
        a, b = b, a + b

n = int(input("Enter the number of terms: "))
for term in fibonacci(n):
    print(term)
