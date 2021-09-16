fun hello() {
    println("What's your name?")
    val name = readLine()

    println("What's your email?")
    val email = readLine()

    println("Hello $name, I am Robot, thanks for connected, i going send e-mail for this $email, ok ?")

    println("You can confirm? Ok or No")
    val confirmed = readLine()

    println("Thanks for the connection $confirmed!")
}

fun main() {
    hello()
}