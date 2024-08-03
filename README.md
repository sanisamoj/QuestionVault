# Question Vault
Este projeto tem como objetivo armazenar perguntas frequentes relacionadas a um determinado serviço ou sistema. 
Ele surgiu da necessidade de centralizar todas as informações em um único local, permitindo também obter insights por meio da análise de cliques e feedbacks.

## Fucionalidades do Sistema

- Criar tópicos, perguntas e respostas.
- Definir preferências visuais de FAQ como template, cores e logo.
- Gerenciamento de FAQ, como edição e análise de quantidades clicks e feedbacks.
- Gerenciamento Admin da aplicação.
- Notificações sobre FAQs.

## Tecnologias e Ferramentas Utilizadas

- Backend: **Ktor (Kotlin)**
- Banco de Dados:
    - **MongoDB** - Para armazenamento de dados sensíveis.
    - **Redis** - Para armazenamento de dados que precisam de acesso mais rápido.

## Testes Utilizados

- Testes unitários na maior parte das funções dos Serviços, e nas rotas.