import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class FirstExampleTest {

    @Test
    fun firstExampleTest1() {
        val nAndK = mutableListOf<String>("5", "2") //Количество элементов - N, количество замен - K
        val inputValues =  mutableListOf<String>("1", "2", "1", "3", "5") //Входные элементы массива
        Assert.assertEquals(16 ,firstExample(nAndK[1]!!.toInt(), inputValues))
    }

    @Test
    fun firstExampleTest2() {
        val nAndK = mutableListOf<String>("3", "1")
        val inputValues =  mutableListOf<String>("99", "5", "85")
        Assert.assertEquals(10 ,firstExample(nAndK[1]!!.toInt(), inputValues))
    }

    @Test
    fun firstExampleTest3() {
        val nAndK = mutableListOf<String>("1", "19")
        val inputValues =  mutableListOf<String>("9999")
        Assert.assertEquals(0 ,firstExample(nAndK[1]!!.toInt(), inputValues))
    }

    @Test
    fun firstExampleTest4() {
        val nAndK = mutableListOf<String>("4", "3")
        val inputValues =  mutableListOf<String>("139","21", "991", "312") //Должно быть заменено на 939 21 991 992
        Assert.assertEquals(1480 ,firstExample(nAndK[1]!!.toInt(), inputValues))
    }
}