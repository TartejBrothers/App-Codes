class NFA:
    def __init__(self, states, alphabet, transitions, start_state, accept_states):
        self.states = states
        self.alphabet = alphabet
        self.transitions = transitions
        self.start_state = start_state
        self.accept_states = accept_states

    def process_input(self, input_string):
        current_states = {self.start_state}
        for symbol in input_string:
            next_states = set()
            for state in current_states:
                if symbol in self.transitions[state]:
                    next_states.update(self.transitions[state][symbol])
            current_states = next_states
        return bool(current_states & self.accept_states)


def run_nfa(nfa, test_strings):
    for string in test_strings:
        if nfa.process_input(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')

nfa_empty_set = NFA(
    states={0},
    alphabet={"a", "b"},
    transitions={0: {"a": set(), "b": set()}},
    start_state=0,
    accept_states=set(),
)

nfa_epsilon_set = NFA(
    states={0},
    alphabet={"a", "b"},
    transitions={0: {"a": {0}, "b": {0}}},
    start_state=0,
    accept_states={0},
)

# NFA for (ab)*
nfa_ab_star = NFA(
    states={0, 1, 2},
    alphabet={"a", "b"},
    transitions={
        0: {"a": {1}, "b": {0}},
        1: {"a": {0}, "b": {2}},
        2: {"a": {1}, "b": {2}},
    },
    start_state=0,
    accept_states={2},
)

if __name__ == "__main__":
    test_strings = ["", "a", "b", "ab", "ba", "aaabab", "abbababba"]

    print("Testing NFA for ∅:")
    run_nfa(nfa_empty_set, test_strings)

    print("\nTesting NFA for {ε}:")
    run_nfa(nfa_epsilon_set, test_strings)

    print("\nTesting NFA for (ab)*:")
    run_nfa(nfa_ab_star, test_strings)
