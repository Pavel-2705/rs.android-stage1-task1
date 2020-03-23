package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billSum = bill.sum()
        val correct = (billSum - bill[k])/2

        return if (b == correct) "Bon Appetit" else (b - correct).toString()
    }
}
