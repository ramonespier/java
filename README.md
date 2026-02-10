# ☕ Fundamentos de Java e POO

Este repositório contém exemplos práticos de Programação Orientada a Objetos (POO) em Java, cobrindo desde a criação de classes simples até conceitos avançados como polimorfismo e interfaces.

## 🚀 Conceitos de POO Aplicados

Abaixo estão os pilares e conceitos demonstrados nos arquivos deste projeto:

### 1. Classes e Objetos
*   **Classe:** É o "molde" para criar objetos. Exemplo: `Pajero`, `Humano`.
*   **Objeto:** É a instância real da classe. No arquivo `Main.java`, `meuCarro` é um objeto da classe `Pajero`.

### 2. Atributos e Métodos
*   **Atributos:** São as características (variáveis). Ex: `idade` em `SerVivo`, `velocidadeAtual` em `Pajero`.
*   **Métodos:** São as ações que a classe executa. Ex: `acelerar()`, `respirar()`.

### 3. Construtores
*   Utilizados para inicializar o objeto com valores específicos no momento da criação.
*   No código: `public Humano() { super(20); }` define que todo humano criado já começa com idade 20.

### 4. Modificadores de Acesso
Controlam a visibilidade dos membros da classe:
*   `public`: Acessível de qualquer lugar.
*   `protected`: Acessível por classes no mesmo pacote ou por subclasses. (Ex: `idade` em `SerVivo`).
*   `private`: Acessível apenas dentro da própria classe.
*   `default` (padrão): Acessível apenas dentro do mesmo pacote.

### 5. Herança (`extends`)
*   Permite que uma classe herde características e comportamentos de outra.
*   **Exemplo:** `Humano` estende `SerVivo`, herdando o atributo `idade` e o método `dormir()`.

### 6. Classes Abstratas
*   Classes que não podem ser instanciadas diretamente (você não pode dar um `new SerVivo()`).
*   Serve como um modelo para outras classes. Contém métodos abstratos que **devem** ser implementados pelas filhas.

### 7. Interfaces (`implements`)
*   Funciona como um "contrato". Qualquer classe que assinar o contrato (implementar a interface) deve obrigatoriamente fornecer o corpo para os métodos definidos.
*   **Exemplo:** A interface `Carro` obriga a classe `Pajero` a ter os métodos `acelerar`, `freiar` e `parar`.

### 8. Polimorfismo
*   É a capacidade de um objeto ser referenciado de várias formas.
*   **No código:** `Carro meuCarro = new Pajero();`. Note que o tipo da variável é a Interface (`Carro`), mas o objeto real é uma `Pajero`. Isso permite trocar a implementação sem mudar o código que a usa.

---

## 📁 Estrutura de Arquivos

| Arquivo | Papel no Projeto | Conceito Chave |
| :--- | :--- | :--- |
| `Carro.java` | Interface | Contrato / Abstração |
| `SerVivo.java` | Classe Abstrata | Herança / Base |
| `Humano.java` | Subclasse | Especialização / Sobrescrita |
| `Pajero.java` | Classe Concreta | Implementação de Interface |
| `Main.java` | Classe Principal | Execução e Polimorfismo |

---

## 🛠️ Exemplo de Execução

No método `main`, vemos a interação entre os objetos:

```java
public static void main(String[] args) {
    Carro meuCarro = new Pajero(); // Polimorfismo
    SerVivo meuSer = new Humano(); // Polimorfismo

    meuSer.respirar(); // Executa o método sobrescrito em Humano
    meuCarro.acelerar(); // Executa a lógica de aceleração da Pajero
}
```

---
*Estudos dirigidos à linguagem Java e boas práticas de POO.*