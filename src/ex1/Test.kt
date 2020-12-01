package ex1

import core.assertEquals

fun main() {
    assertEquals(
        arrayListOf(
            Pair('A', 3), Pair('F', 2)
        ), Solution.execute("AFAFA")
    )
    assertEquals(
        arrayListOf(
            Pair('A', 4), Pair('B', 3)
        ), Solution.execute("abABaBA")
    )
    assertEquals(
        arrayListOf(
            Pair ('A', 1), Pair('B', 1), Pair('C', 1), Pair('D', 1), Pair('E', 1), Pair('F', 1)
        ), Solution.execute("ABCDEF")
    )
}