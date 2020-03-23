package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var allElementSum = 0
        var minOut: Int
        var maxOut = 0

        for (item in input) {
            allElementSum += item
        }

        minOut = allElementSum
        for (item in input) {
            val currentSum = allElementSum - item

            if (currentSum > maxOut) {
                maxOut = currentSum
            } else if (currentSum < minOut) {
                minOut = currentSum
            }
        }

        return intArrayOf(minOut, maxOut)
    }
}
