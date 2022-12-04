fun main() {

    fun part1(input: List<String>): Int {
        var score = 0
        for (line in input) {
            val pockets = line.chunked(line.length / 2)
            for (char in pockets[0]) {
                if (pockets[1].contains(char)) {
                    score += char.lowercaseChar() - '`'
                    if (char.isUpperCase()) score += 26
                    break
                }
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        val groups = input.chunked(3)
        for (group in groups) {
            for (char in group[0]) {
                if (group[1].contains(char) && group[2].contains(char)) {
                    score += char.lowercaseChar() - '`'
                    if (char.isUpperCase()) score += 26
                    break
                }
            }
        }
        return score
    }



    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day03_test")
    println("Part 1 Test:")
    println(part1(testInput))
    println("Part 2 Test:")
    println(part2(testInput))


    val input = readInput("Day03")
    println("Part 1:")
    println(part1(input))
    println("Part 2:")
    println(part2(input))
}
