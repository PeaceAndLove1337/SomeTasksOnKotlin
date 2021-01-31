//Задача не решена

fun fifthExample(inputList: List<Int>): Pair<Int, Int> {
    var indexToSwap: Int// Индекс, который будет заменен
    var swapIndex: Int// Индекс, на который произойдет замена

    val map:MutableMap<Int,Int> = mutableMapOf()
    inputList.forEachIndexed{index,elem -> map[index+1]=elem}
    val leftSet=map.keys.toSet()
    val rightSet=map.values.toSet()
    val minusSet=leftSet.minus(rightSet)
    val countOfBounds= mutableMapOf<Int,Int>()
    map.forEach { (key, elem) ->
        if (!countOfBounds.containsKey(elem)) countOfBounds[elem]=1
        else countOfBounds[elem]=countOfBounds[elem]!!.plus(1)
    }


    return Pair(-1, -1)
}
