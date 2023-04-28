class IMC {
    fun calcularIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }

    fun calcularKgAcimaDoPeso(imc: Double): Double {
        val pesoIdeal = 25 * (Math.pow(imc, 2.0))
        return if (pesoIdeal >= 0) pesoIdeal else 0.0
    }
}