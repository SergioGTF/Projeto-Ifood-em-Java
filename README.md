# Projeto Ifood em Java utilizando Swing 

## Objetivo do Projeto
O objetivo deste projeto é desenvolver um sistema de pedidos de restaurante, permitindo a prática de conceitos de **Programação Orientada a Objetos** (POO) como herança, polimorfismo e interfaces, além de aplicar conhecimentos em **interfaces gráficas** usando Java (Swing ou FX). Este projeto pode ser desenvolvido em equipes de até **3 alunos** e deve ser hospedado em um repositório no GitHub.

## Descrição do Sistema
O sistema será dividido em duas áreas principais, uma para o **Dono do Restaurante** e outra para o **Cliente**, cada uma com funcionalidades específicas.

### Funcionalidades para o Dono do Restaurante:
- **Cadastro do Restaurante**: Inserção de nome e endereço do restaurante.
- **Cadastro de Produtos**:
  - Inserir nome, descrição, preço e tempo de preparo.
  - Tipos de produtos:
    - **Comida**: Inclui tipo de cozinha (ex.: italiana, japonesa) e opção vegetariana/vegana.
    - **Bebida**: Inclui tamanho (ml) e indicação de bebida alcoólica/não alcoólica.
- **Gerenciamento de Produtos**: Modificar e remover produtos.
- **Salvar Alterações**: Registrar todas as modificações.

### Funcionalidades para o Cliente:
- **Visualização de Restaurantes**: Ver lista de restaurantes cadastrados.
- **Seleção de Restaurante e Produtos**: Escolher restaurante e produtos.
- **Cálculo de Preço Total e Tempo de Espera**: Exibição do total do pedido e tempo estimado.
- **Finalização do Pedido**: Encerramento do pedido.

## Avaliação
A avaliação do projeto se baseia em cinco competências de **Programação Orientada a Objetos**:

1. **Aplicação de Classes e Objetos (Encapsulamento e Construtores)**
   - **Insuficiente**: Estrutura desorganizada, sem encapsulamento e construtores corretos.
   - **Regular**: Estrutura básica, encapsulamento parcial e construtores limitados.
   - **Bom**: Estrutura organizada, encapsulamento respeitado e construtores adequados.
   - **Excelente**: Estrutura clara, encapsulamento rigoroso e construtores flexíveis.

2. **Utilização de Herança**
   - **Insuficiente**: Implementação ausente ou incorreta.
   - **Regular**: Herança presente, mas com problemas de hierarquia.
   - **Bom**: Herança bem aplicada, hierarquia lógica.
   - **Excelente**: Herança aplicada com estrutura limpa e sem duplicação de código.

3. **Utilização de Polimorfismo**
   - **Insuficiente**: Ausente ou mal implementado.
   - **Regular**: Presente, mas limitado e ineficiente.
   - **Bom**: Implementação adequada e flexível.
   - **Excelente**: Implementação precisa, com alta flexibilidade e sem verificações condicionais.

4. **Utilização de Interface**
   - **Insuficiente**: Interfaces ausentes ou mal implementadas.
   - **Regular**: Implementação limitada com inconsistências.
   - **Bom**: Aplicação adequada e coesa.
   - **Excelente**: Aplicação exemplar com uniformidade e modularidade.

5. **Clareza, Organização e Legibilidade do Código**
   - **Insuficiente**: Código desorganizado e confuso.
   - **Regular**: Código básico com inconsistências.
   - **Bom**: Código bem organizado e legível.
   - **Excelente**: Código de alta legibilidade com comentários estratégicos.

## Passo a Passo do Fluxo do Usuário

### Dono do Restaurante:
1. **Login/Cadastro**: Acesso inicial.
2. **Cadastrar Restaurante**.
3. **Cadastrar Produtos**.
4. **Gerenciar Produtos**.
5. **Salvar Alterações**.

### Cliente:
1. **Login/Cadastro**: Acesso inicial.
2. **Ver Restaurantes**.
3. **Selecionar Restaurante e Produtos**.
4. **Exibir Total e Tempo de Espera**.
5. **Finalizar Pedido**.

## Diagrama UML
O projeto deve incluir um diagrama UML com as classes e suas interações:

### Classes principais:
- **Restaurante**, **Produto**, **Pedido**, **Usuario**, **Cliente**, **DonoRestaurante**.
- **Comida** (derivada de Produto)
- **Bebida** (derivada de Produto)

### Relações:
- **Herança**: `Cliente` e `DonoRestaurante` herdam de `Usuario`; `Comida` e `Bebida` herdam de `Produto`.
- **Composição e Agregação**: `Restaurante` possui uma lista de `Produto`; `Pedido` contém uma lista de `Produto` e referencia `Cliente`.
- **Interfaces**: Utilizadas para operações específicas de gerenciamento.

## Funcionalidades Adicionais para Pontuação Extra
- **Banco de dados**
- **Geolocalização**
- **Tratamento de exceção**
- **Testes Unitários**
- **Outras APIs do Java**

---
Desenvolver este projeto ajudará a aprofundar os conceitos de POO e a prática no desenvolvimento de sistemas Java.
