fun main() {

    fun part1(input: List<String>): Int {
        var score = 0
        val code = mutableSetOf<Char>()
        for (index in input[0].indices) {
            if (code.contains(input[0][index])) {
                code.clear()
                code += input[0][index]
            } else {
                code += input[0][index]
                if (code.size == 4) {
                    score = index + 1
                    break
                }
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        val code = mutableSetOf<Char>()
        for (index in input[0].indices) {
            if (code.contains(input[0][index])) {
                code.clear()
                code += input[0][index]
            } else {
                code += input[0][index]
                if (code.size == 14) {
                    score = index + 1
                    break
                }
            }
        }
        return score
    }
    //my solutions, part 2 did not work, learned about .windowed on the jetbrains day 6 recap and came back to fix

    fun windowedSolve(input: String, size: Int): Int {
        return input.windowed(size).indexOfFirst { it.toSet().size == size } + size
    }
    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day06_test")
    println("Part 1 Test:")
    println(part1(testInput))
    println("Part 2 Test:")
    println(part2(testInput))


    val input = readInput("Day06")
    println("Part 1:")
    println(part1(input))
    println("Part 2:")
    println(part2(input))

    println("Windowed solve")
    println("Part 1 Test:")
    println(windowedSolve(testInput[0], 4))
    println("Part 2 Test:")
    println(windowedSolve(testInput[0], 14))
    println("Part 1:")
    println(windowedSolve(input[0], 4))
    println("Part 2:")
    println(windowedSolve(input[0], 14))
}
