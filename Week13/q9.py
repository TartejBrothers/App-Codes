class NFA:
    def __init__(self, start, accept):
        self.start = start
        self.accept = accept


class State:
    def __init__(self, label=None):
        self.edges = []
        self.is_accept = False
        self.label = label


def convert_to_nfa(regex):
    stack = []

    def concat(a, b):
        a.accept.is_accept = False
        a.accept.edges.append(b.start)
        return NFA(a.start, b.accept)

    def alternate(a, b):
        start = State()
        start.edges.append(a.start)
        start.edges.append(b.start)
        accept = State()
        a.accept.is_accept = False
        b.accept.is_accept = False
        a.accept.edges.append(accept)
        b.accept.edges.append(accept)
        return NFA(start, accept)

    def kleene(a):
        start = State()
        accept = State()
        start.edges.append(a.start)
        start.edges.append(accept)
        a.accept.is_accept = False
        a.accept.edges.extend([start, accept])
        return NFA(start, accept)

    for char in regex:
        if char == ".":
            b = stack.pop()
            a = stack.pop()
            stack.append(concat(a, b))
        elif char == "|":
            b = stack.pop()
            a = stack.pop()
            stack.append(alternate(a, b))
        elif char == "*":
            a = stack.pop()
            stack.append(kleene(a))
        else:
            accept = State()
            start = State(label=char)
            start.edges.append(accept)
            stack.append(NFA(start, accept))

    nfa = stack.pop()
    return nfa


def match(nfa, string):
    current = set()
    next_states = set()
    current.add(nfa.start)

    for char in string:
        for state in current:
            next_states.update(follow_edges(state, char))
        current = next_states
        next_states = set()

    return any(state.is_accept for state in current)


def follow_edges(state, char):
    states = set()
    for edge in state.edges:
        if edge.label == char or edge.label == ".":
            states.add(edge)
    return states


# Example usage:
regex = "a(b|c)*"
nfa = convert_to_nfa(regex)
test_strings = ["a", "ab", "ac", "abbbc"]
for test_string in test_strings:
    if match(nfa, test_string):
        print(f"'{test_string}' matches the regular expression '{regex}'")
    else:
        print(f"'{test_string}' does not match the regular expression '{regex}'")
