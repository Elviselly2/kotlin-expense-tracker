# Kotlin Expense Tracker – Capstone Project

## 📍 Overview
This capstone demonstrates how to use **Kotlin** and **Generative AI** to learn a new programming language through hands-on practice.  
The final output is a **console-based Expense Tracker application**, structured in multiple Kotlin files, with documentation, prompts used, installation, and testing steps.

This toolkit is designed for beginners who want a clean, simple, and working starting point for learning Kotlin.

---

## 🎯 Project Goal
To guide a beginner from zero Kotlin knowledge to building and running a functional console application using AI-supported learning.

By the end of this toolkit, a learner will:
- Understand Kotlin basics  
- Create and run Kotlin projects from the terminal  
- Use classes, lists, functions, and simple I/O  
- Document their AI-assisted learning journey  
- Produce a working **Expense Tracker** app  

---

## 🗂 Deliverables
- **Complete Kotlin project** with multi-file structure  
- **README.md** (this file)  
- **GitHub repository:**  
  👉 `git@github.com:Elviselly2/kotlin-expense-tracker.git`  
- Complete AI prompt journal  
- Learning reflections  
- Working application output  

---

# 1.  Title & Objective
**Title:** Kotlin Expense Tracker – Beginner Console Application  

**Objective:**  
Learn Kotlin through generative AI guidance and build a simple yet complete expense tracking system using object-oriented design and basic terminal input.

---

# 2. Summary of Kotlin
Kotlin is a modern, statically typed language used for:

- Android development  
- Backend applications  
- Multi-platform apps  
- Scripting  

Key features:
- Clean syntax  
- Interoperable with Java  
- Null-safety  
- Functional + OOP support  

This project uses Kotlin for console-based interactions, classes, lists, and basic arithmetic operations.

---

# 3.  System Requirements
| Requirement | Version |
|------------|---------|
| Java JDK   | 17+     |
| Kotlin     | 1.3+ or 1.9+ |
| OS         | Linux/macOS/Windows |
| Editor     | VS Code / IntelliJ |

---

# 4.  Installation & Setup Instructions

Clone the repository:

```bash
git clone git@github.com:Elviselly2/kotlin-expense-tracker.git
cd kotlin/src


2.**compile all kotlin files

```bash
kotlinc *.kt -include-runtime -d kotlin.jar

3. ***Run the compiled JAR
```bash
java -jar kotlin.jar

4.Use the interactive menu

1 → Add Expense

2 → Show Expenses

3 → Show Total

4 → Exit

# 6.  AI Prompt Journal
 #  | Prompt Used                                           | Purpose                                | AI Response Summary                                                                | Reflection / Evaluation                                  |
| -- | ----------------------------------------------------- | -------------------------------------- | ---------------------------------------------------------------------------------- | -------------------------------------------------------- |
| 1  | “Explain Kotlin basics for a beginner”                | Understand syntax, data types, classes | Beginner-friendly explanation of syntax, `fun main()`, variables                   | Very helpful; allowed me to structure Main.kt properly   |
| 2  | “Create a minimal Kotlin calculator project”          | Scaffold logic                         | Step-by-step code example for numeric operations                                   | Inspired expense tracker’s add/show functionality        |
| 3  | “Safe user input in Kotlin”                           | Prevent crashes                        | Explained `readLine()?.toDoubleOrNull() ?: 0.0`                                    | Applied for amount input to avoid errors                 |
| 4  | “Multi-file Kotlin project structure”                 | Organize code                          | Suggested `Expense.kt`, `ExpenseManager.kt`, `Main.kt`                             | Very helpful; improved modularity and readability        |
| 5  | “Calculate total from list of expenses”               | Implement `totalExpenses()`            | Suggested `expenses.sumOf { it.amount }`                                           | Adapted for older Kotlin using `map { it.amount }.sum()` |
| 6  | “Compile and run multiple Kotlin files”               | Learn terminal commands                | Explained `kotlinc *.kt -include-runtime -d kotlin.jar` and `java -jar kotlin.jar` | Very helpful; executed successfully                      |
| 7  | “Create menu-driven console app in Kotlin”            | Implement interactive menu             | Recommended `while(true)` loop + `when(readLine())`                                | Extremely helpful; adapted for Expense Tracker menu      |
| 8  | “Display list items in Kotlin”                        | Show all expenses                      | Recommended `for` loops with formatted output                                      | Improved readability of expense list                     |
| 9  | “Common errors for Kotlin multi-file projects”        | Prevent issues                         | Listed missing braces, sumOf errors, null pointer                                  | Helped avoid crashes and debug faster                    |
| 10 | “Best practices for beginner Kotlin console projects” | Improve code quality                   | Suggested clear naming, modular functions, comments                                | Very helpful; added comments and clean code              |
otlin.jar` and `java -jar kotlin.jar` | Very helpful; executed successfully                      |
| 7  | “Create menu-driven console app in Kotlin”            | Implement interactive menu             | Recommended `while(true)` loop + `when(readLine())`                                | Extremely helpful; adapted for Expense Tracker menu      |
| 8  | “Display list items in Kotlin”                        | Show all expenses                      | Recommended `for` loops with formatted output                                      | Improved readability of expense list                     |
| 9  | “Common errors for Kotlin multi-file projects”        | Prevent issues                         | Listed missing braces, sumOf errors, null pointer                                  | Helped avoid crashes and debug faster                    |
| 10 | “Best practices for beginner Kotlin console projects” | Improve code quality                   | Suggested clear naming, modular functions, comments                                | Very helpful; added comments and clean code              |


7. Common Issues & Fixes

| Issue                      | How it occurred                   | Solution                                                   |
| -------------------------- | --------------------------------- | ---------------------------------------------------------- |
| `sumOf` not recognized     | Kotlin 1.3 does not support it    | Use `expenses.map { it.amount }.sum()`                     |
| Missing `}`                | Braces mismatch in class/function | Check all braces carefully                                 |
| Unable to access jarfile   | JAR not compiled yet              | Compile with `kotlinc *.kt -include-runtime -d kotlin.jar` |
| VS Code not running Kotlin | Code Runner not installed         | Install extension or run via terminal                      |



##6.  References

https://kotlinlang.org/docs/home.html

https://play.kotlinlang.org

https://stackoverflow.com