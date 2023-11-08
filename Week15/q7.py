
from sympy import symbols, solve
x, y = symbols('x y')
eq1 = x + y - 2
eq2 = 2*x + y

sol = solve((eq1, eq2), (x, y))
print(sol)
