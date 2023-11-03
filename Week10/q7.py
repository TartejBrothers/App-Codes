import math

def calculate_circle(radius):
    area = math.pi * radius ** 2
    perimeter = 2 * math.pi * radius
    return area, perimeter

def calculate_rectangle(length, width):
    area = length * width
    perimeter = 2 * (length + width)
    return area, perimeter

def calculate_triangle(base, height, side1, side2):
    area = 0.5 * base * height
    perimeter = base + side1 + side2
    return area, perimeter

shape = input("Enter the shape (circle, rectangle, triangle): ")

if shape == "circle":
    radius = float(input("Enter the radius: "))
    circle_area, circle_perimeter = calculate_circle(radius)
    print("Circle Area:", circle_area)
    print("Circle Perimeter:", circle_perimeter)

elif shape == "rectangle":
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))
    rectangle_area, rectangle_perimeter = calculate_rectangle(length, width)
    print("Rectangle Area:", rectangle_area)
    print("Rectangle Perimeter:", rectangle_perimeter)

elif shape == "triangle":
    base = float(input("Enter the base: "))
    height = float(input("Enter the height: "))
    side1 = float(input("Enter the first side: "))
    side2 = float(input("Enter the second side: "))
    triangle_area, triangle_perimeter = calculate_triangle(base, height, side1, side2)
    print("Triangle Area:", triangle_area)
    print("Triangle Perimeter:", triangle_perimeter)

else:
    print("Invalid shape entered.")
