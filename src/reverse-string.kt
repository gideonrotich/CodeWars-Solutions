/*
Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

"Hey fellow warriors"  --> "Hey wollef sroirraw"
"This is a test        --> "This is a test"
"This is another test" --> "This is rehtona test"*/

fun spinWords(sentence: String): String {
    // Your code goes here!
    val list = mutableListOf<String>()
    val words = sentence.split(" ")

    for ((index, word) in words.withIndex()) {
        if (word.length >= 5)
            list.add(word.reversed())
        else
            list.add(word)

        if (index < words.size - 1)
            list.add(" ")
    }

    return list.joinToString("")

}
