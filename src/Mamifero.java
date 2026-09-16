
class Mamifero extends Animal {

    @Override
    public void triagem() {

        System.out.println("====== TRIAGEM DO MAMÍFERO ======");

        String alimento = "";

        if (getTipoAlimentacao() == 1) {
            alimento = "Carnes Variadas";
        } else if (getTipoAlimentacao() == 2) {
            alimento = "Frutas, Verduras e Folhas";
        } else if (getTipoAlimentacao() == 3) {
            alimento = "Frutas, Verduras, Folhas e Carnes";
        }

        String perigo = switch (getPericulosidade()) {
            case 0 -> "Nenhum risco.";
            case 1 -> "Baixo risco.";
            case 2 -> "Risco leve.";
            case 3 -> "Risco moderado.";
            case 4 -> "Alto risco.";
            default -> "Risco extremo!";
        };

        System.out.println("Alimentação: " + alimento);
        System.out.println("Periculosidade: " + perigo);
        System.out.println("Habitat ideal: " + getHab());
        System.out.println("==================================\n");
    }
}
