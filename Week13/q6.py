def minimize_dfa(dfa):
    num_states = len(dfa["states"])
    distinguishability = [[False] * num_states for _ in range(num_states)]

    for i in range(num_states):
        for j in range(i + 1, num_states):
            if (
                dfa["states"][i] in dfa["accept_states"]
                and dfa["states"][j] not in dfa["accept_states"]
            ) or (
                dfa["states"][j] in dfa["accept_states"]
                and dfa["states"][i] not in dfa["accept_states"]
            ):
                distinguishability[i][j] = True
    while True:
        change = False
        for i in range(num_states):
            for j in range(i + 1, num_states):
                if not distinguishability[i][j]:
                    for symbol in dfa["alphabet"]:
                        index_i = dfa["states"].index(
                            dfa["transition"][(dfa["states"][i], symbol)]
                        )
                        index_j = dfa["states"].index(
                            dfa["transition"][(dfa["states"][j], symbol)]
                        )
                        if distinguishability[index_i][index_j]:
                            distinguishability[i][j] = True
                            change = True
                        elif distinguishability[index_j][index_i]:
                            distinguishability[i][j] = True
                            change = True

        if not change:
            break
    equivalent_groups = {}
    for i in range(num_states):
        equivalent_groups[i] = set()
        for j in range(i, num_states):
            if not distinguishability[i][j]:
                equivalent_groups[i].add(dfa["states"][j])
    min_dfa = {
        "states": [],
        "alphabet": dfa["alphabet"],
        "transition": {},
        "start_state": None,
        "accept_states": set(),
    }

    for group in equivalent_groups.values():
        if dfa["start_state"] in group:
            min_dfa["start_state"] = list(group)[0]
        if any(state in dfa["accept_states"] for state in group):
            min_dfa["accept_states"].update(group)
        min_dfa["states"].append(list(group)[0])

    for state in min_dfa["states"]:
        for symbol in dfa["alphabet"]:
            next_state = dfa["transition"].get((state, symbol), None)
            if next_state is not None:
                min_dfa["transition"][(state, symbol)] = [
                    s
                    for s in min_dfa["states"]
                    if next_state in equivalent_groups[dfa["states"].index(s)]
                ][0]

    return min_dfa
dfa = {
    "states": ["q0", "q1", "q2"],
    "alphabet": {"0", "1"},
    "transition": {
        ("q0", "0"): "q1",
        ("q0", "1"): "q2",
        ("q1", "0"): "q0",
        ("q1", "1"): "q2",
        ("q2", "0"): "q2",
        ("q2", "1"): "q2",
    },
    "start_state": "q0",
    "accept_states": ["q0"],
}

minimized_dfa = minimize_dfa(dfa)

print("Minimized DFA States:", minimized_dfa["states"])
print("Minimized DFA Alphabet:", minimized_dfa["alphabet"])
print("Minimized DFA Transition Function:", minimized_dfa["transition"])
print("Minimized DFA Start State:", minimized_dfa["start_state"])
print("Minimized DFA Accept States:", minimized_dfa["accept_states"])
