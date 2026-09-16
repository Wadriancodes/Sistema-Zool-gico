import java.util.Scanner;

abstract class Animal {

    private String nome;
    private int tipoAlimentacao;
    private String especie;
    private int idade;
    private String sexo;
    private int periculosidade;
    private int tipoHab;
    private int habitat;
    private String hab;

    protected final Scanner sc = new Scanner(System.in);

    public void cadastrar() {

        System.out.println("Digite a espécie do animal: ");
        this.especie = sc.nextLine();

        System.out.println("""
                Escolha uma opção de alimentação:
                
                1 - Carnívoro
                2 - Herbívoro
                3 - Onívoro""");
        this.tipoAlimentacao = sc.nextInt();
        sc.nextLine();

        System.out.println("Selecione a opção correspondente a origem do animal: \n1 -> Brasileiro\n2 -> Estrangeiro");
        this.tipoHab = sc.nextInt();
        sc.nextLine();

        if (tipoHab == 1) {
            System.out.println("""
                    Escolha o habitat brasileiro:
                    1 -> Floresta Amazônica
                    2 -> Mata Atlântica
                    3 -> Cerrado
                    4 -> Pantanal
                    5 -> Caatinga
                    6 -> Pampa
                    """);
        } else {
            System.out.println("""
                    Escolha o habitat estrangeiro:
                    1 -> Savana Africana
                    2 -> Deserto do Saara
                    3 -> Floresta Temperada
                    4 -> Tundra Ártica
                    5 -> Taiga
                    6 -> Florestas Tropicais Asiáticas
                    """);
        }

        this.habitat = sc.nextInt();
        sc.nextLine();

        if (tipoHab == 1) {
            hab = switch (habitat) {
                case 1 -> """
                        Clima quente e úmido
                        
                        Vegetação densa
                        
                        Alta biodiversidade
                        
                        Chuvas intensas""";
                case 2 -> """
                        Alta umidade
                        
                        Vegetação fechada
                     
                        Temperatura amena a quente
                        
                        Solo rico, porém frágil""";
                case 3 -> """
                        Savana brasileira
                        
                        Árvores baixas e retorcidas
                        
                        Clima quente e seco
                        
                        Estação seca bem marcada
                        """;
                case 4 -> """
                        Planície inundável.
                        
                        Períodos de cheia e seca.
                        
                        Clima quente.""";
                case 5 -> """
                        Vegetação espinhosa
                        
                        Chuvas raras
                        
                        Temperaturas muito altas""";
                case 6 -> """
                        Campos abertos
                        
                        Clima frio no inverno
                        
                        Vegetação rasteira
                        
                        Presença de áreas úmidas""";
                default -> "Habitat brasileiro desconhecido";
            };
        } else {
            hab = switch (habitat) {
                case 1 -> "Gramíneas e poucas árvores\n" +
                        "\n" +
                        "Estação seca intensa\n" +
                        "\n" +
                        "Grande presença de herbívoros\n" +
                        "\n" +
                        "Predadores de grande porte";
                case 2 -> "Quase sem chuvas\n" +
                        "\n" +
                        "Altas temperaturas durante o dia\n" +
                        "\n" +
                        "Vegetação escassa\n" +
                        "\n" +
                        "Animais resistentes à seca";
                case 3 -> "Quatro estações bem definidas\n" +
                        "\n" +
                        "Árvores que perdem folhas\n" +
                        "\n" +
                        "Frio moderado\n" +
                        "\n" +
                        "Solo fértil";
                case 4 -> "Clima extremamente frio\n" +
                        "\n" +
                        "Vegetação rasteira\n" +
                        "\n" +
                        "Solos congelados (permafrost)\n" +
                        "\n" +
                        "Pouca diversidade";
                case 5 -> "Invernos longos\n" +
                        "\n" +
                        "Coníferas dominantes\n" +
                        "\n" +
                        "Baixa temperatura\n" +
                        "\n" +
                        "Mamíferos de grande porte";
                case 6 -> "Clima quente e úmido\n" +
                        "\n" +
                        "Vegetação densa\n" +
                        "\n" +
                        "Grande biodiversidade\n" +
                        "\n" +
                        "Muitos primatas e felinos";
                default -> "Habitat estrangeiro desconhecido";
            };
        }

        System.out.println("Digite a idade (anos): ");
        this.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o sexo (Macho ou Fêmea): ");
        this.sexo = sc.nextLine();

        System.out.println("Nível de periculosidade (0 - 5): ");
        this.periculosidade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do animal: ");
        this.nome = sc.nextLine();

        System.out.println("\n=== ANIMAL CADASTRADO ===");
        System.out.println("Espécie: " + especie);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("==========================\n");
    }

    public abstract void triagem();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoAlimentacao() {
        return tipoAlimentacao;
    }
    public void setTipoAlimentacao(int tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPericulosidade() {
        return periculosidade;
    }
    public void setPericulosidade(int periculosidade) {
        this.periculosidade = periculosidade;
    }

    public int getTipoHab() {
        return tipoHab;
    }
    public void setTipoHab(int tipoHab) {
        this.tipoHab = tipoHab;
    }

    public int getHabitat() {
        return habitat;
    }
    public void setHabitat(int habitat) {
        this.habitat = habitat;
    }

    public String getHab() {
        return hab;
    }
    public void setHab(String hab) {
        this.hab = hab;
    }
}