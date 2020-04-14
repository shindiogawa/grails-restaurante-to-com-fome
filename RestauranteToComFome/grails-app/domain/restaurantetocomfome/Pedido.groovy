package restaurantetocomfome

class Pedido {
    Date dataHora
    Double valorTotal
    Cliente cliente
    static constraints = {
        valorTotal min: new Double(0)
        cliente nullable: false
    }

    static hasMany = [itens: ItemPedido]
    static mapping = {
        id column: "id"
        cliente column: "id_cliente"
    }
}
