input_list = input("Enter a list of numbers separated by space: ").split()

unique_list = []


for num in input_list:

    if num not in unique_list:
        unique_list.append(num)

print(unique_list)
