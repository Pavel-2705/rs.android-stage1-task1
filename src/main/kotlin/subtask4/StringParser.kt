package subtask4

import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val delimiter = charArrayOf(
            '<', '>',
            '[', ']',
            '(', ')'
        )
        val simple = Stack<StringBuilder>()
        val triangle = Stack<StringBuilder>()
        val square = Stack<StringBuilder>()
        val output = mutableListOf<String>()
        var count = 0
        val map = hashMapOf<Int, StringBuilder>()
        for (c in inputString) {
            when (c) {
                delimiter[0], delimiter[2], delimiter[4] -> {
                    updateStacks(simple, triangle, square, c)
                    val builder = StringBuilder()
                    when (c) {
                        delimiter[0] -> triangle.push(builder)
                        delimiter[2] -> square.push(builder)
                        delimiter[4] -> simple.push(builder)
                    }
                    map.put(count++, builder)
                }

                delimiter[1], delimiter[3], delimiter[5] -> {
                    when (c) {
                        delimiter[1] -> if (!triangle.empty()) output.add(triangle.pop().toString())
                        delimiter[3] -> if (!square.empty()) output.add((square.pop().toString()))
                        delimiter[5] -> if (!simple.empty()) output.add(simple.pop().toString())
                    }
                    updateStacks(simple, triangle, square, c)
                }
                else -> updateStacks(simple, triangle, square, c)
            }

        }

        val outputArray = mutableListOf<String>()
        for (i in 0 until map.size) outputArray.add(map[i].toString())
        return outputArray.toTypedArray()
    }

    private fun updateStacks(
        simple: Stack<StringBuilder>,
        triangle: Stack<StringBuilder>,
        square: Stack<StringBuilder>,
        c: Char
    ) {
        for (s in simple) s.append(c)
        for (t in triangle) t.append(c)
        for (q in square) q.append(c)
    }
}
