def is_accepting_state(current_state):
    return current_state in [2, 4]


def nfa_accepts(input_string):
    current_state = 0

    for char in input_string:
        if current_state == 0 and char == "a":
            current_state = 1
        elif current_state == 0 and char == "b":
            current_state = 3
        elif current_state == 1 and char == "b":
            current_state = 2
        elif current_state == 2:
            break
        elif current_state == 3 and char == "a":
            current_state = 4
        elif current_state == 4:
            break
        else:
            return False

    return is_accepting_state(current_state)


input_string = input("Enter a string to check if it matches 'ab|ba': ")

if nfa_accepts(input_string):
    print("Accepted: The string matches 'ab|ba'.")
else:
    print("Rejected: The string does not match 'ab|ba'.")
