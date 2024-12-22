fun main(){
    val addInts = { x: Int, y: Int -> x + y }
    val result1 = addInts.invoke(6, 7)
    val result2 = addInts(6, 7)
    println(result1)
}