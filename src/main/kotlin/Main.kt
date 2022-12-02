fun main() {
    print(solution(mutableListOf(5, 1, 3, 4, 1), 0))
}

fun solution(votes: MutableList<Int>, k: Int): Int {
    val map = HashMap<Int, Int>()
    var count = 0
    val max = votes.maxOrNull() ?: 0
    for (i in 0 until votes.size) {
        map[votes[i]] = (map[votes[i]] ?: 0) + 1
        if (k + votes[i] > max) {
            count++
        }
    }

    if (map.none { it.value == 1 } && k == 0) return 0
    else if (k == 0) {
        return 1
    }

    return count
}

