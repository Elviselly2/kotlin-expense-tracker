fun main() {
    val manager = ExpenseManager()
    
    while (true) {
        println("\nExpense Tracker Menu:")
        println("1. Add Expense")
        println("2. Show Expenses")
        println("3. Show Total")
        println("4. Exit")
        print("Choose an option: ")

        when(readLine()) {
            "1" -> {
                print("Enter expense name: ")
                val name = readLine() ?: "Unnamed"
                print("Enter category: ")
                val category = readLine() ?: "General"
                print("Enter amount: ")
                val amount = readLine()?.toDoubleOrNull() ?: 0.0

                manager.addExpense(Expense(name, category, amount))
                println("Expense added!")
            }
            "2" -> manager.listExpenses()
            "3" -> println("Total expenses: ${manager.totalExpenses()}")
            "4" -> {
                println("Goodbye!")
                return
            }
            else -> println("Invalid option, try again.")
        }
    }
}
