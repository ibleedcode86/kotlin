/*
*       LOGICAL OPERATORS
*
*   &&  (AND)
*   ||  (OR)
*   !!  (NOT)
*
* */

/*
fun main() {
    val above70 = false
    val knowsprogramming = false

    //&& and
    val calledforinterview = knowsprogramming && above70
    println(calledforinterview)
}*/

/*

fun main() {
    val above70 = false
    val knowsprogramming = true

    //&& and both true
    val calledforinterview = knowsprogramming && above70
    println(calledforinterview)
}*/


/*
fun main() {
    val above70 = true
    val knowsprogramming = true

    //&& and
    val calledforinterview = knowsprogramming && above70
    println(calledforinterview)
}
*/

/*
*                     OR OPERATOR  ||  Condition 1 || Conditin 2
*                      If 1 condition is true it runs
* */

/*fun main() {
    val above70 = true
    val knowsprogramming = false

    //&& and
    var calledforinterview = knowsprogramming && above70
    println(calledforinterview)
    //|| Or Operator
    calledforinterview = above70||knowsprogramming
    println(calledforinterview)

}*/

// short circuting or operators says if 1 con is true it runs

/*fun main() {
    var i = 10
    var j = 11

    var result = i == 10 || j++ == 11
    println(i)
    println(j)
}*/

/*
fun main() {
    var i = 10
    var j = 11

    var result = i == 11 || j++ == 11
    println(i)
    println(j)
}*/


// Not operator false == true And true = false
// !! value  2tymes not

fun main() {

    val answer = true
    val result = !answer

    println(result)
}