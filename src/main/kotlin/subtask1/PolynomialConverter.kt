package subtask1

import kotlin.math.absoluteValue

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        var r = ""
        var res: String? = ""
        if (numbers.isNullOrEmpty()) res = null
        else {
            numbers.forEachIndexed { i, num ->
                val a = num.absoluteValue
                val st = numbers.size - i - 1
                if (i == 0) {
                    if (st == 0) r = "$a"
                    else r = "$a" + "x^" + "$st"
                }
                if (i > 0) {
                    if (num == 0) r = ""
                    if (num == -1) {
                        if (st == 1) r = " - x"
                        else r = " - x^" + "$st"
                    }
                    if (num == 1) {
                        if (st == 1) r = " + x"
                        else r = " + x^" + "$st"
                    }
                    if (num > 0 && num != 1) {
                        if (st == 1) r = " + $a" + "x"
                        else if (st == 0) r = " + $a"
                            else r = " + $a" + "x^" + "$st"
                    }
                    if (num < 0 && num != -1) {
                        if (st == 1) r = " - $a" + "x"
                        else if (st == 0) r = " - $a"
                            else r = " - $a" + "x^" + "$st"
                    }
                }
                res += r
            }
        }
        return res
    }
}
