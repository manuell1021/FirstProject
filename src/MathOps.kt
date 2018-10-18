fun main(args: Array<String>){
    println("Please enter the first number")
    var num1:Int = readLine()!!.toInt()
    println("Please enter the second number")

    var num2:Int = readLine()!!.toInt()

    var result:Int = num1 + num2
    println("Your anwser is " + result)
}