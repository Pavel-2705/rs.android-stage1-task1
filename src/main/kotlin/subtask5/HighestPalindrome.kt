package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var wrongCounter = 0
        var replaceAllowedCounter = k

        for (i in 0..(n - 1) / 2) {
            if (digitString[i] != digitString[n - 1 - i]) {
                wrongCounter++
            }
        }

        if (wrongCounter > k) return "-1"
        val output = charArrayOf(*digitString.toCharArray())
        if ((k - wrongCounter) < 1) {
            for (i in 0..(n - 1) / 2) {
                if (digitString[i] != digitString[n - 1 - i]) {
                    val fromLeft = Integer.parseInt(digitString[i].toString())
                    val fromRight = Integer.parseInt(digitString[n - 1 - i].toString())
                    if (fromLeft > fromRight) output[n - 1 - i] = digitString[i]
                    else output[i] = digitString[n - 1 - i]
                    replaceAllowedCounter = replaceAllowedCounter - 1
                }
            }
            val builder = StringBuilder()
            for (c in output) builder.append(c)
            return builder.toString()
        } else {
            output[0] = '9'
            output[n - 1] = '9'
            replaceAllowedCounter = replaceAllowedCounter - 2
            for (i in 1..n - 2) output[i] == digitString[i]
            val builder = StringBuilder()
            for (c in output) builder.append(c)
            return highestValuePalindrome(n, replaceAllowedCounter, builder.toString())
        }
    }
}
