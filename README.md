# ReverseWordsFromFile

This Java program reads lines from an input file, reverses the words in each line while maintaining punctuation in place, and writes the reversed lines to an output file.

## Prerequisites

To run this program, ensure you have:

- Java Development Kit (JDK) installed on your system.

## How to Run

1. **Clone the repository:**
   
- git clone https://github.com/Jayesh2026/AssessmentTask_1.git

2. **Compile the Java files:**
   
- javac ReverseWordsFromFile.java

3. **Run the program:**
   
- java ReverseWordsFromFile

4. **Check the output:**
   
- The program reads from `input.txt` located in the specified directory, example: (`D:\\Assessment\\Task 1\\`).
- It writes the reversed words to `output.txt` in the same directory.

## File Details

- **`ReverseWordsFromFile.java`:** Contains the main program logic and utility class for reversing words.
- **`Reverse.java`:** Utility class implementing the logic to reverse words in a line while preserving punctuation.

## Error Handling

- If the input file (`input.txt`) is not found, an appropriate message is logged.
- Any other IO exceptions encountered during file operations are logged with detailed error messages.

## Logging

- The program utilizes Java's `Logger` class to log informational and error messages.

## Additional Notes

- Ensure that the input file (`input.txt`) exists in the specified directory before running the program.
- The program assumes UTF-8 encoding for reading and writing files.

