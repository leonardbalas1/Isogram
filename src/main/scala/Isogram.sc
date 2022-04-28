val word= "lumberjacks".toList
val before= word.length
val after=word.distinct.length
if(before== after) println("Is isogram indeed")
else println("Unfortunately it is not an isogram")

