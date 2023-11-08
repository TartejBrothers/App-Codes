class NFA:
    def __init__(self, alphabet, transitions, start_state, accept_states):
        self.alphabet = alphabet
        self.transitions = transitions
        self.start_state = start_state
        self.accept_states = accept_states

    def process_input(self, input_string):
        current_state = self.start_state
        for symbol in input_string:
            if symbol in self.transitions[current_state]:
                current_state = self.transitions[current_state][symbol]
            else:
                return False
        return current_state in self.accept_states


def run_nfa(nfa, test_strings):
    for string in test_strings:
        if nfa.process_input(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')


nfa_ending_with_01 = NFA(
    alphabet={"0", "1"},
    transitions={0: {"0": 0, "1": 1}, 1: {"0": 0, "1": 2}, 2: {"0": 2, "1": 2}},
    start_state=0,
    accept_states={2},
)

if __name__ == "__main__":
    test_strings = ["01", "001", "101", "1001", "00101", "11", "010", "0", "1", ""]

    print("Testing NFA for strings ending with '01':")
    run_nfa(nfa_ending_with_01, test_strings)
