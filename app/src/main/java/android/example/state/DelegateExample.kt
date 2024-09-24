package android.example.state

var string : String = ""
    set(value){
        field = "Hi ${value.trim()}"
    }

//var stringFirst : String = ""
//    set(value){
//        field = "Hi ${value.trim()}"
//    }
//
//
//var stringSecond : String = ""
//    set(value){
//        field = "Hi ${value.trim()}"
//    }
//
//
//
//var stringThird : String = ""
//    set(value){
//        field = "Hi ${value.trim()}"
//    }

class Hello {
    private var stringOne by TrimAppendDelegate()

}

fun main(){
    string = "Joshua               "
    println(string)
}