package subtask5


class TelephoneFinder {


    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        val res: ArrayList<String> ? = arrayListOf()
        val phone : Array<Array<String>> = Array(4, { Array(3, {""}) })
        phone[0] = arrayOf("1", "2", "3")
        phone[1] = arrayOf("4", "5", "6")
        phone[2] = arrayOf("7", "8", "9")
        phone[3] = arrayOf("-1", "0", "-1")

        number.forEachIndexed { ind, s ->
            if (s.toString() == "-") return null
            for (i in 0..3) {
                for (j in 0..2) {
                    if (phone[i][j] == s.toString()) {
                        if (i > 0 && i <= 3) {
                            val tn = phone[i - 1][j]
                            val new = number.substring(0,ind) + tn + number.substring(ind+1,number.length)
                            res?.add(new)
                        }
                        if (i >= 0 && i < 3) {
                            val bn = phone[i + 1][j]
                            if (bn != "-1") {
                                val new = number.substring(0,ind) + bn + number.substring(ind+1,number.length)
                                res?.add(new)
                            }
                        }
                        if (j > 0 && j <= 2) {
                            val ln = phone[i][j - 1]
                            if (ln != "-1"){
                                val new = number.substring(0,ind) + ln + number.substring(ind+1,number.length)
                                res?.add(new)
                            }
                        }
                        if (j >= 0 && j < 2) {
                            val rn = phone[i][j + 1]
                            if (rn != "-1") {
                                val new = number.substring(0,ind) + rn + number.substring(ind+1,number.length)
                                res?.add(new)
                            }
                        }
                    }
                }
            }
        }
            val size = res?.size ?: 0
            val result: Array<String>? = Array(size, {""})
            res?.forEachIndexed { k, el ->
                result?.set(k, el)
            }

        return result
    }
}
