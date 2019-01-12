[![](https://jitpack.io/v/ibaton/kotlin-optional.svg)](https://jitpack.io/#ibaton/kotlin-optional)
# kotlin-optional
Optional wrapper for kotlin. Used to wrap nullable objects into optionals that can be handled by rxjava2.

## Usage
### Wrap value
```
val optional: Optional<String> = "Value".toOptional() 
```
```
val nullValue: String? = null
val optional: Optional<String> = "Value".toOptional() 
```

### Unwrap value
```
when(optional) {
  is Some -> { optional.value } // Do something with value
  is None -> {} // Handlde null
}
```
```
val value = optional.toNullable()
```
