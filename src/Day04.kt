fun main() {

    fun part1(input: List<String>): Int {
        var score = 0
        for (line in input) {
            val elves = line.split(',')
            val elfA = elves[0].split('-')
            val elfB = elves[1].split('-')
            if ((elfA[0].toInt() <= elfB[0].toInt() && elfA[1].toInt() >= elfB[1].toInt()) ||
                    (elfB[0].toInt() <= elfA[0].toInt() && elfB[1].toInt() >= elfA[1].toInt())) {
                score++
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        for (line in input) {
            val elves = line.split(',')
            val elfA = elves[0].split('-')
            val elfB = elves[1].split('-')
            if (elfA[1].toInt() >= elfB[0].toInt() && elfA[0].toInt() <= elfB[1].toInt() ||
                elfB[1].toInt() >= elfA[0].toInt() && elfB[0].toInt() <= elfA[1].toInt()) score++
        }
        return score
    }

    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day04_test")
    println("Part 1 Test:")
    println(part1(testInput))
    println("Part 2 Test:")
    println(part2(testInput))


    val input = readInput("Day04")
    println("Part 1:")
    println(part1(input))
    println("Part 2:")
    println(part2(input))
}
