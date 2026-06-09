<h1 align="center">SmartInfra</h1>

<p align="center">
  <a href="#projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#integrantes">Integrantes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#funcionalidades">Funcionalidades</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#conceitos-aplicados">Conceitos Aplicados</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#estrutura-do-projeto">Estrutura</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#diagrama-uml">Diagrama UML</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#documentação">Documentação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#como-executar">Como Executar</a>
</p>

---

## Projeto

Sistema em Java para gerenciamento de cúpulas agrícolas espaciais, alinhado ao **ODS 9 - Indústria, Inovação e Infraestrutura**.

A aplicação permite cadastrar cúpulas, gerar dados randomizados de sensores, exibir relatório ambiental, verificar alertas e salvar os dados em `domes.json`.

---

## Integrantes

| Nome | RM |
|---|---|
| [Augusto Valerio](https://github.com/Augusto-Valerio) | 562185 |
| [Jonas Esteves França](https://github.com/JonasEstevess) | 564143 |
| [Mariana Silva Oliveira](https://github.com/Marirsil) | 564241 |
| [Pedro Marchese](https://github.com/PedroMarchese01) | 563339 |
| [Vitor Rodrigues Tigre](https://github.com/VitorTigre) | 561746 |

---

## Funcionalidades

<details>
<summary>Ver funcionalidades</summary>

- Cadastro de cúpulas agrícolas.
- Listagem de cúpulas cadastradas.
- Geração de dados randomizados de sensores.
- Relatório ambiental com médias dos sensores.
- Verificação de alertas.
- Persistência em arquivo JSON.

</details>

---

## Conceitos Aplicados

<details>
<summary>Ver conceitos de Java</summary>

- Classe abstrata: `Dome`.
- Interface: `Cultivable`.
- Herança: `TreeDome` e `VegetableDome`.
- Sobrescrita: método `getCultivo()`.
- Sobrecarga: métodos `createDome()` em `DomeService`.
- Encapsulamento com atributos privados, getters e setters.
- Organização em pacotes.

</details>

---

## Estrutura do Projeto

<details>
<summary>Ver estrutura</summary>

```txt
src
├── controllers
│   ├── ApplicationController.java
│   └── ConsoleMenu.java
├── data
│   └── domes.json
├── interfaces
│   └── Cultivable.java
├── models
│   ├── dome
│   │   ├── Dome.java
│   │   ├── TreeDome.java
│   │   └── VegetableDome.java
│   └── sensor
│       └── SensorData.java
├── repositories
│   ├── DomeRepository.java
│   └── SensorRepository.java
├── services
│   ├── alerts
│   │   ├── AlertService.java
│   │   └── AlertVerifier.java
│   ├── DomeService.java
│   ├── ReportService.java
│   └── SensorService.java
├── utilities
│   ├── Menu.java
│   ├── SensorDataGenerator.java
│   └── UserInput.java
└── Main.java
```

</details>

---

## Diagrama UML

[Diagrama UML](https://miro.com/app/board/uXjVHIOt8fE=/?focusWidget=3458764671247434225)

---

## Documentação

[Documento Explicativo - SmartInfra](https://drive.google.com/file/d/1IYA95R01x1RvYTW9_Ep12SrPAHSzvLME/view?usp=sharing)

---

## Vídeo Demonstrativo

[Assistir vídeo demonstrativo](https://youtu.be/n4SGdu6Wpus)

---

## Como Executar

<details>
<summary>Executar pelo IntelliJ IDEA</summary>

1. Abra o projeto no IntelliJ IDEA.
2. Acesse o arquivo `Main.java`.
3. Execute o método `main`.
4. Use o menu no console.

</details>

<details>
<summary>Executar pelo terminal</summary>

Compile o projeto:

```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
```

Execute:

```bash
java -cp out Main
```

</details>