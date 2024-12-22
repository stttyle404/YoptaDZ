fun main(){
    val msg = { x: Int -> "The value is $x" }
    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y }
    val greeting: () -> String
    greeting = { "Hello!" }
    println(msg(5))
    println(add(5,6))
    println(greeting())
}