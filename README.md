# 🏭 BE Leandro Fabricações

Bem-vindo ao repositório backend da **Leandro Fabricações**! Este projeto contém toda a infraestrutura e lógica de negócio para gerenciar operações de uma empresa de fabricação moderna.

## 🎯 Objetivo

Fornecer uma solução robusta e escalável para gerenciar processos de fabricação, pedidos, inventário e relacionamento com clientes.

## 🛠️ Tecnologias Utilizadas

- **Backend**: Node.js / Express (ou conforme configurado)
- **Banco de Dados**: PostgreSQL / MongoDB (conforme implementação)
- **Autenticação**: JWT
- **Deploy**: Docker / Kubernetes

## 📁 Estrutura do Projeto

```
.
├── src/
│   ├── controllers/     # 🎮 Controladores de rotas
│   ├── services/        # 🔧 Lógica de negócio
│   ├── models/          # 📊 Modelos de dados
│   ├── routes/          # 🛣️ Definição de rotas
│   ├── middleware/      # 🚪 Middlewares personalizados
│   └── utils/           # 🛠️ Funções utilitárias
├── tests/               # ✅ Testes unitários e integração
├── config/              # ⚙️ Configurações da aplicação
└── docs/                # 📚 Documentação
```

## 🚀 Como Começar

### Pré-requisitos

- Node.js v16+ instalado
- npm ou yarn
- Banco de dados configurado

### Instalação

1. **Clone o repositório:**
```bash
git clone https://github.com/leandroFilipy/BE-leandro-fabricacoes.git
cd BE-leandro-fabricacoes
```

2. **Instale as dependências:**
```bash
npm install
```

3. **Configure variáveis de ambiente:**
```bash
cp .env.example .env
```

4. **Inicie o servidor:**
```bash
npm start
```

## 📝 Variáveis de Ambiente

Configure no arquivo `.env`:

```env
PORT=3000
NODE_ENV=development
DATABASE_URL=postgresql://user:password@localhost:5432/leandro-fab
JWT_SECRET=sua_chave_secreta_aqui
```

## 🔌 API Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/health` | ✅ Verificar status da API |
| GET | `/api/products` | 📦 Listar produtos |
| POST | `/api/orders` | 📋 Criar novo pedido |
| PUT | `/api/orders/:id` | ✏️ Atualizar pedido |
| DELETE | `/api/orders/:id` | 🗑️ Deletar pedido |

## ✅ Testes

Execute os testes com:

```bash
npm test
```

Para testes com cobertura:

```bash
npm run test:coverage
```

## 🐳 Docker

Para rodar a aplicação em container:

```bash
docker build -t leandro-fab-api .
docker run -p 3000:3000 leandro-fab-api
```

## 📚 Documentação

Para mais informações, consulte a [documentação completa](./docs) do projeto.

## 🤝 Contribuindo

1. 🍴 Faça um fork do projeto
2. 🌱 Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push para a branch (`git push origin feature/AmazingFeature`)
5. 📬 Abra um Pull Request

## 📋 Código de Conduta

Por favor, leia nosso [Código de Conduta](./CODE_OF_CONDUCT.md) para entender os padrões de comportamento esperados.

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

## 👤 Autor

**Leandro Fabricações**
- 📧 Email: contato@leandrofabricacoes.com.br
- 🔗 Website: [www.leandrofabricacoes.com.br](https://www.leandrofabricacoes.com.br)

## 🙏 Agradecimentos

Agradecemos a todos os contribuidores e membros da equipe pelo apoio e dedicação! 🎉

---

⭐ Se este projeto foi útil, considere deixar uma estrela!
