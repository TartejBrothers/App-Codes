def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

temperature = float(input("Enter temperature: "))
unit = input("Enter unit (C/F): ")

if unit == "C":
    fahrenheit = celsius_to_fahrenheit(temperature)
    print(f"{temperature}°C is equal to {fahrenheit}°F")
elif unit == "F":
    celsius = fahrenheit_to_celsius(temperature)
    print(f"{temperature}°F is equal to {celsius}°C")
else:
    print("Invalid unit entered. Please enter 'C' or 'F'.")
