/*
fun main() {
    val result = add(4 ,7)
    println(result)
    val result2 = add(5,6)
    println(result2)
    evenorodd(12,)
    evenorodd(13)
}
fun add(num1: Int, num2: Int): Int               //mention return data type
{
    val sum = num1 + num2
    return sum
}

fun evenorodd(num1 : Int) {
    val result = if (num1 %2 == 0) "even" else "odd"
    println(result)
}*/

 //                          FUNCTION OVERLOADING & NAMED ARGUMENTS
// SAME NAME DIFFERENT PARAMETERS

/*
fun main() {
    println(additon(1,3))
    println(addition(1.0,2.0))


}

fun additon(a:Int , b:Int) : Int {
    return a + b
}

fun addition(a:Double , b:Double):Double{
    return a + b
}*/


/*
fun main() {
    var fn :

}*/


fun main() {
    println(evenorodd(11))
    println(evenorodd(15))
    println(evenorodd(16))
}
fun evenorodd(num1 : Int) {
    val result = if (num1 %2 == 0) "even" else "odd"
    println(result)
}





