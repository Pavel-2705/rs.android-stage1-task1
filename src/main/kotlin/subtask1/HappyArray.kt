package subtask1
class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyMutableList = sadArray.toMutableList()
        var intermediate: MutableList<Int> = mutableListOf()

        for (i in 0 until happyMutableList.size) {
            if (i == 0 || i == happyMutableList.size - 1 ||
                (happyMutableList[i - 1] + happyMutableList[i + 1]) > happyMutableList[i]
            )
                intermediate.add(happyMutableList[i])
        }

        while (happyMutableList != intermediate) {
            happyMutableList = intermediate
            intermediate = mutableListOf()
            for (i in 0 until happyMutableList.size) {
                if (i == 0 || i == happyMutableList.size - 1 || (happyMutableList[i - 1] + happyMutableList[i + 1]) > happyMutableList[i]) {
                    intermediate.add(
                        happyMutableList[i]
                    )
                }
            }
        }
        print(intermediate.toIntArray().contentToString())
        return happyMutableList.toIntArray()
    }
}
