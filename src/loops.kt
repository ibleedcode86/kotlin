//                                   WHILE LOOP  Check before


/*fun main() {
    var count = 5
    while (count >= 1)
    {
        println("hello Bibek Deka")
        // if count not given it enters infinite loops so count--
        count--
    }
}*/

/*
fun main() {
    var number = 2
    var index = 1
    while (index<=10)
    {
        println(number * index )
        index++
    }
//    println("outside loop" + index)
}
*/

//              DO WHILE LOOP  executes after the statement

/*
fun main() {
    var index = 5
    do {
        println("5 is not greater than 5 but still runs")
    }while (index>5)
}*/


/*
fun main() {
    var index = 6
    do {
        println("5 is not greater than 5 but still runs")
        index++                     // goes infinite so give a valid syntax
    }while (index>5)
}*/




//                    FOr LOOP

/*
fun main() {
    for(i in 1..5)
        println(i)
}*/


/*fun main() {
    for(i in 1..5 step 2)   // if known iteration use for loop if not known use whle loop
        println(i)

    println("until")
    for(i in 1 until 5)  // until rejected upper bound so till 4 only
        println(i)
}*/

/*fun main() {
    //negative loops
    for(i in 10 downTo 1){
        println(i)
    }
}*/

/*
fun main() {
    //negative loops also using step
    for(i in 10 downTo 1 step 2){
        println(i)
    }
}*/

//            PRINTIG A TABLE

/*
fun main() {
    val number = 2
    for (i in 1..10)
    {
        println(number * i)
    }
}*/


//                   FORMATING IT A LITTLE

fun main() {
    val number = 2
    for (i in 1..10)
    {
       // println(number.toString() + " X " + i + " = " + (number * i))
        println("$number x $i = ${number * i}")
    }
}