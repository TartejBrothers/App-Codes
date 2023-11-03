def is_accepting_state(current_state):
    return current_state == 1

def nfa_accepts(input_string):
    current_state = 0
    for char in input_string:
        if current_state == 0 and char == 'a':
            current_state = 1
        elif current_state == 1 and char == 'a':
            current_state = 1

    return is_accepting_state(current_state)


input_string = input("Enter a string to check if it contains only 'a's: ")

if nfa_accepts(input_string):
    print("Accepted: The string contains only 'a's.")
else:
    print("Rejected: The string does not contain only 'a's.")
