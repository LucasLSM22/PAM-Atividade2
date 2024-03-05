package funcoes
//inicio da funçao de calcular area
fun AreaLosan(diagMaior: Int, diagMenor: Int): Int {
    //valores para retornar
    return (diagMaior * diagMenor) / 2
}

fun main() {
    //variavesi com valores
    val diaglMaior = 15
    val diagMenor = 15
    val area = AreaLosan(diagMaior, diagMenor)
    //exibição dos resultados finais
    println("A área do Losango é: $area")
}
