# Comandos Aplicados para o MongoDb

### Criando a Colection 

db.createCollection('Produtos')

### Adicionando um Produto com Preço Muito Baixo

db.Produtos.insert({nome: "mouse", fabricante:"Logitech" ,preco: 26.0, estoque: 10})

### Adicionando Produtos Normais

db.Produtos.insert({nome: "mouse", fabricante:"Logitech" ,preco: 89.99, estoque: 10})

db.Produtos.insert({nome: "webcam", fabricante:"xiaomi" ,preco: 199, estoque: 22})

db.Produtos.insert({nome: "Placa de vídeo", fabricante:"Nvidia" ,preco: 1999, estoque: 50})

### Consultando por Preço

db.getCollection('Produtos').find().sort({"preco":1})

### Agora Decrescente

db.getCollection('Produtos').find().sort({"preco":-1})

### Atualizando Valores

db.getCollection('Produtos').update({"nome": "Placa de vídeo"},{$set: {"preco":6000.00}});

### Consultando por Nome mouse e/ou Marca xiaomi

db.getCollection('Produtos').find({$or:[{"nome":"mouse"},{"fabricante": "xiaomi"}]});

### Removendo Itens

db.Produtos.remove({"preco":26.0});

### Diferentes Formas de Listar Ordenando

db.Produtos.find().sort({"nome":1});
db.Produtos.find().sort({"fabricante":1});
db.Produtos.find().sort({"preco":1});
db.Produtos.find().sort({"estoque":1});

### Ordenando com Duas Fontes de Ordenação

db.Produtos.find().sort({"nome":1},{"estoque":1});

### Buscando um Produto por um Nome e Ordenando Pelo Menor Preço

db.Produtos.find({"nome":"mouse"}).sort({"preco":1});