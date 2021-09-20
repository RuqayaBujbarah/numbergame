import kotlin.random.Random
fun main(){
    val num = Random.nextInt(0,10)
    var num2 = 0
    var count = 1
    var userinput = ""
    println("*type quit at any time to end the game*")
    print("Guess a number between 0 and 10: ")

    while (count<4){
        try

        {   userinput = readLine().toString()
            when{
                userinput.equals("quit") -> {   count = 4
                    break}
                else -> {num2 = userinput!!.toInt()
                    when{
                        num2<=0||num2>=10 -> print("Please enter numbers between 0 and 10 only: ")
                        else -> {when{
                            num2==num -> {println("You got it!")
                                count = 4}
                            else -> { when{
                                count<3  -> {print("Wrong guess! Try again!: ")
                                    count++}
                                else -> {println("Wrong guess! The number was $num")
                                    count=4}

                            }}}}}}}}
        catch(e: Exception){
            print("Please enter numbers only: ")
        }}
    println("Game Over")
}