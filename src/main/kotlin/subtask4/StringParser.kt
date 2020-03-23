package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val delimiter = charArrayOf(
            '<', '>',
            '[', ']',
            '(', ')'
        )
        val myIndexes = intArrayOf()

        inputString.forEachIndexed { index, char ->
            when (char) {
                delimiter[0] -> myIndexes[0] = (index)
                delimiter[1] -> myIndexes[1] = (index)
                delimiter[2] -> myIndexes[2] = (index)
                delimiter[3] -> myIndexes[3] = (index)
                delimiter[4] -> myIndexes[4] = (index)
                delimiter[5] -> myIndexes[5] = (index)
            }
        }

        val output = mutableListOf<String>()
        output.add(inputString.substring(myIndexes[0], myIndexes[1]))
        output.add(inputString.substring(myIndexes[2], myIndexes[3]))
        output.add(inputString.substring(myIndexes[3], myIndexes[4]))

        return output.toTypedArray()
    }
}
