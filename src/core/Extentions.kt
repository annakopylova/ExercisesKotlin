package core

fun <T> assertEquals(value: T, functionValue: T) {
    if (value != functionValue) {
        throw RuntimeException("Тест провален, тестовое значение $value, получили $functionValue")
    }
}