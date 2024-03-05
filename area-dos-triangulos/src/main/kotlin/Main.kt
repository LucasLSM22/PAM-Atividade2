package funcoes
//importação da classe para auxiliar nos calculos
import kotlin.math.sqrt]
//classe para armazenar todas as funções (uma tentativa)
class Triangulo {
    companion object {
        //funcoes para os calculos
        fun areaTrianguloEquilatero(lado: Double): Double {
            return (sqrt(3.0) / 4) * lado * lado
        }

        fun areaTrianguloIsosceles(base: Double, altura: Double): Double {
            return (base * altura) / 2
        }

        fun areaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
            val s = (lado1 + lado2 + lado3) / 2
            return sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
        }
    }
}

fun main() {
    //variavel para escolher o tipo de triangulo
    println("Escolha o tipo de triângulo: 1 - Equilatero, 2 - Isóceles, 3 - Escaleno")
    val opcao = 1

    when (opcao) {
        //estrutura de decisão para os calculos
        1 -> {
            val lado = 5.0
            println("Área do Triângulo Equilátero é: ${Triangulo.areaTrianguloEquilatero(lado)}")
        }
        2 -> {
            val base = 4.0
            val altura = 3.0
            println("Área do Triângulo Isósceles é: ${Triangulo.areaTrianguloIsosceles(base, altura)}")
        }
        3 -> {
            val lado1 = 7.0
            val lado2 = 8.0
            val lado3 = 9.0
            println("Área do Triângulo Escaleno é: ${Triangulo.areaTrianguloEscaleno(lado1, lado2, lado3)}")
        }
        else -> println("Opção inválida!")
    }
}
