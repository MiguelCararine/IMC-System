import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val usuario = Usuario()
    val email = usuario.solicitarEmail(scanner)
    val senha = Senha().solicitarSenha(scanner)
    val peso = usuario.solicitarPeso(scanner)
    val altura = usuario.solicitarAltura(scanner)
    val imc = IMC().calcularIMC(peso, altura)
    val kgAcimaDoPeso = IMC().calcularKgAcimaDoPeso(imc)
    println("O email é: $email")
    println("O IMC é: $imc")
    println("O usuário está $kgAcimaDoPeso quilos acima do peso.")
}