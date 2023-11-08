
from sympy import Matrix


coefficients = Matrix([[2, 7], [4, -2]])
constants = Matrix([12, 5])
solution = coefficients.solve(constants)


print(solution)
