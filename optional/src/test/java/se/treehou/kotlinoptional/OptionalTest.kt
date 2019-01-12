package se.treehou.kotlinoptional

import org.junit.Assert.assertEquals
import org.junit.Test

class OptionalTest {

    @Test
    fun optional_someEquals() {
        val data = "Optional"
        val optional = Optional.Some(data)

        assertEquals(data, optional.value)
    }

    @Test
    fun optional_noneEquals() {
        val optional = Optional.None

        assertEquals(Optional.None, optional)
    }

    @Test
    fun optional_noneToOptional() {
        val value: String? = null
        val none = value.toOptional()

        assertEquals(Optional.None, none)
    }

    @Test
    fun optional_valueToOptional() {
        val value = "Optional"
        val some = value.toOptional()

        assertEquals(Optional.Some(value), some)
    }

    @Test
    fun optional_optionalToNull() {
        val value = Optional.None.toNullable()
        val expected: String? = null

        assertEquals(expected, value)
    }

    @Test
    fun optional_optionalToValue() {
        val value = Optional.Some("Optional").toNullable()

        assertEquals("Optional", value)
    }
}