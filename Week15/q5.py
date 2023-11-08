
from sympy import symbols, sin
from sympy import Limit

x = symbols('x')
expr = (sin(x) - x) / x**3
limit_expr = Limit(expr, x, 0).doit()

print(limit_expr)
