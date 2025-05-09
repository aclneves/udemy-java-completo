# Operadores em Java

Os operadores são símbolos especiais que realizam operações específicas em um ou mais operandos. Em Java, temos diferentes tipos de operadores que podem ser classificados de acordo com o número de operandos que manipulam.

## 1. Operadores Unários
Operadores que atuam em um único operando.

### Operadores de Incremento/Decremento
- `++a` (pré-incremento): incrementa o valor antes de usar a variável
- `a++` (pós-incremento): usa o valor atual e depois incrementa
- `--a` (pré-decremento): decrementa o valor antes de usar a variável
- `a--` (pós-decremento): usa o valor atual e depois decrementa

### Outros Operadores Unários
- `+a`: operador unário positivo
- `-a`: operador unário negativo
- `!a`: operador de negação lógica
- `~a`: operador de complemento bit a bit

## 2. Operadores Binários
Operadores que atuam em dois operandos.

### Operadores Aritméticos
- `+`: adição
- `-`: subtração
- `*`: multiplicação
- `/`: divisão
- `%`: módulo (resto da divisão)

### Operadores Relacionais
- `==`: igual a
- `!=`: diferente de
- `>`: maior que
- `<`: menor que
- `>=`: maior ou igual a
- `<=`: menor ou igual a

### Operadores Lógicos
- `&&`: E lógico (AND)
- `||`: OU lógico (OR)
- `&`: E bit a bit
- `|`: OU bit a bit
- `^`: XOR (OU exclusivo)

### Operadores de Atribuição
- `=`: atribuição simples
- `+=`: atribuição com soma
- `-=`: atribuição com subtração
- `*=`: atribuição com multiplicação
- `/=`: atribuição com divisão
- `%=`: atribuição com módulo
- `&=`: atribuição com E bit a bit
- `|=`: atribuição com OU bit a bit
- `^=`: atribuição com XOR
- `<<=`: atribuição com deslocamento à esquerda
- `>>=`: atribuição com deslocamento à direita

## 3. Operador Ternário
O único operador que trabalha com três operandos.

### Sintaxe
java int resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";


## Precedência de Operadores
A precedência determina a ordem em que os operadores são avaliados em uma expressão. Do maior para o menor:

1. Operadores unários (`++`, `--`, `!`, `~`, `+`, `-`)
2. Operadores multiplicativos (`*`, `/`, `%`)
3. Operadores aditivos (`+`, `-`)
4. Operadores de deslocamento (`<<`, `>>`, `>>>`)
5. Operadores relacionais (`<`, `>`, `<=`, `>=`, `instanceof`)
6. Operadores de igualdade (`==`, `!=`)
7. Operadores bit a bit (`&`, `^`, `|`)
8. Operadores lógicos (`&&`, `||`)
9. Operador ternário (`?:`)
10. Operadores de atribuição (`=`, `+=`, `-=`, etc.)
