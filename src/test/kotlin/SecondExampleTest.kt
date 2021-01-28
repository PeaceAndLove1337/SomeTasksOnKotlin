import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class SecondExampleTest {

    @Test
    fun secondExampleTest1() {
    Assert.assertEquals(9,secondExample(10,100))
    }
    @Test
    fun secondExampleTest2() {
        Assert.assertEquals(4,secondExample(4,7))
    }
    @Test
    fun secondExampleTest3() {
        Assert.assertEquals(1,secondExample(721,800))
    }
    @Test
    fun secondExampleTest4() {
        Assert.assertEquals(2,secondExample(799,1000))
    }
}