# ☕ Fundamentos de Java: POO & Collections

Este repositório é um guia prático de estudos sobre Java, cobrindo desde os pilares da **Programação Orientada a Objetos (POO)** até a manipulação de dados com o **Collections Framework**.

## 🚀 Conceitos de POO Aplicados

### 1. Classes e Objetos
*   **Classe:** O molde (Ex: `Pajero`, `Humano`).
*   **Objeto:** A instância real do molde (Ex: `meuCarro`, `meuSer`).

### 2. Atributos e Métodos
*   **Atributos:** Variáveis que definem o estado (Ex: `velocidadeAtual`).
*   **Métodos:** Funções que definem o comportamento (Ex: `acelerar()`).

### 3. Construtores e `super()`
*   Usados para inicializar o objeto. O comando `super()` chama o construtor da classe pai (Base). No exemplo, `Humano` define a `idade` na classe `SerVivo`.

### 4. Modificadores de Acesso
*   `public`: Acessível de qualquer lugar.
*   `protected`: Acessível no mesmo pacote ou por herança.
*   `private`: Restrito à própria classe.
*   `default`: Restrito ao pacote.

### 5. Herança (`extends`) e Classes Abstratas
*   `SerVivo` é uma **classe abstrata**: ela fornece uma base (`dormir`), mas obriga as filhas a definirem como devem `respirar`.
*   `Humano` herda de `SerVivo`, aproveitando o que já existe e especializando o comportamento.

### 6. Interfaces (`implements`) e Polimorfismo
*   `Carro` é uma **Interface**: um contrato que garante que qualquer carro tenha os métodos de acelerar, frear e parar.
*   **Polimorfismo:** Permite tratar um objeto `Pajero` como um `Carro` genérico, facilitando a troca de implementações no futuro.

---

## 📦 Generics & Collections Framework

O Java utiliza **Generics** (os símbolos `< >`) para garantir a segurança de tipos, evitando que você coloque, por exemplo, um número em uma lista que deveria aceitar apenas textos.

### Principais Interfaces de Coleções:

#### 🔹 List (Lista)
*   **Características:** Ordenada e **permite elementos duplicados**.
*   **Exemplo:** `ArrayList<String>`. Se você adicionar "Cereja" duas vezes, ela aparecerá duas vezes.

#### 🔹 Set (Conjunto)
*   **Características:** **Não permite duplicatas**. Ótimo para garantir unicidade.
*   **Exemplo:** `HashSet<String>`. Se tentar adicionar "Cereja" duas vezes, o conjunto ignorará a segunda entrada.

#### 🔹 Map (Mapa / Dicionário)
*   **Características:** Estrutura de **Chave e Valor** (semelhante ao Objeto em JS ou Dicionário em Python).
*   **Exemplo:** `HashMap<String, String>`. Você mapeia uma chave (ex: "nome") para um valor (ex: "Ramon").

#### 🔹 Queue (Fila)
*   **Características:** Segue a regra do "Primeiro a entrar, primeiro a sair" (FIFO).
*   **Principais Métodos:**
    *   `poll()`: Retorna e remove o primeiro da fila (retorna `null` se vazia).
    *   `peek()`: Apenas "espia" o primeiro da fila, sem remover.
    *   `remove()`: Semelhante ao poll, mas lança uma **exceção** se a fila estiver vazia.

---

## 📁 Estrutura de Arquivos

| Pacote | Arquivo | Conceito Chave |
| :--- | :--- | :--- |
| `java_pack` | `Carro.java` | Interface (Contrato) |
| `java_pack` | `SerVivo.java` | Abstração e Herança |
| `java_pack` | `Humano.java` | Sobrescrita de métodos (`@Override`) |
| `java_pack` | `Pajero.java` | Implementação lógica |
| `java_pack` | `Main.java` | Execução POO e Polimorfismo |
| `java_collections` | `Generics.java` | List, Set, Map, Queue e Generics |

---

## 🛠️ Como executar
1. Certifique-se de ter o JDK instalado.
2. Compile os arquivos: `javac -d . *.java`
3. Execute a classe principal de POO: `java java_pack.Main`
4. Execute os exemplos de Collections: `java java_collections.Generics`

---
*Estudos focados em robustez de código e organização de dados em Java.*