fun main() {
    fun part1(input: List<String>): Int {
        val elves = IntArray(input.filter { it.isEmpty() }.size + 1)
        var elf = 0
        for (item in input) {
            val cal = item.toIntOrNull()
            if (cal != null) {
                elves[elf] += cal
            } else {
                elf++
            }
        }
        return elves.maxOrNull() ?: 0
    }

    fun part2(input: List<String>): Int {
        val elves = IntArray(input.filter { it.isEmpty() }.size + 1)
        var elf = 0
        for (item in input) {
            val cal = item.toIntOrNull()
            if (cal != null) {
                elves[elf] += cal
            } else {
                elf++
            }
        }
        var cals = 0
        repeat(3) {
            val max = elves.maxOrNull() ?: 0
            elves[elves.indexOf(max)] = 0
            cals += max
        }
        return cals
    }



    // test if implementation meets criteria from the description, like:

    val testInput = readInput("Day01_test")
    println(part2(testInput))


    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
