
import sympy as sp
import sympy as sp
x, y = sp.symbols('x y')
f = x**2
x, y = sp.symbols('x y')
f1 = sp.sin(x)
f2 = sp.cos(x)
f3 = x**2

int_f1 = sp.integrate(f1, x)
int_f2 = sp.integrate(f2, x)
int_f3 = sp.integrate(f3, x)

print(int_f1)
print(int_f2)
print(int_f3)

