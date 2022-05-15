# API Playas México

En México contamos con 11,122km de longitud de costa, en el cual algunos 
organismos del Estado Mexicano realizan pruebas para medir la contaminación 
en las playas, esta información se difunde en imágenes o archivos PDF en los 
sitios oficiales de gobierno, y es utilizado en su mayoría por medios de 
comunicación y algunos turistas para considerar antes de realizar algún viaje.

Esta API tiene la intención de ser una fuente de información que permita a diferentes
sectores de la sociedad obtener la información de una manera más digerible.

Se cuenta con un padrón de 387 playas ubicadas 76 municipios de 19 entidades de la república.

Estos son las rutas que están disponibles para ser consumidas:

### Playas
https://apiplayasmx.herokuapp.com/playas

En esta ruta se devuelve un JSON  con la siguiente estructura: 

```json
    [
        { 
            "id": 1, 
            "nombrePlaya": "Playta de Rosarito", 
            "latitud":32.33555556,
            "longitud":-117.0577778
        },
        ...
    ]
```

### Municipios y estados
* https://apiplayasmx.herokuapp.com/municipios
* https://apiplayasmx.herokuapp.com/estados

La idea de estos endpoints es la de devolver las playas que se encuentran en esos lugares.

### Clasificación
https://apiplayasmx.herokuapp.com/clasificaciones

Es la calificación o evaluación obtenida por COFEPRIS o SEMARNAT, y que está publicada en diferentes sitios de gobierno.

```json
  [
    {
      "id":1, 
      "nombreClasificacion":"APTA",
      "npm":150,
      "fechaActualizada":"2022-03-17",
      "idPlaya":{ 
        "id":1,
        "nombrePlaya":"Playa de Rosarito",
        "latitud":32.33555556,
        "longitud":-117.0577778
      }
    },
   ...
 ]
```

