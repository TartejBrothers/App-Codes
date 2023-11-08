

from sympy import symbols, diff, log, sin, cos

# Define the symbols
x = symbols('x')

# Calculate the derivatives
d_log = diff(log(x), x)
d_inv = diff(1/x, x)
d_sin = diff(sin(x), x)
d_cos = diff(cos(x), x)

# Print the results
print("The derivative of log(x) is:", d_log)
print("The derivative of 1/x is:", d_inv)
print("The derivative of sin(x) is:", d_sin)
print("The derivative of cos(x) is:", d_cos)
