dfa = {
    0: {"a": 1, "b": 0},
    1: {"a": 2, "b": 0},
    2: {"a": 3, "b": 0},
    3: {"a": 3, "b": 3},
}


def is_accepting_string(input_string):
    current_state = 0
    for symbol in input_string:
        if symbol in dfa[current_state]:
            current_state = dfa[current_state][symbol]
        else:
            return False
    return current_state == 3


input_string = input("Enter a string: ")

if is_accepting_string(input_string):
    print(f"'{input_string}' is accepted")
else:
    print(f"'{input_string}' is rejected")
