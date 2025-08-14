# Projeto de Estudo: Java I/O

Este projeto é uma coleção de exemplos práticos desenvolvidos para explorar os recursos de entrada e saída (I/O) do pacote `java.io`. O foco é demonstrar como ler e escrever dados de diversas fontes, manipular arquivos e serializar objetos.

## 📜 Descrição

O código aborda desde as operações mais básicas, como a leitura de arquivos de texto, até conceitos mais avançados, como a serialização de objetos para persistência de dados. Cada classe de teste é um exemplo autocontido que ilustra uma funcionalidade específica do Java I/O, tornando o projeto um excelente material de estudo para quem deseja aprofundar seus conhecimentos no assunto.

## ✨ Conceitos Abordados

* **Leitura de Arquivos:** Uso de `FileInputStream`, `InputStreamReader` e `BufferedReader` para ler dados de arquivos de texto linha por linha.
* **Escrita em Arquivos:** Demonstração de `FileOutputStream`, `OutputStreamWriter` e `BufferedWriter` para escrever dados em arquivos.
* **Manipulação de Encodings:** Testes com diferentes charsets (`UTF-8`, `UTF-16`, `US-ASCII`) para entender como o Java lida com a codificação de caracteres.
* **Parsing de Dados:** Utilização da classe `Scanner` para ler e processar dados de um arquivo CSV, convertendo os valores para os tipos de dados corretos.
* **Serialização de Objetos:** Exemplo de como transformar um objeto (`Client`) em um fluxo de bytes para ser salvo em um arquivo (`.bin`) e, posteriormente, desserializá-lo de volta para um objeto.
* **Entrada e Saída Padrão:** Demonstração de como ler da entrada padrão do sistema (`System.in`) e escrever na saída padrão.

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Java I/O API**

## 🚀 Como Executar e Explorar

O projeto é composto por várias classes de teste, cada uma com um método `main` para demonstrar uma funcionalidade específica. Para entender os conceitos, compile e execute as seguintes classes:

* **`testInputStream.java`**: Demonstra a leitura de um arquivo de texto.
* **`testFileWriter.java`**: Mostra como escrever em um arquivo de texto.
* **`testEncoding.java`**: Ilustra a diferença entre os principais encodings de caracteres.
* **`test03.java`**: Demonstra como ler e processar um arquivo CSV.
* **`testSerializationClass.java`**: Mostra o processo de serialização e desserialização de um objeto.
* **`testCopyFile.java`**: Demonstra como ler da entrada padrão e escrever em um arquivo.