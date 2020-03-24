package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var wrong = 0

        for (i in 0..(n - 1) / 2) {
            if (digitString[i] != digitString[n - 1 - i]) {
                wrong++
            }
        }

        if (wrong > k) return "-1"
        return "test"
    }
}
