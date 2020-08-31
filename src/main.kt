fun main(){

    var obj = Summation(5,7)
    println(obj.sum())

    emp(1,"Somiah", "Female")
    emp(2,"Ahmed")

}

class Summation(num1:Int, num2:Int){
    private var number1:Int = 0
    private var number2:Int = 0

    init {
        number1=num1
        number2=num2
    }

    fun sum(): Int {
      return  number1 + number2
    }
}

class emp{

    constructor(id:Int, name:String  ): this(id,name,"male"){
        println("Emp id = $id Emp Name: $name")
    }
    constructor(id:Int, name:String ,gender:String ){
        println("Emp id= $id Emp Name: $name Gender: $gender")
    }
}