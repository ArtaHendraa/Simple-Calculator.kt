import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    print("First Number : ")
    val firstInput = scanner.nextDouble()
    print("Operator : ")
    val operator = scanner.next()
    print("Second Number : ")
    val secondInput = scanner.nextDouble()
    var result: Double = 0.0
    when(operator){
        "+" -> result = firstInput + secondInput
        "-" -> result = firstInput - secondInput
        "x" -> result = firstInput * secondInput
        "/" -> result = firstInput / secondInput
    }
    println("$firstInput $operator $secondInput : $result")
}