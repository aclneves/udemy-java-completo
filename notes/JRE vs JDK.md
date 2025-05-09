# JDK vs JRE vs JVM

## JDK (Java Development Kit)

O JDK é um pacote completo de desenvolvimento que inclui:

- Todas as ferramentas necessárias para desenvolver aplicações Java
- O compilador Java (javac)
- Documentação
- Debugger
- O próprio JRE
- Outras ferramentas de desenvolvimento

É como uma caixa de ferramentas completa que um desenvolvedor precisa para criar aplicações Java. Se você vai programar
em Java, precisa do JDK instalado.

## JRE (Java Runtime Environment)

O JRE é um subconjunto do JDK que contém:

- A JVM
- As bibliotecas core do Java
- Outros arquivos de suporte

É o mínimo necessário para **executar** uma aplicação Java. Se você só precisa rodar programas Java (sem desenvolver), o
JRE é suficiente.

## JVM (Java Virtual Machine)

A JVM é o coração da plataforma Java e tem funções cruciais:

- É uma máquina virtual que executa o bytecode Java
- Fornece um ambiente de execução independente de plataforma
- Gerencia a memória automaticamente (Garbage Collection)
- Oferece segurança e isolamento do código

### Características importantes da JVM:

1. **Independência de Plataforma**: O famoso "Write Once, Run Anywhere"
    - O código Java é compilado para bytecode (.class)
    - O bytecode pode ser executado em qualquer dispositivo que tenha uma JVM

2. **Gerenciamento de Memória**:
    - Aloca memória automaticamente
    - Libera memória não utilizada
    - Previne vazamentos de memória

3. **Segurança**:
    - Verifica o bytecode antes da execução
    - Gerencia permissões de segurança
    - Isola as aplicações do sistema operacional

## Resumo da Relação:

- O JDK contém o JRE
- O JRE contém a JVM
- A JVM é o núcleo que executa o código Java

### Exemplo Prático:

- Para **desenvolver** uma aplicação Java: Precisa do JDK
- Para **executar** uma aplicação Java: Precisa apenas do JRE
- A JVM está presente em ambos os casos, pois é ela quem realmente executa o código

É como uma boneca russa:

- O JDK é a boneca maior que contém todas as outras
- O JRE é a boneca do meio
- A JVM é a menor, mas é a mais fundamental

Esta estrutura em camadas é o que torna o Java uma plataforma tão versátil e amplamente utilizada em diferentes tipos de
aplicações e sistemas.