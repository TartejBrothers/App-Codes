dfa = {
    0: {'0': 1, '1': 0},
    1: {'0': 2, '1': 0},
    2: {'0': 2, '1': 2}
}

def is_accepting_string(input_string):
    current_state = 0
    for symbol in input_string:
        if symbol in dfa[current_state]:
            current_state = dfa[current_state][symbol]
        else:
            return False
    return current_state == 2
a=int(input("enter the number of strings : "))
for i in range(a):
    b=input("Enter the string : ")
    print(is_accepting_string(b))


