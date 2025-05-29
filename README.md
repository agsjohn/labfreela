# Lab Freela
Plataforma de Gerenciamento de Serviços Freelancer

## Sobre
Uma plataforma web onde freelancers podem se cadastrar, oferecer serviços, receber propostas e gerenciar pagamentos e projetos. Já os clientes podem buscar freelancers, enviar solicitações e avaliar os serviços prestados. 

### Clean Architecture
```
com.agsjohn.labfreela
├── application      -> Casos de uso (serviços)
├── domain           -> Entidades e interfaces
├── infrastructure   -> Implementações técnicas (banco, repositórios, segurança, etc)
└── interfaces       -> Controllers (API REST)
```
