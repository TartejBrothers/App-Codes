
from sympy import symbols, Function, diff, Eq, solve

x = symbols('x')
f = Function('f')(x)

diff_eq = Eq(diff(f, x, x) + 9*f, 1)

solution = solve(diff_eq, f)

print(solution)
