package ex1

/*
* Даётся строчка, в которой находятся символы в разном порядке. Задача - посчитать количество символов в этой строчке.
* Примеры:
* "AFAFA" - "A - 3, F - 2"
* "abABaBA" - "A - 4, B - 3"
* "ABCDEF" - "A - 1, B - 1, C - 1, D - 1, E - 1, F - 1"
*
* Подсказки:
* 1. HashMap<Int, Char>
* 2. for (i in hashMap.keySet())
* 3. Pair<Int, String>
* 4. arrayList.sortBy { it.first }
*/

object Solution {
    fun execute(string: String): ArrayList<Pair<Char, Int>> {

        // Хэшмапа - один символ и его количество.
        val hashMap = HashMap<Char, Int>()
        // Делаем все маленькие буквы большими, проходимся циклом по строке.
        string.toUpperCase().forEach { char ->
            // Если символ уже встречался.
            if (hashMap.containsKey(char)) {
                // Прибавляем 1 к его количеству повторений.
                hashMap[char] = hashMap[char]!! + 1
            } else {
                // Иначе количество повторений = 1.
                hashMap[char] = 1
            }
        }

        val listToReturn = arrayListOf<Pair<Char, Int>>()

        // Ключи хэшмапы.
        hashMap.keys.forEach {
            listToReturn.add(Pair(it, hashMap[it] ?: 0))
        }

        // Сортируем по алфавиту.
        listToReturn.sortBy { it.first }

        // Выводим букву и количество ее повторений в строке.
        listToReturn.forEach {
            println("${it.first} - ${it.second}")
        }
        // Возвращаем.
        return listToReturn
    }
}


