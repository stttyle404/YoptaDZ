fun main(){
    val addFive1: (Int) -> Int = { x: Int -> x + 5 }
    val addFive2: (Int) -> Int = { x -> x + 5 }
    val addFive3: (Int) -> Int = { it + 5 }
    println(addFive1(1))
    println(addFive2(2))
}