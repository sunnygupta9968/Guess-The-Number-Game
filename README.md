#iThink | Guess The Number Game (Java)

Welcome to the **iThink** game, a simple and interactive number-guessing game built with Java and Swing for the graphical user interface.

## About the Game

In this game, you have **5 attempts** to guess a randomly generated number between **1 and 100**. After each guess, you'll receive feedback indicating whether your guess was too high, too low, or correct. If you run out of attempts, the correct number will be revealed, and the game will reset.

### Features:
- User-friendly interface built with `JFrame` and `Swing` components.
- A random number is generated between 1 and 100 each time you play.
- Limited attempts (5) to guess the number.
- Real-time feedback (Too high, Too low, or Correct).
- If you lose, the game resets automatically with a new number.

## How to Play

1. Enter a number between **1 and 100** in the input field.
2. Click **Submit** or press **Enter** to check if your guess is correct.
3. If you guess wrong, the game will tell you whether your guess was too high or too low.
4. You have **5 lives** to guess the correct number.
5. If you lose, the game will display the correct number and reset.

## Installation

To run the **Guess The Number** game on your local machine, follow these steps:

1. Ensure that you have **Java** installed on your system.
   - You can download and install Java from the official [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).

2. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/your-username/guess-the-number-game.git

3. Navigate to the project directory:
   ```bash
   cd guess-the-number-game
4. Compile and run the Main.java file:
   ```bash
   javac Main.java
   java Main

## Technologies Used

1. Java: Programming language used for building the game.
2. Swing: GUI toolkit used for creating the game interface.

## Game Logic

1. The game generates a random number between 1 and 100.
2. You have 5 attempts to guess the number.
3. After each guess, you will receive feedback about whether your guess is too high, too low, or correct.
4. If you lose, the game resets with a new random number.
