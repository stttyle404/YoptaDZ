
fun main() {
    var addFive = { x: Int -> x + 5 }
    addFive = { y: Int -> 5 + y }
    println(addFive(5))
}