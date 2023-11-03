def is_accepting_state(current_state):
    return current_state == 2


def dfa_accepts(input_string):
    current_state = 0

    for char in input_string:
        if current_state == 0 and char == "0":
            current_state = 1
        elif current_state == 1 and char == "1":
            current_state = 2
        else:
            current_state = 0

    return is_accepting_state(current_state)


input_string = input("Enter a binary string: ")

if dfa_accepts(input_string):
    print("Accepted: The string ends with '01'.")
else:
    print("Rejected: The string does not end with '01'.")
