# Dio-Java
*Repositório para armazenar o conteúdo do curso **JAVA SSPRING AI***
-----

## Informações de Contato

- **LinkedIn:** [Bruno Carvalho](https://www.linkedin.com/in/bruno-carvalho-dev)
- **GitHub:** [brunocarvalho-dev](https://github.com/brunocarvalho-dev)
- **Email:** brunocarvalho.devsenai@gmail.com

-----
# Programação Orientada a Objetos em Java
---

## Índice
1. [Introdução](#introdução)
2. [Herança](#herança)
3. [Polimorfismo](#polimorfismo)
4. [Abstração](#abstração)
5. [Interfaces](#interfaces)
6. [Conclusão](#conclusão)

---

## Introdução

A Programação Orientada a Objetos (POO) é um paradigma de programação que utiliza "objetos" - instâncias de classes - para representar dados e métodos. Java é uma linguagem amplamente utilizada para POO devido à sua robustez, segurança e portabilidade.

Este documento oferece uma visão geral dos principais pilares da POO em Java: Herança, Polimorfismo, Abstração e Interfaces.

## [Pilares da Programação Orientada a Objetos](com/dio-java-orientacao-objetos)

### 1. [Herança](com\dio-java-orientacao-objetos\ExemploPoo\ExemploPooAbstracaoPolimorfismo)

Herança é o mecanismo pelo qual uma classe pode herdar características (atributos e métodos) de outra classe. A classe que herda é chamada de subclasse (ou classe derivada), enquanto a classe de onde se herda é chamada de superclasse (ou classe base).

#### Exemplo:

```java
// Superclasse
public class Animal {
    protected String nome;

    public void dormir() {
        System.out.println(nome + " está dormindo");
    }
}

// Subclasse
public class Cachorro extends Animal {

    public void latir() {
        System.out.println(nome + " está latindo");
    }
}
```

### 2. [Polimorfismo](com\dio-java-orientacao-objetos\ExemploPoo\ExemploPooAbstracaoPolimorfismo)

Polimorfismo permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Existem dois tipos principais de polimorfismo: polimorfismo de sobrecarga e polimorfismo de sobrescrita.

#### [Sobrecarga](com/dio-java-basico/operadores/Operadores-Java/src/Calculadora.java)

A sobrecarga ocorre quando duas ou mais funções em uma classe têm o mesmo nome, mas parâmetros diferentes.

```java
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
```

#### [Sobrescrita:](com/dio-java-basico/operadores/Operadores-Java/src/Calculadora.java)

A sobrescrita ocorre quando uma subclasse fornece uma implementação específica de um método que já está definido na sua superclasse.

```java
public class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
```

### 3. [Abstração](com\dio-java-orientacao-objetos\ExemploPoo\ExemploPooAbstracaoPolimorfismo)

Abstração é o processo de ocultar detalhes complexos de implementação e mostrar apenas as funcionalidades essenciais. Em Java, a abstração é alcançada usando classes abstratas e interfaces.

#### [Classe Abstrata:](com/dio-java-orientacao-objetos/ExemploPoo/ExemploPooAbstracaoPolimorfismo/Apps/AplicativoMenssagem.java)

Uma classe abstrata não pode ser instanciada e pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação).

```java
public abstract class Forma {
    protected String cor;

    public abstract double calcularArea();
}
```

### 4. [Interfaces](com/dio-java-orientacao-objetos/ExemploPoo/ExemploPooInterface)

Interfaces são contratos que definem métodos que uma classe deve implementar. Diferente de classes abstratas, uma interface não pode conter nenhum código de implementação, apenas a assinatura dos métodos.

#### Exemplo:

```java
public interface Animal {
    void comer();
    void dormir();
}

public class Cachorro implements Animal {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo");
    }
}
```

## Conclusão

A Programação Orientada a Objetos em Java é um paradigma poderoso que permite a criação de programas modulares, reutilizáveis e de fácil manutenção. Os principais pilares - Herança, Polimorfismo, Abstração e Interfaces - fornecem as bases para o design de software robusto e flexível. Ao compreender e aplicar esses conceitos, os programadores podem desenvolver soluções eficientes e escaláveis para problemas complexos.

---

## Informações de Contato

- **LinkedIn:** [Bruno Carvalho](https://www.linkedin.com/in/bruno-carvalho-dev)
- **GitHub:** [brunocarvalho-dev](https://github.com/brunocarvalho-dev)
- **Email:** brunocarvalho.devsenai@gmail.com
---
