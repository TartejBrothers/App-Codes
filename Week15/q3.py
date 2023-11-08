
from sympy import expand, symbols

x, y = symbols('x y')
expression = (x + y) ** 6
expanded_expression = expand(expression)

print(expanded_expression)
