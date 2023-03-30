fun main() {
    val numbers = List(2) { readln().toInt() }
    println("${numbers.first()} plus ${numbers.last()} equals ${numbers.sum()}")
}