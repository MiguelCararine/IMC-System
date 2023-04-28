import java.util.*

class Usuario {
    fun solicitarEmail(scanner: Scanner): String {
        print("Digite o email: ")
        return scanner.nextLine()
    }

    fun solicitarPeso(scanner: Scanner): Double {
        print("Digite o peso em kg: ")
        return scanner.nextDouble()
    }

    fun solicitarAltura(scanner: Scanner): Double {
        print("Digite a altura em metros: ")
        return scanner.nextDouble()
    }
}