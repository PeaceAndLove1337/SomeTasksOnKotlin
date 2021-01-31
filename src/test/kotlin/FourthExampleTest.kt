import org.junit.Test

import org.junit.Assert.*

class FourthExampleTest {

    @Test
    fun takeBooleanOfCollection() {
        assertEquals(
            takeBooleanOfCollection(setOf(4, 7, 9)),
            setOf(setOf(4), setOf(7), setOf(9), setOf(4, 7), setOf(4, 9), setOf(7, 9),setOf(4, 7, 9))
        )
    }
}