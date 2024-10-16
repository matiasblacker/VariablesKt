// main.kt
fun main() {
    // Parte A
    // Declarar tres variables numéricas
    var num1 = 10
    var num2 = 33
    var num3 = 66

    // Calcular la suma
    var sum = num1 + num2 + num3
    println("Suma: $sum")

    // Modificar la variable num1 por el valor 55
    num1 = 55
    sum = num1 + num2 + num3
    println("Nueva Suma después de cambiar num1 a 55: $sum")

    // Calcular el promedio
    val average = sum / 3.0
    println("Promedio: $average")

    // Parte B
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()

    // Parte C
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            println("Likes to $hobby.")
        } else {
            println("Doesn't have a hobby.")
        }
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
        println()
    }
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
