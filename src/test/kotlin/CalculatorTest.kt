import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest{
    @Test
    fun testMultiplyBy2(){
        val calculator = Calculator()
        val result = calculator.parse("2*2")
        assertEquals(4,result)
    }
}