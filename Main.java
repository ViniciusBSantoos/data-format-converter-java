import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal do programa
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista que irá armazenar todos os campos informados
        List<Campo> campos = new ArrayList<>();

        // Objeto responsável por gerar JSON, XML e YAML
        ConversorDados conversor = new ConversorDados();

        System.out.println("======================================");
        System.out.println(" CONVERSOR DE DADOS - JSON XML YAML");
        System.out.println("======================================");

        System.out.println("\nDigite os dados no formato:");
        System.out.println("NOME_CAMPO;VALOR;TIPO");
        System.out.println("\nExemplos:");
        System.out.println("nome;Lucas;texto");
        System.out.println("idade;25;inteiro");
        System.out.println("altura;1.75;decimal");
        System.out.println("ativo;true;booleano");
        System.out.println("hobbies;futebol,musica,jogos;arrayTexto");
        System.out.println("\nTipos aceitos:");
        System.out.println("texto, data, datahora, inteiro, decimal, booleano");
        System.out.println("arrayTexto, arrayInteiro, arrayDecimal, arrayBooleano");

        System.out.println("\nDigite 'fim' para encerrar e gerar os formatos.\n");

        while (true) {

            System.out.print("Entrada: ");

            String entrada = scanner.nextLine();

            // Se o usuário digitar fim, para o loop
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            // Divide a entrada pelo ponto e vírgula
            String[] partes = entrada.split(";");

            // Verifica se foram informados 3 valores
            if (partes.length != 3) {
                System.out.println("Entrada inválida. Use o formato: NOME_CAMPO;VALOR;TIPO\n");
                continue;
            }

            String nome = partes[0].trim();
            String valor = partes[1].trim();
            String tipo = partes[2].trim();

            // Valida se o tipo informado é aceito
            if (!tipoValido(tipo)) {
                System.out.println("Tipo inválido informado.\n");
                continue;
            }

            // Cria um campo com as informações digitadas
            Campo campo = new Campo(nome, valor, tipo);

            // Adiciona o campo na lista
            campos.add(campo);

            System.out.println("Campo adicionado com sucesso!\n");
        }

        System.out.println("\n========== JSON ==========");
        System.out.println(conversor.gerarJson(campos));

        System.out.println("\n========== XML ==========");
        System.out.println(conversor.gerarXml(campos));

        System.out.println("\n========== YAML ==========");
        System.out.println(conversor.gerarYaml(campos));

        scanner.close();
    }

    // Método que valida os tipos aceitos pelo sistema
    public static boolean tipoValido(String tipo) {

        String tipoFormatado = tipo.toLowerCase();

        return tipoFormatado.equals("texto")
                || tipoFormatado.equals("data")
                || tipoFormatado.equals("datahora")
                || tipoFormatado.equals("inteiro")
                || tipoFormatado.equals("decimal")
                || tipoFormatado.equals("booleano")
                || tipoFormatado.equals("arraytexto")
                || tipoFormatado.equals("arrayinteiro")
                || tipoFormatado.equals("arraydecimal")
                || tipoFormatado.equals("arraybooleano");
    }
}