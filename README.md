## API Reference

#### Get clients

```http
  GET /clients/all
```
#### Response clients
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
