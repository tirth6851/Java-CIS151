# Little Professor (Java)

A Java version of CS50P’s “Little Professor” problem.

## What it does
- Prompts for a level: 1, 2, or 3 (keeps asking until valid)
- Generates 10 addition problems using numbers with:
  - Level 1: 0–9
  - Level 2: 10–99
  - Level 3: 100–999
- For each problem, you get up to 3 tries:
  - Wrong or non-number input prints `EEE`
  - After 3 wrong tries, it prints the correct answer
- Prints final score out of 10

## Files
- `Professor.java` — main program
- `README.md` — instructions

## How to compile and run
```bash
javac Professor.java
java Professor
