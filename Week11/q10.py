num_terms = int(input("Enter the number of terms: "))

fib_seq = [0, 1]

for i in range(2, num_terms):
    next_term = fib_seq[i - 1] + fib_seq[i - 2]
    fib_seq.append(next_term)

print(fib_seq)
