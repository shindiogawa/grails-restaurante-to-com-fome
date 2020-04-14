package restaurantetocomfome

class Prato extends Produto{
    Integer quantidadePessoas
    static constraints = {
        quantidadePessoas min: 1
    }

    static mapping = {
        id column: "id"
        discriminator value: "PRATO"
    }
}
