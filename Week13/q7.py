def dfa_accepts(input_string):
    current_state = 0

    for char in input_string:
        if current_state == 0 and char == "a":
            current_state = 1
        elif current_state == 1:
            if char == "b":
                current_state = 1
            elif char == "c":
                current_state = 2
            else:
                current_state = 0
        elif current_state == 2:
            return False
    return current_state == 1


input_string = input("Enter a string to check if it matches 'ab*c': ")

if dfa_accepts(input_string):
    print("Accepted: The string matches 'ab*c'.")
else:
    print("Rejected: The string does not match 'ab*c'.")
