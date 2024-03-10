/*
* Range (....& until)
* WWhen statement n expression
* */

/*
fun main() {
    val number = 10 //check wheter it is inside 10 or not
    val result = number in 1..5
    println(result)
}*/

/*fun main() {
    val number = 5 //check wheter it is inside 5 or not i,e true
    val result = number in 1..5
    println(result)
}*/

//last nuber is upper bound and if replaced by .. it is defined
// here in include 5 until rejects the bound

/*fun main() {
    val number = 5 //check wheter it is inside 5 or not
    val result = number in 1 until 5 // untill rejects upper bound so false
    println(result)
}*/

//----------------------WHEN-----------------------------------------------

/*
fun main() {
    val animal = "dog"
    if (animal == "horse"){
        println("animal is horse")
    }
    else if (animal == "cat")
        println("animal is cat")
    else if (animal== "dog")
        println("animal is dog")
    else {
        println("animal not found")
    }
}*/


/*
*                   ------------NOW USING WHEN---------------------------
*                     if else shorter / switch in java
**/

/*
fun main() {
    val animal = "dog"
    when(animal){
        "horse" -> println("animal is horse")
        "cat" -> println("animal is cat")
        "dog" -> println("animal is dog")
        else -> println("animal not found")
    }

}*/



/*
*                 when
* */

/*
fun main() {
    val animal = "dog"
    val result = when(animal){
        "horse" -> ("animal is horse")
        "cat" -> ("animal is cat")
        "dog" -> ("animal is dog")
        else -> ("animal not found")
    }
    println(result)
}*/

//                                    WHEN Examples


/*fun main() {
    val number = 15
    val result = when(number){
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        else -> "not in range"
    }
    println(result)
}*/


/*fun main() {
    val number = 12
    val result = when(number){
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        else -> "not in range"
    }
    println(result)
}*/


//                               Using ......
/*
fun main() {
    val number = 15
    val result = when(number){
       in 11 until 1 -> "heven"
        12 -> "welve"
       in 13..19 -> "teen"
        else -> "not in range"
    }
    println(result)
}*/

//                                   Using Until
/*
fun main() {
    val number = 5
    val result = when(number){
        in 1 until 11 -> "heven"
        12 -> "welve"
        in 13..19 -> "teen"
        else -> "not in range"
    }
    println(result)
}*/

//                                       Normal
/*
fun main() {
    val number = 12
    val result = when(number){
        in 11 until 1 -> "heven"
        12 -> "welve"
        in 13..19 -> "teen"
        else -> "not in range"
    }
    println(result)
}*/
