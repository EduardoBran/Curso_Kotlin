/*
Para organizar bem o projeto e evitar erros de importação,
pense nestes passos como “construir uma pirâmide do mais básico ao mais complexo”:

1.Enumerações e utilitários (utils)
- Por quê? Antes de “popular” os objetos de Ship (entity), é preciso saber quais tipos de navio existem.
- Passo: Crie a pasta utils e, dentro, o arquivo:
  - ShipType.kt (com enum class ShipType { CARGO, BATTLESHIP, PIRATE })

-> Motivo didático: É natural que Ship precise de ShipType; portanto, você define o enum antes de
                    instanciar qualquer objeto Ship.

2. Entidades (entity)
- Por quê? São as classes que representam os dados fundamentais (Ship e Travel). Todas as outras camadas vão precisar delas.
- Passo: Crie primeiro a pasta entity e dentro dela:
  - Ship.kt (com data class Ship(...))
  - Travel.kt (com data class Travel(...))

-> Motivo didático: Assim você garante que, quando precisar usar Ship ou Travel em arquivos posteriores, eles já existem.

3. Fábrica de dados (data)
- Por quê? DataStorage vai criar listas de Ship e Travel, então ele depende de entity.Ship, entity.Travel e de utils.ShipType.
- Passo: Crie a pasta data e, dentro, o arquivo:
  - DataStorage.kt (com métodos generateShips() e generateTravels())

-> Motivo didático: Ao chegar em DataStorage.kt, todas as classes e enums que ele referencia já estão disponíveis,
                    evitando erros de compilação.

4. Arquivo de entrada principal (Main.kt)
- Por quê? É aqui que você vai simular o uso geral: chamar DataStorage para buscar dados e, depois, chamar TravelAnalysis.
- Passo: Crie Main.kt na raiz do projeto, contendo apenas:

-> Motivo didático: Mesmo que TravelAnalysis.kt ainda não exista, é útil ter o “esqueleto” de Main. Caso falte TravelAnalysis,
                 basta comentar temporariamente essa parte para compilar sem erros.

5. Regras de negócio (business)
- Por quê? TravelAnalysis faz cálculos usando listas de Ship e Travel. Ele precisa “ver” todos os itens anteriores (entidades + DataStorage).
- Passo: Crie a pasta business e, dentro, o arquivo:
  - TravelAnalysis.kt (com a assinatura de classe e métodos sem implementação)

-> Motivo didático: Somente agora todas as dependências de TravelAnalysis já estão disponíveis (entidades, enum e DataStorage).
 Você pode importar entity.Ship, entity.Travel e começar a implementar cada função.

 */