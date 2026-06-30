import java.util.List;

// Classe responsável por converter os campos para JSON, XML e YAML
public class ConversorDados {

    // Método que gera JSON
    public String gerarJson(List<Campo> campos) {

        StringBuilder json = new StringBuilder();

        json.append("{\n");

        for (int i = 0; i < campos.size(); i++) {

            Campo campo = campos.get(i);

            json.append("  \"")
                .append(campo.getNome())
                .append("\": ")
                .append(formatarValorJson(campo));

            // Adiciona vírgula entre os campos, menos no último
            if (i < campos.size() - 1) {
                json.append(",");
            }

            json.append("\n");
        }

        json.append("}");

        return json.toString();
    }

    // Método que gera XML
    public String gerarXml(List<Campo> campos) {

        StringBuilder xml = new StringBuilder();

        xml.append("<dados>\n");

        for (Campo campo : campos) {

            xml.append("  <")
               .append(campo.getNome())
               .append(">");

            xml.append(campo.getValor());

            xml.append("</")
               .append(campo.getNome())
               .append(">\n");
        }

        xml.append("</dados>");

        return xml.toString();
    }

    // Método que gera YAML
    public String gerarYaml(List<Campo> campos) {

        StringBuilder yaml = new StringBuilder();

        for (Campo campo : campos) {

            yaml.append(campo.getNome())
                .append(": ")
                .append(formatarValorYaml(campo))
                .append("\n");
        }

        return yaml.toString();
    }

    // Formata o valor para JSON respeitando o tipo
    private String formatarValorJson(Campo campo) {

        String tipo = campo.getTipo().toLowerCase();
        String valor = campo.getValor();

        switch (tipo) {

            case "texto":
            case "data":
            case "datahora":
                return "\"" + valor + "\"";

            case "inteiro":
            case "decimal":
            case "booleano":
                return valor;

            case "arraytexto":
                return formatarArrayTextoJson(valor);

            case "arrayinteiro":
            case "arraydecimal":
            case "arraybooleano":
                return formatarArrayNumericoOuBooleanoJson(valor);

            default:
                return "\"" + valor + "\"";
        }
    }

    // Formata valor para YAML
    private String formatarValorYaml(Campo campo) {

        String tipo = campo.getTipo().toLowerCase();
        String valor = campo.getValor();

        switch (tipo) {

            case "texto":
            case "data":
            case "datahora":
                return "\"" + valor + "\"";

            case "inteiro":
            case "decimal":
            case "booleano":
                return valor;

            case "arraytexto":
                return "[" + formatarArrayTextoYaml(valor) + "]";

            case "arrayinteiro":
            case "arraydecimal":
            case "arraybooleano":
                return "[" + valor + "]";

            default:
                return "\"" + valor + "\"";
        }
    }

    // Formata array de texto para JSON
    private String formatarArrayTextoJson(String valor) {

        String[] itens = valor.split(",");

        StringBuilder array = new StringBuilder();

        array.append("[");

        for (int i = 0; i < itens.length; i++) {

            array.append("\"")
                 .append(itens[i].trim())
                 .append("\"");

            if (i < itens.length - 1) {
                array.append(", ");
            }
        }

        array.append("]");

        return array.toString();
    }

    // Formata array numérico ou booleano para JSON
    private String formatarArrayNumericoOuBooleanoJson(String valor) {

        String[] itens = valor.split(",");

        StringBuilder array = new StringBuilder();

        array.append("[");

        for (int i = 0; i < itens.length; i++) {

            array.append(itens[i].trim());

            if (i < itens.length - 1) {
                array.append(", ");
            }
        }

        array.append("]");

        return array.toString();
    }

    // Formata array de texto para YAML
    private String formatarArrayTextoYaml(String valor) {

        String[] itens = valor.split(",");

        StringBuilder array = new StringBuilder();

        for (int i = 0; i < itens.length; i++) {

            array.append("\"")
                 .append(itens[i].trim())
                 .append("\"");

            if (i < itens.length - 1) {
                array.append(", ");
            }
        }

        return array.toString();
    }
}