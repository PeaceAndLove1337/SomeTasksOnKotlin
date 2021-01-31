/*
Получить булеан данной коллекции
Булеан - множество всех подмножеств
В данной реализации не учитываем пустое множество, как часть булеана
Мощность булеана равна 2^N, Где N - мощность исходного множества.
Учитывая, что мы исключаем пустое множество -> мощность булеана 2^N-1
*/
fun takeBooleanOfCollection(inputArr: Collection<Int>): Set<Set<Int>> {
    val result = mutableSetOf<Set<Int>>(inputArr.toSet())
    inputArr.forEach { it -> result.add(setOf(it)) }
    var i = 1
    var j: Int
    while (i != result.size) {
        j = i + 1
        while (j != result.size) {
            result.add(result.elementAt(i).plus(result.elementAt(j)))
            j++
        }
        i++
    }
    return result
}
