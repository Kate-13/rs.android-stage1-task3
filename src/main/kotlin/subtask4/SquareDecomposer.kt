package subtask4

import kotlin.math.roundToInt

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {

            val numsqr = Math.pow(number.toDouble(), 2.0)
            val resarr: ArrayList<Int>? = arrayListOf()
            val arr = arrayListOf<Double>()
            var nextel = number - 1
            resarr?.add(nextel)
            var restsum = numsqr - Math.pow(nextel.toDouble(), 2.0)
            if (number > 0) {

                while (restsum > 0) {
                    var sqrtel = Math.sqrt(restsum)
                    var next = Math.floor(sqrtel)
                    resarr?.add(next.toInt())
                    resarr?.sort()
                    println(resarr)
                    restsum = restsum - Math.pow(next, 2.0)

                }
            } else return null
            resarr?.forEachIndexed { i , el ->
            if (resarr?.size > 1) {
                if (el < resarr[i+1]){
                    println(resarr)
                    return resarr?.toTypedArray()
                }else return null
            }
        }
        return resarr?.toTypedArray()
    }
}