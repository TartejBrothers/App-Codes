def is_palindrome(word):

    return word == word[::-1]

def find_palindromic_words(sentence):

    words = sentence.split()
    palindromic_words = []
    for word in words:
        if is_palindrome(word):
            palindromic_words.append(word)
    return palindromic_words

# Example usage
sentence = input("Enter a sentence: ")
palindromic_words = find_palindromic_words(sentence)
print(palindromic_words)
