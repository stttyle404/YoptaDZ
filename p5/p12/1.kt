data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)
fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery ("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    val ints = listOf(1, 2, 3, 4)
    val maxInt = ints.max() //maxInt == 4

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    val lowestQuantity = groceries.minBy { it.quantity }
    val sumQuantity = groceries.sumBy { it.quantity }
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }

    val vegetables = groceries.filter { it.category == "Vegetable" }
    val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
    val notFrozen = groceries.filterNot { it.category == "Frozen" }

    val doubleInts = ints.map { it * 2 }
    val groceryNames = groceries.map { it.name }
    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }

    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }

    for (item in groceries) {
        println(item.name)}
    groceries.forEach { println(it.name) }
    for (item in groceries) {
        if (item.unitPrice > 3.0) println(item.name)
    }
    groceries.filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }
    var itemNames = ""
    for (item in groceries) {
        itemNames += "${item.name} "
    }
    println("itemNames: $itemNames")

    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    ints.fold(1) { runningProduct, item -> runningProduct * item }
    groceries.fold("") { string, item -> string + " ${item.name}" }
    groceries.fold(50.0) { change, item
        -> change - item.unitPrice * item.quantity }
    
}