# PalindromeCheckerApp
##running procedure 
## flow of project:
Program starts.
##1.A hardcoded string (example: "madam") is declared.
##2.The program checks whether the string is a palindrome.
##3.A conditional statement compares the original string with the reversed string.
##4.The result is printed on the console.
##5.Program exits.
##objective: To check weather a hardcore string is a palindrome
##what are the topics it will be covered:
##-Java Class
-Main Method
-Static Keyword
##-String and String Literals
##-Conditional Statements (if-else)
##-Console Output (System.out.println)
##-Basic String manipulation
##-Program compilation and execution using terminal commands
##Which Use case: PalindromeResult



## UC3: Palindrome Check Using String Reverse

### Goal:
Check whether a string is a palindrome by reversing it.

### Flow:
1. Reverse string using a for loop
2. Compare original and reversed
3. Display result

### Key Concepts:
- Loop (for loop)
- String immutability
- String concatenation (+)
- equals() method

### Data Structure:
String


## UC4: Character Array Based Palindrome Check

### Goal:
Convert string to character array and compare characters.

### Flow:
1. Convert string to char[]
2. Use two-pointer approach
3. Compare start & end characters

### Key Concepts:
- Character Array (char[])
- Array Indexing
- Two-Pointer Technique
- Time Complexity Awareness

### Data Structure:
char[]



## UC5: Stack-Based Palindrome Checker

### Goal:
Use stack to reverse characters and validate palindrome.

### Flow:
1. Push characters into stack
2. Pop and compare
3. Print result

### Key Concepts:
- Stack (LIFO)
- Push Operation
- Pop Operation
- Reversal Logic

### Data Structure:
Stack




## UC6: Queue vs Stack Palindrome Check

### Goal:
Demonstrate FIFO vs LIFO using Queue and Stack.

### Flow:
- Enqueue characters
- Push characters to stack
- Compare dequeue vs pop

### Key Concepts:
- Queue (FIFO)
- Enqueue & Dequeue
- Stack vs Queue behavior
- Logical comparison

### Data Structures:
Queue, Stack





## UC7: Deque-Based Optimized Palindrome Checker

### Goal:
Use Deque to compare front and rear elements.

### Flow:
- Insert characters into deque
- Remove first & last
- Compare until empty

### Key Concepts:
- Deque (Double Ended Queue)
- Front & Rear comparison
- Optimized approach (no extra structures)

### Data Structure:
Deque

## UC8: Linked List Based Palindrome Checker

### Goal:
Check palindrome using singly linked list.

### Flow:
- Convert string to linked list
- Reverse second half
- Compare halves

### Key Concepts:
- Singly Linked List
- Node Traversal
- Fast & Slow Pointer
- In-place reversal

### Data Structure:
Linked List

## UC9: Recursive Palindrome Checker

### Goal:
Check palindrome using recursion.

### Flow:
- Recursive call compares start & end
- Base condition exits recursion

### Key Concepts:
- Recursion
- Base condition
- Call stack

### Data Structure:
Call Stack

## UC10: Case-Insensitive & Space-Ignored Palindrome

### Goal:
Ignore spaces and case while checking a palindrome.

### Flow:
- Normalize string
- Apply palindrome logic

### Key Concepts:
- String preprocessing
- Regular expressions

### Data Structure:
String / Array

## UC11: Object-Oriented Palindrome Service

### Goal:
Encapsulate palindrome logic in a class.

### Flow:
- Create PalindromeService class
- Expose checkPalindrome() method

### Key Concepts:
- Encapsulation
- Single Responsibility Principle

### Data Structure:
Internal (String / Array)

## UC12: Strategy Pattern for Palindrome Algorithms

### Goal:
Choose a palindrome algorithm dynamically.

### Flow:
- Define PalindromeStrategy interface
- Implement StackStrategy, DequeStrategy
- Inject strategy at runtime

### Key Concepts:
- Interface
- Polymorphism
- Strategy Pattern

### Data Structure:
Varies per strategy