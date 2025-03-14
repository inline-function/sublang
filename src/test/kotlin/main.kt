import api.tools.bracesStyle
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
//
//class BracesStyleTest {
//
//    @Test
//    fun testSimpleIndentation() {
//        val input = "line1\n    line2"
//        val expectedOutput = "line1{line2}"
//        assertEquals(expectedOutput, input.api.tools.bracesStyle(4))
//    }
//
//    @Test
//    fun testNestedIndentation() {
//        val input = "line1\n    line2\n        line3"
//        val expectedOutput = "line1{line2{line3}}"
//        assertEquals(expectedOutput, input.api.tools.bracesStyle(4))
//    }
//
//    @Test
//    fun testMixedIndentation() {
//        val input = "line1\n    line2\n        line3\n    line4\nline5"
//        val expectedOutput = "line1{line2{line3}line4}line5"
//        assertEquals(expectedOutput, input.api.tools.bracesStyle(4))
//    }
//
//    @Test
//    fun testNoIndentation() {
//        val input = "line1\nline2"
//        val expectedOutput = "line1line2"
//        assertEquals(expectedOutput, input.api.tools.bracesStyle(4))
//    }
//
//    @Test
//    fun testEmptyString() {
//        val input = ""
//        val expectedOutput = ""
//        assertEquals(expectedOutput, input.api.tools.bracesStyle(4))
//    }
//}