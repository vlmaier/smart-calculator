fun main() = println(readln().groupingBy { it }.eachCount().values.count { it == 1 })