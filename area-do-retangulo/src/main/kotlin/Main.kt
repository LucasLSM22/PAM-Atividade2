package funcoes
//inicio da funcao de calcular area
fun calcularRetangulo(comprimento: Int, largura: Int): Int {
    //valores para retornar
    return comprimento * largura
}

fun main() {
    //variaveis com valores
    val comprimento = 4
    val largura = 5
    val area = calcularRetangulo(comprimento, largura)
    //exibição do resultado
    println("O resultado da área do retângulo é: $area")
}


