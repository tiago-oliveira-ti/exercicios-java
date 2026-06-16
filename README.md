# Exercícios Java

![Java](https://img.shields.io/badge/Java-21-orange)
![Build](https://github.com/tiago-oliveira-ti/exercicios-java/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/badge/license-MIT-green)

Exercícios de lógica de programação em Java desenvolvidos durante os estudos na plataforma **[DIO — Digital Innovation One](https://www.dio.me)**.

## 📁 Estrutura do projeto

```
exercicios-java/
├── src/
│   ├── ex01_tabuada/
│   │   └── Tabuada.java
│   ├── ex02_imc/
│   │   └── IMC.java
│   ├── ex03_pares_impares/
│   │   └── ParesImpares.java
│   └── ex04_divisibilidade/
│       └── Divisibilidade.java
├── bin/
├── .github/
│   └── workflows/
│       └── ci.yml
└── README.md
```

## 📋 Exercícios

| Pasta | Exercício |
|-------|-----------|
| `ex01_tabuada` | Tabuada de 1 a 10 de um número informado pelo usuário |
| `ex02_imc` | Cálculo de IMC com classificação de acordo com a OMS |
| `ex03_pares_impares` | Lista números pares ou ímpares em um intervalo, em ordem decrescente |
| `ex04_divisibilidade` | Lê números até encontrar um que não seja divisível pelo número inicial |

## 🛠️ Tecnologias

- Java (JDK 21)
- Scanner para entrada de dados via terminal
- GitHub Actions para integração contínua (CI)

## 📚 Plataforma de estudos

Exercícios desenvolvidos como parte do aprendizado em Java na **[DIO — Digital Innovation One](https://www.dio.me)**, plataforma brasileira de ensino em tecnologia.

## ▶️ Como executar

1. Compile o exercício desejado:
```bash
   javac -d bin -sourcepath src src/<pasta>/<Arquivo>.java
```
2. Execute:
```bash
   java -cp bin <pasta>.<Classe>
```

### Exemplos

**Ex01 - Tabuada**
```bash
javac -d bin -sourcepath src src/ex01_tabuada/Tabuada.java
java -cp bin ex01_tabuada.Tabuada
```

**Ex02 - IMC**
```bash
javac -d bin -sourcepath src src/ex02_imc/IMC.java
java -cp bin ex02_imc.IMC
```

**Ex03 - Pares e Ímpares**
```bash
javac -d bin -sourcepath src src/ex03_pares_impares/ParesImpares.java
java -cp bin ex03_pares_impares.ParesImpares
```

**Ex04 - Divisibilidade**
```bash
javac -d bin -sourcepath src src/ex04_divisibilidade/Divisibilidade.java
java -cp bin ex04_divisibilidade.Divisibilidade
```

> **Pré-requisito:** ter o [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21) instalado na máquina.

## 👨‍💻 Autor

Tiago Oliveira  
[LinkedIn](https://linkedin.com/in/tiago-oliveira-tech) • [GitHub](https://github.com/tiago-oliveira-ti)