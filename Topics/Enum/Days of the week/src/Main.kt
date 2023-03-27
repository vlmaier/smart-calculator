enum class DaysOfTheWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main() {
    for (day in DaysOfTheWeek.values()) {
        println(day)
    }
}