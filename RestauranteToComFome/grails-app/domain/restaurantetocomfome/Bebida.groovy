package restaurantetocomfome

class Bebida extends Produto{
    Double liquido
    String unidade
    static constraints = {
        liquido min: new Double(0)
        unidade blank: false, inList: ["l","ml"]
    }

    static mapping = {
        id column: "id"
        discriminator value: "BEBIBA"
    }
}
