
# Assignment 5 — Strategy Pattern

## Project Description

This project demonstrates the Strategy behavioral design pattern in Java using a simple calculator.

The calculator supports three mathematical operations:
- Addition
- Subtraction
- Multiplication

The user can switch between algorithms at runtime without changing the Calculator class.

## Technologies

- Java JDK 17
- IntelliJ IDEA
- Strategy Design Pattern

## Project Structure

```text
src/main/java/
├── Main.java
├── context/
│   └── Calculator.java
└── strategy/
    ├── OperationStrategy.java
    ├── AddStrategy.java
    ├── SubtractStrategy.java
    └── MultiplyStrategy.java
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 17.
4. Run Main.java.

## Expected Output

```text
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
```

## Strategy Pattern Components

- Strategy: OperationStrategy
- Concrete Strategies: AddStrategy, SubtractStrategy, MultiplyStrategy
- Context: Calculator
- Client: Main

## How to Add a New Strategy

1. Create a new class implementing OperationStrategy.
2. Override the execute() method.
3. Implement the new mathematical operation.
4. Select the new strategy using setStrategy().

No changes to Calculator are required.

## UML Class Diagram

![Strategy Pattern UML](docs/mermaid-diagram-2026-10-26-195142.png)

## Author

Iskander Shaimerdinov SE - 2524

Astana IT University — 2026–2027.
