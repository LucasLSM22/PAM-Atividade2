package funcoes
//inicio da funçaõ de calculo da area do trapezio
fun areaTrapezio(baseMaior: Int, baseMenor: Int, altura: Int): Int {
    //valores de retorno
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    //variavies com valores
    val baseMaior = 20
    val baseMenor = 12
    val altura = 8
    val area = areaTrapezio(baseMaior, baseMenor, altura)
    println("O resultado final da área do Trapézio é: $area")
}
