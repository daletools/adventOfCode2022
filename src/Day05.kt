fun main() {
    fun parseInput(input: List<String>) {
        val inventorySize = input.indexOfFirst { it.isEmpty() }
        var (boxes, commands) = input.partition { input.indexOf(it) <= inventorySize }
        boxes = boxes.reversed().drop(2)

        println(boxes)
        println(commands)
    }

    fun part1(input: List<String>): Int {
        var score = 0

        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0

        return score
    }

    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day05_test")
    println("Part 1 Test:")
    println(part1(testInput))
    println("Part 2 Test:")
    println(part2(testInput))


    val input = readInput("Day05")
    println("Part 1:")
    println(part1(input))
    println("Part 2:")
    println(part2(input))
    println(parseInput(testInput))
}
