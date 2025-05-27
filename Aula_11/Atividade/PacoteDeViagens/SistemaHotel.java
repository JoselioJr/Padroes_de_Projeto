public class SistemaHotel {
    public Hotel reservar(String tipo) {
        double precoBase = 200;
        double preco;

        switch (tipo) {
            case "Executivo":
                preco = precoBase * 1.5;
                break;
            case "Suíte Presidencial":
                preco = precoBase * 1.5 * 3;
                break;
            default:
                preco = precoBase;
        }

        return new Hotel(tipo, preco);
    }
}
