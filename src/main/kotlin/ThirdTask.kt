fun thirdExample(inputList: List<Int>): Pair<Int, Int> {
    var even: Int = -1  // Четная позиция для замены
    var uneven: Int = -1 // Нечетная позиция для замены
    var countOfEven = 0
    // Итерируемся по входному массиву и ищем переменные
    // для замены(четный рост на нечетном индексе и нечетный рост на чётном),
    // а также считаем количество четных элементов
    inputList.forEachIndexed { index, elem ->
        if (elem % 2 == 0)
            countOfEven++
        if ((index + 1) % 2 != 0) {
            if (elem % 2 == 0)
                uneven = index + 1
        } else
            if (elem % 2 != 0)
                even = index + 1
    }

    return if ((even == -1 || uneven == -1) || (countOfEven != inputList.size / 2))
        Pair(-1, -1)
    else Pair(even, uneven)


}