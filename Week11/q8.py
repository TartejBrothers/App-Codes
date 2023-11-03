import random

random_number = random.randint(1, 10)

while True:
    guess = int(input("Guess the number between 1 and 10: "))

    if guess == random_number:
        print("Congratulations! You guessed the number.")
        break

    if guess < random_number:
        print("Too low. Guess again.")
    else:
        print("Too high. Guess again.")
