real1 = float(input("Enter the real part of the first complex number: "))
imaginary1 = float(input("Enter the imaginary part of the first complex number: "))


real2 = float(input("Enter the real part of the second complex number: "))
imaginary2 = float(input("Enter the imaginary part of the second complex number: "))


add_real = real1 + real2
add_imaginary = imaginary1 + imaginary2


sub_real = real1 - real2
sub_imaginary = imaginary1 - imaginary2


mul_real = (real1 * real2) - (imaginary1 * imaginary2)
mul_imaginary = (real1 * imaginary2) + (imaginary1 * real2)


print("Addition: ", add_real, "+", add_imaginary, "i")
print("Subtraction: ", sub_real, "-", sub_imaginary, "i")
print("Multiplication: ", mul_real, "+", mul_imaginary, "i")
