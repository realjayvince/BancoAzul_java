**Contexto**

O **Banco Azul** é uma instituição financeira tradicional que está passando por uma modernização completa de seus sistemas internos. Para a primeira etapa da transformação digital, o banco quer criar um sistema básico que simule operações bancárias fundamentais, utilizando **Java** no backend.

Você foi contratado(a) como desenvolvedor(a) fullstack para entregar a **versão 1.0** desse sistema.


### 🎯 Objetivo do Projeto – Banco Azul V1.0

Implemente um sistema bancário básico com **3 funcionalidades principais**:

1. **Depósito**
2. **Saque**
3. **Extrato**


### 🧩 Requisitos Técnicos

1. ### ✅ Operação de Depósito

- Deve aceitar apenas valores **positivos**.
- Todos os depósitos devem ser **armazenados** em memória.
- O sistema considera apenas **um único usuário** (sem necessidade de autenticação ou identificação de conta).
- Os depósitos devem aparecer no extrato.

2.  ### ✅ Operação de Saque

- Permitir **no máximo 3 saques diários**.
- Cada saque pode ter o valor **máximo de R$ 500,00**.
- O sistema deve bloquear saques se o usuário não tiver saldo suficiente, exibindo mensagem:
    
    `Saldo insuficiente para saque.`
    
- Os saques devem ser armazenados e aparecer no extrato.


3. ### ✅ Operação de Extrato

- Listar todas as **movimentações** (depósitos e saques) feitas.
- No final da listagem, mostrar o **saldo atual**.
- Formatar os valores no padrão brasileiro:
    
    Ex: `R$ 1500.45`
    
- Se não houver movimentações, mostrar:
    
    `Não foram realizadas movimentações.`


4. ### 🖥️ Requisitos Técnicos de Implementação

- Use **Java.**
- Os dados podem ser armazenados **em memória** (não é necessário banco de dados).