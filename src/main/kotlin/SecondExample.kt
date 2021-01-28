
fun String.haveSameSymbols():Boolean{
    val firstElem=this[0]
    for (i in 1 until this.length)
        if (firstElem!=this[i])
            return false
    return true
}

fun secondExample(left:Long,right:Long):Int{
    val mySeq=left..right
    return mySeq.filter { it.toString().haveSameSymbols() }.count()
}