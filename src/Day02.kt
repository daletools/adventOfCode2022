fun main() {

    fun part1(input: List<String>): Int {
        var score = 0
        for (match in input) {
            val elf = match.first()
            val player = match.last()
            when (player) {
                'X' -> score += 1
                'Y' -> score += 2
                'Z' -> score += 3
            }
            if (elf - 'A' == player - 'X') {
                score += 3
                continue
            }
            when (elf) {
                'A' -> {
                    if (player == 'Y') {
                        score += 6
                    }
                }
                'B' -> {
                    if (player == 'Z') {
                        score += 6
                    }
                }
                'C' -> {
                    if (player == 'X') {
                        score += 6
                    }
                }
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        val match = mapOf<Pair<Char, Char>, Int>(
            Pair('A', 'X') to 3, Pair('A', 'Y') to 4, Pair('A', 'Z') to 8,
            Pair('B', 'X') to 1, Pair('B', 'Y') to 5, Pair('B', 'Z') to 9,
            Pair('C', 'X') to 2, Pair('C', 'Y') to 6, Pair('C', 'Z') to 7
        )
        for (round in input) {
            val elf = round.first()
            val result = round.last()
            score += match[Pair(elf, result)] ?: 0
        }
        return score
    }



    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day02_test")
    println("Part 1 Test:")
    println(part1(testInput))
    println("Part 2 Test:")
    println(part2(testInput))


    val input = readInput("Day02")
    println("Part 1:")
    println(part1(input))
    println("Part 2:")
    println(part2(input))
}
