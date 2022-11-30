fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2).count { (a, b) -> a < b }
    }

    fun part2(input: List<Int>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    // val testInput = readInputAsInts("Day01_test")
    // check(part1(testInput) == 1)

    val input = readInputAsInts("Day01")
    println(part1(input))
    println(part2(input))
}
