def matrix_multiplication(matrix1, matrix2):
    if len(matrix1[0]) != len(matrix2):
        return "Matrices are not compatible for multiplication."

    result = [[0 for _ in range(len(matrix2[0]))] for _ in range(len(matrix1))]

    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            for k in range(len(matrix2)):
                result[i][j] += matrix1[i][k] * matrix2[k][j]

    return result


matrix1 = []
matrix2 = []

print("Enter the elements of matrix1 row-wise:")
for i in range(int(input("Enter the number of rows of matrix1: "))):
    row = []
    for j in range(int(input("Enter the number of columns of matrix1: "))):
        row.append(int(input(f"Enter the element at position ({i+1}, {j+1}): ")))
    matrix1.append(row)

print("Enter the elements of matrix2 row-wise:")
for i in range(int(input("Enter the number of rows of matrix2: "))):
    row = []
    for j in range(int(input("Enter the number of columns of matrix2: "))):
        row.append(int(input(f"Enter the element at position ({i+1}, {j+1}): ")))
    matrix2.append(row)

result = matrix_multiplication(matrix1, matrix2)

if type(result) == str:
    print(result)
else:
    print("The product of the matrices is:")
    for row in result:
        print(row)
