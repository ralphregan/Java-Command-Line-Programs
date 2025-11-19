# Java Command-Line Programs

This repository contains a collection of four simple Java programs designed to demonstrate basic concepts, including user input, random number generation, arithmetic operations, and looping constructs.

## 📁 Programs Overview

| Program File | Description | Concepts Demonstrated |
| :--- | :--- | :--- |
| `RussianPawnMultiplication.java` | Implements the **Russian Peasant Multiplication** algorithm to find the product of two integers without using the standard multiplication operator. | `while` loop, Conditional logic (`if`), Integer arithmetic. |
| `ShoppingCart.java` | A simple program that calculates the total cost of an item based on user-provided price and quantity. | User input (`Scanner`), Basic arithmetic. |
| `RandomGuess.java` | A number guessing game where the user tries to guess a random number within a range in a limited number of attempts. | Random number generation (`Random`), `do-while` loop, Conditional logic (`if/else if`), Attempt counter. |
| `Main.java` | A classic "Mad Libs" style game where the user provides different parts of speech to complete a short story. | User input (`Scanner`), String concatenation. |

## 🚀 Getting Started

### Prerequisites

You need to have the **Java Development Kit (JDK)** installed on your system to compile and run these programs.

### Compilation and Execution (from Terminal)

1.  **Save the files:** Save each code block into its respective `.java` file (e.g., `ShoppingCart.java`).
2.  **Navigate to the directory:** Open your terminal and change the directory to where you saved the files.
3.  **Compile:** Compile the desired Java file using `javac`.
    ```bash
    javac ProgramName.java
    # Example:
    javac ShoppingCart.java
    ```
4.  **Run:** Execute the compiled class file using `java`.
    ```bash
    java ProgramName
    # Example:
    java ShoppingCart
    ```

## 📜 Example Usage

### `RandomGuess.java`

This program generates a random number between 1 and 100 and prompts the user to guess it.
