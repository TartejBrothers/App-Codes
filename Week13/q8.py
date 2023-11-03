class NFA:
    def __init__(self, states, alphabet, transition, start_state, accept_states):
        self.states = states
        self.alphabet = alphabet
        self.transition = transition
        self.start_state = start_state
        self.accept_states = accept_states

states = {'q0', 'q1'}
alphabet = {'0', '1'}
transition = {
    'q0': {'0': {'q0', 'q1'}, '1': {'q0'}},
    'q1': {'0': {'q1'}, '1': {'q1'}}
}
start_state = 'q0'
accept_states = {'q1'}

nfa = NFA(states, alphabet, transition, start_state, accept_states)

def test_nfa(input_string, current_state, nfa):
    if not input_string:
        return current_state in nfa.accept_states

    symbol, rest_input = input_string[0], input_string[1:]

    if symbol not in nfa.alphabet:
        return False

    next_states = nfa.transition.get(current_state, {}).get(symbol, set())

    for next_state in next_states:
        if test_nfa(rest_input, next_state, nfa):
            return True

    return False

input_string = input("Enter a string: ")
if test_nfa(input_string, nfa.start_state, nfa):
    print("Accepted")
else:
    print("Rejected")
