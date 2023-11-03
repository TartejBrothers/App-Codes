class NFA:
    def __init__(self, states, alphabet, transition, start_state, accept_states):
        self.states = states
        self.alphabet = alphabet
        self.transition = transition
        self.start_state = start_state
        self.accept_states = accept_states


def epsilon_closure(nfa, states):
    eclosure = set(states)
    stack = list(states)

    while stack:
        state = stack.pop()
        if "" in nfa.transition[state]:
            new_states = nfa.transition[state][""]
            for new_state in new_states:
                if new_state not in eclosure:
                    eclosure.add(new_state)
                    stack.append(new_state)

    return eclosure


def move(nfa, states, symbol):
    result = set()
    for state in states:
        if symbol in nfa.transition[state]:
            result.update(nfa.transition[state][symbol])
    return result


def nfa_to_dfa(nfa):
    dfa_states = set()
    dfa_transition = {}
    dfa_start_state = epsilon_closure(nfa, {nfa.start_state})
    dfa_states.add(tuple(dfa_start_state))
    stack = [tuple(dfa_start_state)]

    while stack:
        current_state = stack.pop()
        for symbol in nfa.alphabet:
            if symbol == "":
                continue
            next_state = move(nfa, current_state, symbol)
            eclosure = epsilon_closure(nfa, next_state)

            if tuple(eclosure) not in dfa_states:
                stack.append(tuple(eclosure))
                dfa_states.add(tuple(eclosure))

            dfa_transition[current_state, symbol] = tuple(eclosure)

    dfa_accept_states = set()
    for dfa_state in dfa_states:
        for nfa_accept_state in nfa.accept_states:
            if nfa_accept_state in dfa_state:
                dfa_accept_states.add(dfa_state)

    return {
        "states": dfa_states,
        "alphabet": nfa.alphabet,
        "transition": dfa_transition,
        "start_state": tuple(dfa_start_state),
        "accept_states": dfa_accept_states,
    }


nfa = NFA(
    states={"q0", "q1", "q2"},
    alphabet={"0", "1"},
    transition={
        "q0": {"0": {"q0", "q1"}, "1": {"q0"}},
        "q1": {"0": {"q2"}},
        "q2": {"1": {"q2"}},
    },
    start_state="q0",
    accept_states={"q2"},
)

dfa = nfa_to_dfa(nfa)

print("DFA States:", dfa["states"])
print("DFA Alphabet:", dfa["alphabet"])
print("DFA Transition Function:", dfa["transition"])
print("DFA Start State:", dfa["start_state"])
print("DFA Accept States:", dfa["accept_states"])
