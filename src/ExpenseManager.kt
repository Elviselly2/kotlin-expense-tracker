//Handles adding, listing, summing expenses

    private val expenses = mutableListOf<Expense>()

    // Add a new expense
    fun addExpense(expense: Expense) {
        expenses.add(expense)
    }

    // List all expenses
    fun listExpenses() {
        if (expenses.isEmpty()) {
            println("No expenses recorded.")
            return
        }
        println("Expenses:")
        expenses.forEach { println("- ${it.name} | ${it.category} | ${it.amount}") }
    }

   // Calculate total expenses
    fun totalExpenses(): Double {
        return expenses.map { it.amount }.sum()
    }

}