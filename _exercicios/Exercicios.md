# Exercícios — Estrutura de Dados e Orientação a Objetos em Java

Projeto base: sistema de cadastro de consumidores e produtos.
Todos os exercícios devem ser feitos sobre o projeto `Produtos` já existente.

---

## Exercício 1 — Encapsulamento

As classes `Consumidor`, `Endereco` e `Produto` possuem atributos públicos ou sem modificador de acesso, o que vai contra as boas práticas de Orientação a Objetos.

**Tarefa:**
1. Altere todos os atributos das três classes para `private`
2. Crie métodos `get` e `set` para cada atributo
3. Ajuste a classe `Main` para usar os getters e setters no lugar do acesso direto aos atributos

**Exemplo esperado:**
```java
consumidor.setNome("Aline");
System.out.println(consumidor.getNome());
```

---

## Exercício 2 — Completar a classe Produto

A classe `Produto` está incompleta: não possui `toString()` e os atributos estão sem encapsulamento.

**Tarefa:**
1. Aplique encapsulamento (atributos `private` com getters e setters)
2. Implemente o método `toString()` que exiba todos os atributos formatados
3. No `Main`, crie ao menos 3 produtos com dados diferentes e imprima cada um no console

**Saída esperada (exemplo):**
```
Produto{id=1, nome='Arroz', categoria='Alimentos', valor=8.90}
Produto{id=2, nome='Feijão', categoria='Alimentos', valor=6.50}
Produto{id=3, nome='Detergente', categoria='Limpeza', valor=2.99}
```

---

## Exercício 3 — Construtores em Consumidor e Endereco

Atualmente os objetos são criados com o construtor padrão e os campos preenchidos um por um. Isso torna o código repetitivo e difícil de manter.

**Tarefa:**
1. Crie um construtor com todos os parâmetros na classe `Endereco`
2. Crie um construtor com todos os parâmetros na classe `Consumidor` (incluindo o `Endereco`)
3. Refatore o `Main` para criar os objetos usando os novos construtores

**Exemplo esperado:**
```java
Endereco endereco = new Endereco("Praca", "150", "Praca Central", "Cajuru", "Sorocaba", "15000", "Sao Paulo");
Consumidor consumidor = new Consumidor("Aline", "123456789", endereco);
```

---

## Exercício 4 — Construtor de Produto com validação

**Tarefa:**
1. Crie um construtor na classe `Produto` que receba `id`, `nome`, `categoria` e `valor`
2. Dentro do construtor, valide se o `valor` é maior que zero
3. Caso o valor seja zero ou negativo, lance uma exceção do tipo `IllegalArgumentException` com uma mensagem explicativa
4. No `Main`, teste criando um produto com valor inválido dentro de um bloco `try/catch` e exiba a mensagem de erro no console

**Exemplo esperado:**
```java
// deve lançar exceção
Produto invalido = new Produto(99, "Teste", "Geral", -5.0);

// saída esperada no catch:
// Erro: O valor do produto deve ser maior que zero.
```

---

## Exercício 5 — Classe Pedido (composição)

**Tarefa:**

Crie uma nova classe chamada `Pedido` com os seguintes requisitos:

| Atributo | Tipo |
|---|---|
| `id` | `int` |
| `consumidor` | `Consumidor` |
| `produtos` | `ArrayList<Produto>` |

Implemente os métodos:
- `adicionarProduto(Produto p)` — adiciona um produto à lista
- `calcularTotal()` — retorna a soma dos valores de todos os produtos (tipo `double`)
- `toString()` — exibe o id do pedido, o nome do consumidor e o total

---

## Exercício 6 — Montar pedidos no Main

**Tarefa:**
1. Crie 2 consumidores usando os construtores do Exercício 3
2. Crie ao menos 4 produtos usando o construtor do Exercício 4
3. Monte um pedido para cada consumidor, adicionando produtos diferentes a cada pedido
4. Imprima os dois pedidos no console, exibindo os dados e o total de cada um

**Saída esperada (exemplo):**
```
Pedido{id=1, consumidor='Aline', total=R$ 15.40}
Pedido{id=2, consumidor='Isabella', total=R$ 9.49}
```

---

## Exercício 7 — Classe Loja com lista de consumidores

**Tarefa:**

Crie uma classe chamada `Loja` com:

| Atributo | Tipo |
|---|---|
| `consumidores` | `ArrayList<Consumidor>` |

Implemente os métodos:
- `cadastrarConsumidor(Consumidor c)` — adiciona um consumidor à lista
- `listarConsumidores()` — imprime todos os consumidores cadastrados
- `buscarPorNome(String nome)` — percorre a lista e retorna o `Consumidor` cujo nome seja igual ao buscado; retorna `null` se não encontrar

No `Main`, cadastre os consumidores na `Loja`, liste todos e depois busque um pelo nome, imprimindo o resultado.

---

## Exercício 8 — Classe Estoque com HashMap

**Tarefa:**

Crie uma classe chamada `Estoque` com:

| Atributo | Tipo |
|---|---|
| `produtos` | `HashMap<Integer, Produto>` (chave = id do produto) |

Implemente os métodos:
- `adicionarProduto(Produto p)` — adiciona o produto usando o `id` como chave
- `removerProduto(int id)` — remove o produto pelo `id`
- `buscarPorId(int id)` — retorna o `Produto` correspondente ao `id` ou `null`
- `listarPorCategoria(String categoria)` — percorre o mapa e imprime todos os produtos da categoria informada

No `Main`, adicione produtos ao estoque, remova um, busque por id e liste por categoria.

---

## Exercício 9 — Herança: subclasses de Produto

**Tarefa:**

Crie duas subclasses de `Produto`:

**`ProdutoPerecivel`**
- Atributo adicional: `dataValidade` (String, ex: `"31/12/2026"`)
- Sobrescreva o `toString()` incluindo a data de validade

**`ProdutoEletronico`**
- Atributo adicional: `garantiaMeses` (int)
- Sobrescreva o `toString()` incluindo os meses de garantia

Crie construtores adequados em cada subclasse chamando o construtor da classe pai com `super(...)`.

**Exemplo esperado:**
```
ProdutoPerecivel{id=1, nome='Leite', categoria='Alimentos', valor=4.50, validade='15/08/2026'}
ProdutoEletronico{id=2, nome='Fone de Ouvido', categoria='Eletronicos', valor=89.90, garantia=12 meses}
```

---

## Exercício 10 — Polimorfismo com lista de Produto

**Tarefa:**
1. No `Main`, crie uma `ArrayList<Produto>` que contenha objetos dos tipos `Produto`, `ProdutoPerecivel` e `ProdutoEletronico` misturados
2. Itere sobre a lista com um `for-each` e imprima cada item
3. Observe que o método `toString()` correto é chamado para cada tipo automaticamente — isso é polimorfismo

**Exemplo esperado:**
```
Produto{id=3, nome='Caderno', categoria='Papelaria', valor=12.00}
ProdutoPerecivel{id=1, nome='Leite', categoria='Alimentos', valor=4.50, validade='15/08/2026'}
ProdutoEletronico{id=2, nome='Fone de Ouvido', categoria='Eletronicos', valor=89.90, garantia=12 meses}
```

---

## Resumo dos conceitos praticados

| Exercício | Conceito |
|---|---|
| 1 | Encapsulamento (`private`, getters, setters) |
| 2 | `toString()`, encapsulamento |
| 3 | Construtores com parâmetros |
| 4 | Validação, exceções (`IllegalArgumentException`) |
| 5 | Composição, `ArrayList` |
| 6 | Composição, integração entre classes |
| 7 | `ArrayList`, busca linear |
| 8 | `HashMap`, busca por chave, filtro |
| 9 | Herança, `super()`, sobrescrita de método |
| 10 | Polimorfismo |
