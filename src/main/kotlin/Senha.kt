import java.util.*

class Senha {
    fun solicitarSenha(scanner: Scanner): String {
        print("Digite a senha: ")
        var senha = scanner.nextLine()
        while (!verificarSenhaForte(senha)) {
            println("A senha não é forte o suficiente. Digite outra senha:")
            senha = scanner.nextLine()
        }
        return senha
    }

    private fun verificarSenhaForte(senha: String): Boolean {
        val digitos = senha.filter { it.isDigit() }.length
        val letras = senha.filter { it.isLetter() }.length
        return senha.length >= 10 && digitos >= 2 && letras >= 2
    }
}