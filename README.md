# JSpyder_Java

A comprehensive Java learning repository containing 200+ Java source files organized by topic, covering fundamental through intermediate Java concepts. Developed as a hands-on practice and reference collection.

---

## 📁 Project Structure

```
JSpyder_Java/
└── src/
    ├── Main.java
    └── com/
        ├── AdvProgramming/       # Arrays, Strings, Sorting, Searching, RegEx, 2D Arrays
        ├── CollectionFramework/  # Java Collections API (List, Set, Queue, etc.)
        ├── ComparableInterface/  # Comparable implementation examples
        ├── ComparatorInterface/  # Comparator implementation examples
        ├── ComaparatorMiniProject/ # Mini-project using Comparator
        ├── Dsa/                  # Data Structures & Algorithms (custom implementations)
        ├── ExceptionHandling/    # Exception handling patterns
        ├── FileHandling/         # File I/O operations
        ├── Java8/                # Java 8 features (Lambda, Streams, Functional Interfaces)
        ├── MapFramework/         # HashMap & Map operations
        ├── MultiThreading/       # Concurrency & thread management
        ├── Practice/             # Mixed practice problems
        └── Recursion/            # Recursive algorithms
```

---

## 📚 Topics Covered

### Advanced Programming (`AdvProgramming`)
- **Array Operations** – max/min element, second max/min, moving zeroes, even/odd elements
- **Sorting Algorithms** – Bubble Sort, Selection Sort, Insertion Sort, Quick Sort, Merge Sort
- **Searching Algorithms** – Linear Search, Binary Search, Recursive Binary Search
- **String Manipulation** – reversal, palindrome, anagram, permutations, encoding, duplicate removal
- **2D Arrays** – transpose, jagged arrays, Pascal's triangle, matrix multiplication, spiral matrix
- **Regular Expressions** – Gmail validation, password validation, mobile number validation

### Data Structures & Algorithms (`Dsa`)
Custom implementations of core data structures:
- **Singly & Doubly Linked Lists** – add, addFirst, addAtIndex, remove, contains, reverse
- **Stack** – implemented via LinkedList and ArrayList
- **Queue** – implemented via LinkedList and ArrayList
- **Custom ArrayList**
- **HashSet**
- **Binary Search Tree**

### Collection Framework (`CollectionFramework`)
Java built-in collections:
- **List** – ArrayList, LinkedList, Vector, Stack
- **Set** – HashSet, TreeSet, LinkedHashSet
- **Queue / Deque**
- **Iterator & ListIterator**
- **Generics**

### Exception Handling (`ExceptionHandling`)
- Try-catch blocks for common exceptions (ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.)
- `throws` keyword and exception propagation
- Custom exceptions
- `finally` block

### Java 8 Features (`Java8`)
- **Lambda Expressions**
- **Predefined Functional Interfaces** – Predicate, Function, Consumer, Supplier, BiFunction, BiPredicate, BiConsumer, UnaryOperator, BinaryOperator
- **Stream API** – forEach, filter, removeIf, sum, average
- **Date and Time API**
- **Optional class**

### Multithreading (`MultiThreading`)
- Thread creation and lifecycle
- `Thread.join()`
- Daemon threads
- Synchronization and thread-safe operations

### File Handling (`FileHandling`)
- File creation, reading, and writing
- `FileWriter` usage

### Recursion (`Recursion`)
- Factorial, Fibonacci, Natural numbers (ascending/descending), `x^n`

### Map Framework (`MapFramework`)
- HashMap basics and operations
- Counting character/word occurrences
- Number to Roman numeral conversion

### Comparator & Comparable
- Sorting custom objects with `Comparable`
- Sorting custom objects with `Comparator`
- Mini-project using `Comparator` for multi-field sorting

---

## ▶️ How to Run

No build tool is required. Compile and run any file using the Java compiler:

```bash
# Compile
javac src/Main.java

# Run
java -cp src Main
```

For files inside packages (e.g., `com/Dsa/`):

```bash
# From the src directory
javac com/Dsa/MyLinkedList.java
java com.Dsa.MyLinkedList
```

### Prerequisites
- Java Development Kit (JDK) 8 or higher

---

## 🛠️ IDE Support

The project includes configuration files for:
- **IntelliJ IDEA** (`.idea/`, `JSpyder.iml`)
- **Eclipse** (`.metadata/`)

---

## 🤝 Contributing

Contributions, corrections, and additional examples are welcome. Feel free to open a pull request or raise an issue.
