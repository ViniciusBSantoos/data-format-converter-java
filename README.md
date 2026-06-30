# 🔄 Data Format Converter Java

Projeto desenvolvido em **Java** para receber dados informados pelo usuário no terminal e convertê-los para os formatos **JSON**, **XML** e **YAML**.

O sistema recebe entradas no padrão:

```text
NOME_CAMPO;VALOR;TIPO
```

Após o usuário finalizar as entradas, o programa retorna todos os campos informados nos três formatos: JSON, XML e YAML.

Este projeto foi desenvolvido com foco na prática de **Programação Orientada a Objetos (POO)**, manipulação de Strings, listas e geração de formatos estruturados de dados.

---

## 🚀 Funcionalidades

- ✅ Receber múltiplas entradas do usuário;
- ✅ Interpretar campos no formato `NOME_CAMPO;VALOR;TIPO`;
- ✅ Validar tipos de dados aceitos;
- ✅ Armazenar os campos informados;
- ✅ Gerar saída em JSON;
- ✅ Gerar saída em XML;
- ✅ Gerar saída em YAML;
- ✅ Trabalhar com textos, números, booleanos, datas e arrays;
- ✅ Interface simples via terminal.

---

## 📋 Tipos aceitos

O sistema aceita os seguintes tipos de dados:

```text
texto
data
datahora
inteiro
decimal
booleano
arrayTexto
arrayInteiro
arrayDecimal
arrayBooleano
```

---

## 💻 Exemplos de entrada

```text
nome;Lucas;texto
idade;25;inteiro
altura;1.75;decimal
ativo;true;booleano
dataNascimento;2000-05-10;data
hobbies;futebol,musica,jogos;arrayTexto
fim
```

O usuário deve digitar `fim` para encerrar a entrada de dados e gerar os formatos.

---

## 📤 Exemplo de saída em JSON

```json
{
  "nome": "Lucas",
  "idade": 25,
  "altura": 1.75,
  "ativo": true,
  "dataNascimento": "2000-05-10",
  "hobbies": ["futebol", "musica", "jogos"]
}
```

---

## 📤 Exemplo de saída em XML

```xml
<dados>
  <nome>Lucas</nome>
  <idade>25</idade>
  <altura>1.75</altura>
  <ativo>true</ativo>
  <dataNascimento>2000-05-10</dataNascimento>
  <hobbies>futebol,musica,jogos</hobbies>
</dados>
```

---

## 📤 Exemplo de saída em YAML

```yaml
nome: "Lucas"
idade: 25
altura: 1.75
ativo: true
dataNascimento: "2000-05-10"
hobbies: ["futebol", "musica", "jogos"]
```

---

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Scanner
- ArrayList
- List
- String
- StringBuilder
- Estruturas condicionais
- Estruturas de repetição

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram aplicados os seguintes conceitos:

- Leitura de dados com `Scanner`;
- Manipulação de Strings;
- Método `split()`;
- Método `trim()`;
- Uso de `ArrayList`;
- Uso de `List`;
- Criação de classes;
- Criação de objetos;
- Encapsulamento;
- Métodos getters;
- Validação de tipos;
- Estruturas condicionais;
- Estruturas de repetição;
- Uso de `StringBuilder`;
- Conversão de dados para JSON;
- Conversão de dados para XML;
- Conversão de dados para YAML;
- Separação de responsabilidades entre classes.

---

## 📂 Estrutura do projeto

```text
data-format-converter-java/
│
├── src/
│   ├── Main.java
│   ├── Campo.java
│   └── ConversorDados.java
│
└── README.md
```

---

## 📌 Responsabilidade das classes

### Main.java

Responsável por:

- Exibir as instruções no terminal;
- Receber os dados digitados pelo usuário;
- Validar se a entrada possui o formato correto;
- Verificar se o tipo informado é aceito;
- Criar os objetos da classe `Campo`;
- Armazenar os campos em uma lista;
- Chamar a classe `ConversorDados`;
- Exibir os resultados em JSON, XML e YAML.

---

### Campo.java

Responsável por representar cada campo informado pelo usuário.

Cada objeto `Campo` possui:

- Nome do campo;
- Valor do campo;
- Tipo do campo.

Exemplo:

```text
nome;Lucas;texto
```

Esse dado é transformado em um objeto com:

```text
nome = nome
valor = Lucas
tipo = texto
```

---

### ConversorDados.java

Responsável por converter a lista de campos para:

- JSON;
- XML;
- YAML.

Essa classe concentra a lógica de formatação dos dados.

---

## ▶️ Como executar

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/data-format-converter-java.git
```

2. Acesse a pasta do projeto:

```bash
cd data-format-converter-java
```

3. Acesse a pasta `src`:

```bash
cd src
```

4. Compile os arquivos Java:

```bash
javac *.java
```

5. Execute o programa:

```bash
java Main
```

---

## 🧪 Exemplo completo de uso

Entrada:

```text
nome;Lucas;texto
idade;25;inteiro
altura;1.75;decimal
ativo;true;booleano
hobbies;futebol,musica,jogos;arrayTexto
fim
```

Saída:

```text
========== JSON ==========
{
  "nome": "Lucas",
  "idade": 25,
  "altura": 1.75,
  "ativo": true,
  "hobbies": ["futebol", "musica", "jogos"]
}

========== XML ==========
<dados>
  <nome>Lucas</nome>
  <idade>25</idade>
  <altura>1.75</altura>
  <ativo>true</ativo>
  <hobbies>futebol,musica,jogos</hobbies>
</dados>

========== YAML ==========
nome: "Lucas"
idade: 25
altura: 1.75
ativo: true
hobbies: ["futebol", "musica", "jogos"]
```

---

## 🎯 Melhorias futuras

- Validar se valores inteiros realmente são números inteiros;
- Validar se valores decimais realmente são números com ponto flutuante;
- Validar formato de datas;
- Validar formato de data e hora;
- Gerar XML com atributos de tipo;
- Criar suporte para objetos internos;
- Criar suporte para arrays de objetos;
- Implementar tratamento de exceções;
- Criar testes unitários com JUnit;
- Transformar o projeto em uma API com Spring Boot.

---

## 👨‍💻 Autor

**Vinicius Batista Santos**

Projeto desenvolvido para praticar Java, Programação Orientada a Objetos, manipulação de dados e geração de formatos estruturados, contribuindo para a construção do meu portfólio como desenvolvedor Java.
