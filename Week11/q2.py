arr = list(map(int, input("Enter the array elements separated by space: ").split()))

sum_even = 0
sum_odd = 0

for num in arr:
    if num % 2 == 0:
        sum_even += num
    else:
        sum_odd += num
print("Sum of even numbers:", sum_even)
print("Sum of odd numbers:", sum_odd)
