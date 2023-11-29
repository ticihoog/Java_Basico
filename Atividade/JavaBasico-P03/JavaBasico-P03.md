# Java Básico
Módulo II
## Atividade - P03
 Ticiana H. S. Paternostro

### 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

Uma exceção em Java é um evento anormal que ocorre durante a execução de um programa, alterando o fluxo de instruções. Elas são usadas para trabalhar com situações excepcionais ou erros que podem ocorrer durante a execução do programa, como por exemplo: Divisões por zero, acesso a índices inválidos em arrays, entre outros. O propósito das exceções é fornecer uma maneira estruturada de trabalhar com erros e facilitar a sua detecção, tratamento e recuperação dentro desses tipos de situações.

### 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma:

- **Exceções Verificadas:** São exceções que o compilador exige que o programador lide explicitamente. Geralmente, derivam da classe Exception (excluindo RuntimeException e suas subclasses). Exemplos incluem IOException, SQLException, etc.

```java

try {
    // Código que pode lançar uma exceção verificada
} catch (IOException e) {
    // Tratamento da exceção
}

```

- **Exceções Não Verificadas:** São exceções que o compilador não exige que o programador lide explicitamente. Geralmente, derivam de RuntimeException ou suas subclasses. Exemplos incluem ArithmeticException, NullPointerException, etc.

``` JAVA

// Não é obrigatório lidar explicitamente com exceções não verificadas
int result = 10 / 0;  // Isso lançará ArithmeticException

```

### 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

As principais palavras-chave para lidar com exceções em Java são: **try, catch, throw, throws, e finally.**

-   try-catch: Utilizado para envolver um bloco de código que pode lançar uma exceção, e para capturar e tratar essa exceção.
-   throw: Utilizado para lançar explicitamente uma exceção.
-   throws: Indica que um método pode lançar uma exceção e deve ser especificado na assinatura do método.
-   finally: Bloco opcional que é executado independentemente de uma exceção ser lançada ou não.

### 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

O bloco try-catch é usado para envolver um trecho de código onde uma exceção pode acontecer. O bloco try contém o código suscetível a lançar uma exceção, enquanto o bloco catch contém o código para lidar com a exceção se ou quando ela ocorrer. É importante usar try-catch ao lidar com exceções para garantir que o programa possa se recuperar após situações excepcionais, mantendo uma execução controlada e evitando a interrupção abrupta do programa.