class NFA:
    def __init__(self):
        self.states = {0, 1, 2, 3, 4}
        self.alphabet = {'a', 'b'}
        self.transitions = {
            0: {'a': {1}, 'b': {2}},
            1: {'a': {1}, 'b': {2}},
            2: {'a': {3}, 'b': {4}},
            3: {'a': {3}, 'b': {4}},
            4: {'a': {3}, 'b': {4}},
        }
        self.start_state = 0
        self.accept_states = {0, 1, 3, 4}

    def process_input(self, input_string):
        current_states = {self.start_state}
        for symbol in input_string:
            next_states = set()
            for state in current_states:
                if symbol in self.transitions[state]:
                    next_states.update(self.transitions[state][symbol])
            current_states = next_states
        return bool(current_states & self.accept_states)

if __name__ == "__main__":
    nfa = NFA()

    a = int(input("Enter the number of strings to test: "))
    test_strings = []
    
    for i in range(a):
        string = input(f"Enter string {i + 1}: ")
        test_strings.append(string)

    for string in test_strings:
        if nfa.process_input(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')
