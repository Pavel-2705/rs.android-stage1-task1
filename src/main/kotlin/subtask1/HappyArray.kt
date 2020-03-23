package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyMutableList = sadArray.toMutableList()

        do {
            val intermediate: MutableList<Int> = mutableListOf()
            for (i in 0 until happyMutableList.size) {
                if (i == 0 || i == happyMutableList.size - 1 ||
                    (happyMutableList[i - 1] + happyMutableList[i + 1]) > happyMutableList[i]
                )
                    intermediate.add(happyMutableList[i])
            }
            val repeatCycle = intermediate.size != happyMutableList.size
            if (repeatCycle) {
                happyMutableList = intermediate
            }
        } while (repeatCycle)

        return happyMutableList.toIntArray()
    }
}
