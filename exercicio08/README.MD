# http://localhost:8080/cliente
## POST
> Payload
```json
{
    "nome":"nome",
    "senha":"Senha1234",
    "saldo":10
}
```

# http://localhost:8080/cliente/{nome}
> Response (200 OK)
```json
{
    "nome": "nome",
    "saldo": 30.0
}
```

# http://localhost:8080/transacoes

> Payload (201 CREATED)
```json
{
    "pagador":"nome 1",
    "recebedor":"nome 2",
    "quantidade": 10
}
```

# http://localhost:8080/transacoes
> Response (200 OK)
```json
[
    {
        "id": "979511b5-d833-4302-94d8-b0b331a5c65a",
        "recebedor": "nome 1",
        "pagador": "nome 2",
        "quantidade": 10.0
    }
]
```
