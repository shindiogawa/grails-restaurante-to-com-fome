package restaurantetocomfome

class Sobremesa extends Produto{
    Integer calorias
    static constraints = {
        calorias min: 0
    }

    static mapping = {
        id column: "id"
        discriminator value : "SOBREMESA"
    }
}
