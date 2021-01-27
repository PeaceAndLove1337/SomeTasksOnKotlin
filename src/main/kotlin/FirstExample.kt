import kotlin.math.absoluteValue


fun firstExample(countOfReplacements: Int, inputArray: List<String>): Long {
    val mainSum = inputArray.map { it.toLong() }.sum()// Сумма исходных элементов
    val outputArray = inputArray.toMutableList()

    var currentK: Int = 0 //Итерируемся по количеству замен
    while (currentK < countOfReplacements) {
        var maxRank = 0 //Максимальный разряд числа, устраивающего нас для замены
        var indexOfNumberToChange: Int = 0
        var minDigit = 10//Цифра для замены
        //Итерируемся по индексам элементов входного массива, выполняя поиск наиболее "выгодного" числа
        for (i in outputArray.indices) {
            val currentRank = takeRank(outputArray[i])
            if (currentRank == -1) continue //Число состоит полностью из 9 ->оно нас не интересует, рассматриваем следующее

            val currentDigit =
                outputArray[i][outputArray[i].length - currentRank].toString().toInt()//Берем цифру, подлежащую замене

            //Если разряд больше -> замена для нас выгоднее
            if (currentRank > maxRank) {
                maxRank = currentRank
                minDigit = currentDigit
                indexOfNumberToChange = i
            } else //Если разряды равны -> следует заменить то число, цифра в старшем разряде которого меньше
                if (currentRank == maxRank)
                    if (currentDigit < minDigit) {
                        maxRank = currentRank
                        minDigit = currentDigit
                        indexOfNumberToChange = i
                    }
        }

        //Производим замену на цифру 9
        outputArray[indexOfNumberToChange] = outputArray[indexOfNumberToChange].replaceFirst(minDigit.toString(), "9")

        currentK++
    }
    //Выводим абсолютную разницу сумм
    return (mainSum - outputArray.map { it.toLong() }.sum()).absoluteValue
}

// Функция возвращает номер максимального разряда, который можно заменить (тот что не равен 9)
// Если таких не имеется функция вернет -1
fun takeRank(inputDigit: String): Int {
    for (j in inputDigit.indices)
        if (inputDigit[j] != '9')
            return inputDigit.length - j
    return -1
}
