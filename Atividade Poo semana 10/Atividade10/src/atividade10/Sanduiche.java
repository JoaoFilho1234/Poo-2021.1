package atividade10;

public class Sanduiche {
    String nomeSanduiche;
    String tamanho;
    int numeroDeCarnes;
    boolean comparaString;
    Double preco;


    Sanduiche(String nomeSanduiche) {
        this.nomeSanduiche = nomeSanduiche;
        this.tamanho = "Medio";
        this.precoSanduiche(nomeSanduiche);
    }

    Sanduiche(String nomeSanduiche, String tamanho) {
        this.nomeSanduiche = nomeSanduiche;
        this.tamanho = tamanho;
        this.precoSanduiche(nomeSanduiche);
    }

    // 4. c) Crie um método que lança ambas as exceções criadas.
    public static void numeroCarnes(int carnes) throws CarnesInsuficienteException, ValorMaximoException {
        if(carnes < 1){
            throw new CarnesInsuficienteException(carnes);
        }
        if(carnes > 10){
            throw new ValorMaximoException("Número maximo de carnes atingido");
        }
    }

    // 3. Faça um método que lança uma nova exceção, do tipo Exception, com uma
    //mensagem. Dica: throw new Exception("Mensagem aqui.");
    void numCarnes(int i) throws Exception{
        this.numeroDeCarnes = i;
        if (numeroDeCarnes < 1) {
            throw new Exception("Número insuficiente de carnes!");
        } else {
            this.preco += (numeroDeCarnes - 1) * 3.99;
        }
    }

    boolean isComparaString(Sanduiche sanduiche1, Sanduiche sanduiche2) {

        if (sanduiche1.nomeSanduiche.equals(sanduiche2.nomeSanduiche)){
            return this.comparaString = true;
        }
        return this.comparaString = false;
    }

    void precoSanduiche(String nomeSanduiche) {

        switch (nomeSanduiche) {

            case "Frango Tomato Artesanal":
                if (tamanho.equals("Pequeno")) {
                    this.preco = 13.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 14.99;
                }
                else {
                    this.preco = 15.99;
                }
                break;

            case "Cheddar Australiano":
                if (tamanho.equals("Pequeno")){
                    this.preco = 10.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 11.99;
                }
                else {
                    this.preco = 12.99;
                }
                break;

            case "Crispy Bacon":
                if (tamanho.equals("Pequeno")) {
                    this.preco = 11.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 12.99;
                }
                else {
                    this.preco = 13.99;
                }
                break;

            default:
                this.preco = 9.99;

        }
    }


    public static void nomeSanduiche(Sanduiche sanduiche) {
        sanduiche.nomeSanduiche = "Bob's Frango Artesanal";
        System.out.println("Dentro do metodo: "+sanduiche.nomeSanduiche);
    }


    public static void nomeSanduiche(String nome) {
        nome = "Big Bob Frango";
        System.out.println("Dentro do metodo: "+nome);
    }

    public static void main(String[] args) throws Exception {

        // 4. d) Crie um código que chama o método criado e trata ambas as exceções
        //separadamente. Mostre a saída do console que diferencia cada tipo de exceção.

        Sanduiche sanduiche = new Sanduiche("Cheddar Australiano");
        //sanduiche.numCarnes(0);
        //System.out.println(sanduiche.preco);
        try  {
            numeroCarnes(2);
            System.out.println("Suas carnes foram adicionadas ao sanduiche!");
        }catch (CarnesInsuficienteException e){
            System.out.println("O número de carnes é insuficiente para preparo do sanduiche!");
            e.printStackTrace();
        }catch (ValorMaximoException e){
            System.out.println("O número maximo de carnes por sanduiche foi antingido!");
            e.printStackTrace();
        }
    }


}
