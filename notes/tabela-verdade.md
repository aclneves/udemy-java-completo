# Tabela Verdade - Operadores Lógicos

Operadores comuns usados na lógica booleana:

- **AND** (`&&`): E lógico – verdadeiro somente se *ambos* os valores forem verdadeiros.
- **OR** (`||`): OU lógico – verdadeiro se *pelo menos um* dos valores for verdadeiro.
- **XOR** (`^`): OU exclusivo – verdadeiro se *apenas um* dos valores for verdadeiro.
- **NOT** (`!`): Negação – inverte o valor lógico.

---

## Exemplo 1: Ir ao shopping somente se...

**Condição:**  
Quero ir ao shopping, mas *só vou se tiver dinheiro **e** o tempo estiver ensolarado*.

Expressão lógica:  
`Ter dinheiro && Tempo ensolarado`

| Dinheiro | Sol | Resultado (`&&`) |
|----------|-----|------------------|
| V        | V   | V                |
| V        | F   | F                |
| F        | V   | F                |
| F        | F   | F                |

---

## Exemplo 2: Ir ao shopping se...

**Condição:**  
Quero ir ao shopping, *vou se tiver dinheiro **ou** o tempo estiver ensolarado*.

Expressão lógica:  
`Ter dinheiro || Tempo ensolarado`

| Dinheiro | Sol | Resultado (`||`) |
|----------|-----|------------------|
| V        | V   | V                |
| V        | F   | V                |
| F        | V   | V                |
| F        | F   | F                |

---

## Exemplo 3: Comprar um carro

**Condição:**  
*Vou comprar o Civic ou o Corolla, mas não os dois ao mesmo tempo.*

Expressão lógica:  
`Civic ^ Corolla`

| Civic | Corolla | Resultado (`^`) |
|--------|---------|-----------------|
| V      | V       | F               |
| V      | F       | V               |
| F      | V       | V               |
| F      | F       | F               |

---

## Exemplo 4: Negação

A negação inverte o valor lógico:

| Valor | Negação (`!`) |
|--------|----------------|
| V      | F              |
| F      | V              |

---

💡 **Dica:** Esses operadores são muito usados em programação, especialmente em linguagens como JavaScript, C, Java e outras. Entender a tabela verdade ajuda a tomar melhores decisões em código e lógica condicional.
