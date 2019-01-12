package koptional.treehou.se.optional

/**
 * Representation of a object that might have a value.
 */
sealed class Optional<out T>{

    /**
     * Represents a value containing some data.
     */
    data class Some<out T: Any>(val value: T): Optional<T>()

    /**
     * Represents the lack of a value.
     */
    object None: Optional<Nothing>()

    /**
     * Convert optional to nullable value.
     */
    fun toNullable(): T? {
        return when(this){
            is Some -> value
            is None -> null
        }
    }
}

/**
 * Convert object to optional.
 *
 * @return None if object is null, else Some containing object.
 */
fun <T : Any> T?.toOptional(): Optional<T> {
    return if (this == null){
        Optional.None
    } else{
        Optional.Some(this)
    }
}



