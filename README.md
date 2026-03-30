# api-flowable-labs

Aplicação Spring Boot de estudo para exploração do **Flowable Process Engine**, um motor de BPM (Business Process Management) para automação de fluxos de trabalho.

## Tecnologias

- Java 21
- Spring Boot 3.4.4
- Spring Web (MVC + Tomcat embarcado)
- Flowable 7.0.0
- H2 Database (in-memory)
- Maven

## Como executar

```bash
./mvnw spring-boot:run
```

A aplicação sobe na porta `8080` por padrão.

## Endpoints

### Iniciar um processo

```
POST /process
```

Inicia uma nova instância do processo `oneTaskProcess`. Não requer body.

**Exemplo:**
```bash
curl -X POST http://localhost:8080/process
```

---

### Listar tarefas por responsável

```
GET /tasks?assignee={assignee}
```

Retorna as tarefas abertas atribuídas ao usuário informado.

**Parâmetros:**
| Parâmetro  | Tipo   | Descrição                        |
|------------|--------|----------------------------------|
| `assignee` | String | Nome do usuário (ex: `kermit`)   |

**Exemplo:**
```bash
curl http://localhost:8080/tasks?assignee=kermit
```

**Resposta:**
```json
[
  {
    "id": "abc123",
    "name": "my task"
  }
]
```

## Processos BPMN

Os arquivos de definição de processo ficam em `src/main/resources/processes/` e são implantados automaticamente pelo Flowable no startup.

| Arquivo                      | Process Key      | Descrição                        |
|------------------------------|------------------|----------------------------------|
| `one-task-process.bpmn20.xml`| `oneTaskProcess` | Processo simples com uma user task atribuída ao usuário `kermit` |
