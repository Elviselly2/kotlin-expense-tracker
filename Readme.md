# Kotlin Capstone Project: 
#Personal Expense Tracker

## 1. Project Overview
This is a console-based Personal Expense Tracker built using **Kotlin**.  
It demonstrates a **real-world beginner-friendly application** with multiple files and modular design.  

**Goal:** Track daily expenses, categorize them, and calculate totals.  

**Why Kotlin?**
- Modern, expressive, and beginner-friendly  
- Runs on JVM and interoperable with Java  
- Widely used in Android and backend development  

---

## 2. Features
- Add a new expense (name, category, amount)  
- List all expenses  
- Show total expenses  
- Exit the application  

---

## 3. Folder & File Structure

KOTLIN/
├── src/
│ ├── Main.kt # Entry point (menu & user interaction)
│ ├── Expense.kt # Data class representing an expense
│ └── ExpenseManager.kt # Handles expense operations
├── README.md # This document
└── .gitignore # Optional, ignore compiled files 


## 4. System Requirements
- **OS:** Ubuntu/Linux, macOS, or Windows  
- **Kotlin compiler:** 1.3+ (`kotlinc`)  
- **Java JDK:** 17+ (`java -version`)  
- **Editor:** VS Code or IntelliJ IDEA  
- Optional: **VS Code Code Runner** extension  

---

## 5. Installation & Running

1. **Clone the repository**

```bash
git clone https://github.com/YOUR_USERNAME/ExpenseTracker.git
cd KOTLIN/src

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

##6. References
Official Kotlin Docs
JetBrains Kotlin Playground
VS Code Code Runner Extension