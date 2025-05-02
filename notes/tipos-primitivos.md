# Tipos Primitivos em Java

Em Java, existem 8 tipos primitivos fundamentais:

## Tipos Inteiros

Os tipos inteiros representam números inteiros (sem parte decimal). Java oferece quatro tipos de inteiros com diferentes tamanhos e faixas de valores:

* **`byte`**:
    * Tamanho: 1 byte (8 bits)
    * Faixa de valores: -128 até 127

* **`short`**:
    * Tamanho: 2 bytes (16 bits)
    * Faixa de valores: -32.768 até 32.767

* **`int`**:
    * Tamanho: 4 bytes (32 bits)
    * Faixa de valores: -2.147.483.648 até 2.147.483.647
    * **Observação:** Literais inteiros em código Java são interpretados como tipo `int` por padrão.

* **`long`**:
    * Tamanho: 8 bytes (64 bits)
    * Faixa de valores: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
    * **Observação:** Para que um literal inteiro seja interpretado como `long`, é necessário adicionar o sufixo `L` ou `l` (preferencialmente `L` para evitar confusão com o número 1). Exemplo: `10L`.

## Tipos de Ponto Flutuante

Os tipos de ponto flutuante representam números com casas decimais (números reais). Java oferece dois tipos:

* **`float`**:
    * Tamanho: 4 bytes (32 bits)
    * Precisão: Aproximadamente 7 dígitos decimais significativos.
    * **Observação:** Para que um literal de ponto flutuante seja interpretado como `float`, é necessário adicionar o sufixo `F` ou `f`. Exemplo: `3.14f`.

* **`double`**:
    * Tamanho: 8 bytes (64 bits)
    * Precisão: Aproximadamente 15 dígitos decimais significativos.
    * **Observação:** Literais de ponto flutuante em código Java são interpretados como tipo `double` por padrão. O sufixo `D` ou `d` é opcional. Exemplo: `3.14` ou `3.14d`.

## Outros Tipos Primitivos

* **`char`**:
    * Tamanho: 2 bytes (16 bits)
    * Representa um único caractere Unicode. Literais `char` são delimitados por aspas simples (`' '`). Exemplo: `'A'`, `'9'`, `'ç'`.

* **`boolean`**:
    * Tamanho: Dependente da JVM (Virtual Machine), mas conceitualmente representa um valor de verdade.
    * Possui apenas dois valores possíveis: `true` (verdadeiro) ou `false` (falso).

## Observação Importante sobre Bytes e Bits

* **1 byte = 8 bits**. Um bit (binary digit) é a menor unidade de informação em um sistema digital, podendo ter o valor 0 ou 1. Os bytes são agrupamentos de bits usados para representar dados de forma mais prática.

