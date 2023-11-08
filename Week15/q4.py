
import sympy

x = sympy.symbols('x')
expr = sympy.sin(x)/sympy.cos(x)
simplified_expr = sympy.simplify(expr)
print(simplified_expr)
