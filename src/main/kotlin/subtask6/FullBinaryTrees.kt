package subtask6



class Node {
    var key: Int = 0
    var left: Node? = null
    var right: Node? = null
}

internal class Tree {
    private val root: Node? = null
}

class FullBinaryTrees {


    fun stringForNodeCount(count: Int): String {

       // var key: Int
       //var left: Node? = null
       // var right: Node? = null
        var resarr = arrayListOf<String>()
        var childArray = arrayOfNulls<Node>(count)
        //var itemArray = arrayOfNulls<>(count-1)
        if (count < 1 && count % 2 == 0 ) {
            return resarr.toString()
        }
        if (count == 1) {
            resarr.add("[0]")
            return resarr.toString()
        }
        for (i in 1..count step 2) {
            for (left in 0..i){
                for (right in 0..(count-1)){
                    var newNode = Node()
                    //newNode.left?.key = left
                    //newNode.right?.key = right
                    //resarr.add(newNode.toString())
                }

            }
        }

        return resarr.toString()
    }
}



