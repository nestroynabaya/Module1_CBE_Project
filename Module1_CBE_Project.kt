fun calculateMoMoFee(amount: int, balance: int){
    val fee = when{
        amount in 0..5000 -> 500
        amount in 5001..60000 -> 1000
        amount > 60000 -> 2000
        else -> 0
    }
    val total = amount + fee
    if (total <= balance) {
        println("Success")
        println("Amount: $amount")
        println("Fee: $fee")
        println("Remaining Balance: ${balance - total}")
    }
    else{
        print("Insufficient Funds")
    }
}

fun getGPA(score: Int): double {
    return when {
        score in 80..100 -> 5.0
        score in 75..79 -> 4.5
        score in 70..74 -> 4.0
        score in 65..69 -> 3.5
        score in 60..64 -> 3.0
        else -> 0.0
    }

}

fun printStudentDetails(name: String?, studentNumber: String?) {
    if(!name.isNullOrBlank() && !studentNumber.isNullOrBlank()){
        println("Welcome $name")
        println("Student Number: $studentNumber")
    }
    else{
        println("Error: Incomplete record")
    }
}

fun main() {
calculateMoMoFee(3000,30000)

val gpa = getGPA(82)
println("GPA: $gpa")

printStudentDetails("Nestroy", "053")
}