fun main(){
    val calculation: (Int, Int) -> Int
    //calculation = { x: Double, y: Double -> x + y }
    val myLambda: () -> Unit = { println("Hi!") }
    //val calculation: (Int, Int) -> Unit = { x, y -> x + y }
    println(myLambda())
}