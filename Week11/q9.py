
length_criteria = 8
uppercase_criteria = 1
lowercase_criteria = 1
digit_criteria = 1
special_char_criteria = 1
password = input("Enter your password: ")

uppercase_count = 0
lowercase_count = 0
digit_count = 0
special_char_count = 0

if len(password) >= length_criteria:
    print("Length criteria met")
else:
    print("Length criteria not met")

for char in password:
    if char.isupper():
        uppercase_count += 1

if uppercase_count >= uppercase_criteria:
    print("Uppercase criteria met")
else:
    print("Uppercase criteria not met")

for char in password:
    if char.islower():
        lowercase_count += 1

if lowercase_count >= lowercase_criteria:
    print("Lowercase criteria met")
else:
    print("Lowercase criteria not met")

# Check for digits
for char in password:
    if char.isdigit():
        digit_count += 1

if digit_count >= digit_criteria:
    print("Digit criteria met")
else:
    print("Digit criteria not met")

special_chars = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ';', ':', '\'', '\"', ',', '<', '.', '>', '/', '?']
for char in password:
    if char in special_chars:
        special_char_count += 1

if special_char_count >= special_char_criteria:
    print("Special character criteria met")
else:
    print("Special character criteria not met")
