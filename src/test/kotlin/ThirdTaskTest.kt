import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class ThirdTaskTest {

    @Test
    fun thirdExampleTest1() {
        Assert.assertEquals(Pair(-1,-1), thirdExample(listOf(2,1,4,6)))
    }
    @Test
    fun thirdExampleTest2() {
        Assert.assertEquals(Pair(-1,-1), thirdExample(listOf(1,2)))
    }
    @Test
    fun thirdExampleTest3() {
        Assert.assertEquals(Pair(2,1), thirdExample(listOf(2,1)))
    }
    @Test
    fun thirdExampleTest4() {
        Assert.assertEquals(Pair(6,5), thirdExample(listOf(1,2,3,4,6,7)))
    }
}