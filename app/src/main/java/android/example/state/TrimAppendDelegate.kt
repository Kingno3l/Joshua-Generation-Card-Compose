package android.example.state

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TrimAppendDelegate :ReadWriteProperty<Any, String> {

    private var trimAppendString = ""

    override fun getValue(thisRef: Any, property: KProperty<*>) = trimAppendString

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        trimAppendString = "Hello ${value.trim()}"
    }

}

class Example {
    var stringOne: String by TrimAppendDelegate()
}

fun main() {
    val example = Example()
    example.stringOne = "     Hello Nation         "
    println(example.stringOne)
}