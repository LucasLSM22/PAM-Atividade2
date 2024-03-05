package funcoes
//inicio da funcao
fun areaCircun(raio: Int): Double {
    //declaracao de variaveis
    val pi = 3.14 // Valor aproximado de PI
    //valor de retorno
    return pi * raio * raio
}

fun main() {
    //declaracao de variaveis com valores
    val raio = 6
    val area = areaCircun(raio)
    //exibição de resultado
    println("O valor da área desta circunferência é: $area")
}
