RESPOSTAS DA PARTE 7-
1. O método "exibirDados()" está implementado novamente em todas as subclasses?
Não. O método "exibirDados()" está implementado apenas uma vez, na classe Pessoa. Nenhuma das subclasses (Aluno, Professor ou FuncionarioAdministrativo) o redefine.

2. Por que os três objetos conseguem executá-lo?
Porque as três subclasses usam herança (extends Pessoa). Ao herdar, elas recebem automaticamente todos os atributos e métodos públicos da classe-mãe.

Como "exibirDados()" é público em Pessoa, ele fica disponível para Aluno, Professor e FuncionarioAdministrativo — mesmo sem ser declarado novamente.

O método não é copiado para cada subclasse. Ele é herdado e chamado diretamente pelo objeto filho.
