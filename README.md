## Roles

| Name             | Value  | Description | authorisation |
| ---- | ----- | ----- | ----- |
| user | 0 | disconnect user
| client | 1 | connected client
| employee | 2 | connected employee
| admin | 3 | connected admin



## API Reference

#### Get clients

```http
  GET /clients/all
```
#### Response Get clients
```http
  {
        "id": Long,
        "email": "String",
        "nom": "String",
        "prenom": "String",
        "telephone": "String",
        "adresse": {
            "id": Long,
            "rue": "String",
            "ville": "String",
            "codePostal": "String",
            "pays": "String"
        }
    }
```
#### Post client
```http
  GET /clients/create
```
#### Body Post clients
```http
  {
    "email": "client10@email.com",
    "nom": "Moreau",
    "prenom": "Julien",
    "telephone": "0625252525",
    "adresse": {
        "rue": "45 avenue Victor Hugo",
        "ville": "Marseille",
        "codePostal": "13008",
        "pays": "France"
    }
}
```
