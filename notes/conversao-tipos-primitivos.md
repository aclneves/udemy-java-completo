# Conversão de Tipos em Java

Em Java, a conversão de tipos (type casting) permite transformar valores de um tipo primitivo em outro. Existem dois tipos principais de conversões:

- **Conversão Implícita (Widening)**: realizada automaticamente, sem perda de dados.
- **Conversão Explícita (Narrowing)**: requer casting, pois pode haver perda de dados.

---

## Conversão Implícita (Widening)

A conversão implícita ocorre quando um valor de um tipo menor é atribuído a uma variável de um tipo maior. Isso é seguro e não há perda de informações.

### Ordem das conversões implícitas:

```java
byte → short → int → long → float → double
