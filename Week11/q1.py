arr = list(map(int, input().split()))

first_largest = arr[0]
second_largest = arr[1]


for i in range(2, len(arr)):
    if arr[i] > first_largest:
        second_largest = first_largest
        first_largest = arr[i]
    elif arr[i] > second_largest:
        second_largest = arr[i]

print("First largest number:", first_largest)
print("Second largest number:", second_largest)
