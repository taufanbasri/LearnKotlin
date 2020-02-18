fun main(args: Array<String>) {
    // Simple calculator
    println("Please enter the first number: ")
    var number1: Int = readLine()!!.toInt()

    println("Please enter the second number: ")
    var number2: Int = readLine()!!.toInt()

    var sum: Int
    sum = number1 + number2

    println("The sum is " + sum)
}