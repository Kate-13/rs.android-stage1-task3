package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var prod = 1

        var neg1 = 0
        var neg2 = 0
        var neg3 = 0
        var neg4 = 0

        var pos1 = 1
        var pos2 = 1
        var pos3 = 1
        var pos4 = 1

        if (itemsFromArray.filterIsInstance<Int>().isEmpty()) {
            prod = 0
        }

        if (itemsFromArray.filterIsInstance<Int>().size <= numberOfItems) {
            itemsFromArray.forEach { el ->
                if (el is Int) {
                    prod *= el
                }
            }
        }
        if (itemsFromArray.filterIsInstance<Int>().size > numberOfItems) {
            if (numberOfItems == 3) {
                itemsFromArray.forEach { el ->
                    if (el is Int) {
                        if (el < 0) {
                            if (el <= neg1) {
                                neg3 = neg2
                                neg2 = neg1
                                neg1 = el
                            } else if (el <= neg2) {
                                neg3 = neg2
                                neg2 = el
                            } else {
                                neg3 = el
                            }
                        }
                        if (el > 0) {
                            if (el >= pos1) {
                                pos3 = pos2
                                pos2 = pos1
                                pos1 = el
                            } else if (el >= pos2) {
                                pos3 = pos2
                                pos2 = el
                            } else {
                                pos3 = el
                            }
                        }
                        val max1 = Math.max(neg1 * neg2 * neg3, pos1 * pos2 * pos3)
                        val max2 = Math.max(neg1 * neg2 * pos1, pos1 * pos2 * pos3)
                        prod = Math.max(max1, max2)
                    }
                }
            }
            if (numberOfItems > 3) {
                itemsFromArray.forEach { el ->
                    if (el is Int) {
                        if (el < 0) {
                            if (el <= neg1) {
                                neg4 = neg3
                                neg3 = neg2
                                neg2 = neg1
                                neg1 = el
                            } else if (el <= neg2) {
                                neg4 = neg3
                                neg3 = neg2
                                neg2 = el
                            } else if (el <= neg3) {
                                neg4 = neg3
                                neg3 = el
                            } else {
                                neg4 = el
                            }
                        }
                        if (el > 0) {
                            if (el >= pos1) {
                                pos4 = pos3
                                pos3 = pos2
                                pos2 = pos1
                                pos1 = el
                            } else if (el >= pos2) {
                                pos4 = pos3
                                pos3 = pos2
                                pos2 = el
                            } else if (el >= pos3) {
                                pos4 = pos3
                                pos3 = el
                            } else {
                                pos4 = pos3
                            }
                        }
                        val max1 = Math.max(neg1 * neg2 * neg3 * neg4, pos1 * pos2 * pos3 * pos4)
                        val max2 = Math.max(neg1 * neg2 * pos1 * pos2, pos1 * pos2 * pos3 * pos4)
                        prod = Math.max(max1, max2)
                    }
                }
            }
        }
        return prod
    }
}


