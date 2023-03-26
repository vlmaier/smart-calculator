// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val values = List(4) { readln().toInt() }
    val box1 = Box(height = values[0], length = values[1], width = values[3])
    val box2 = box1.copy(length = values[2])
    println(box1)
    println(box2)
}