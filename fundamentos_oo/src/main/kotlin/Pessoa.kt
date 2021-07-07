class Pessoa {

    var nome: String = "Kivia"
    var cpf: String = "123.123.123-12"
            private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}
fun main() {
    val Kivia = Pessoa()

    println(Kivia.pessoaInfo())
}



