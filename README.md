# Atividade_Backend
# Cadastro de Cliente — Refatoração

## Sobre

Refatoração de um endpoint de cadastro de clientes em Spring Boot. O código original concentrava tudo no Controller (validação, regra de negócio, estado inicial e persistência). O objetivo foi separar essas responsabilidades sem alterar o comportamento do endpoint.

Agora, com os DTOs, passamos as informações entre as camadas de forma mais organizada, e a camada de Serviço cuida das regras de negócio e validações. Isso deixa o código mais seguro, garantindo que os dados cheguem corretos, além de facilitar a manutenção."
