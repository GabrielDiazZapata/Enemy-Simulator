Descripción del juego

El juego permite al jugador crear un personaje y enfrentarlo a enemigos hostiles. Cada personaje tiene una cantidad de salud, fuerza y defensa, y puede equiparse con armas y armaduras para aumentar sus atributos. Los enemigos también tienen su propio conjunto de atributos y habilidades de combate.

El jugador puede elegir el arma y la armadura que llevará el personaje en cada ronda. Dependiendo de las elecciones del jugador, la fuerza y defensa del personaje se verán afectadas. El objetivo del juego es derrotar a los enemigos en combate, reduciendo su salud a cero antes de que el personaje quede sin salud.
Implementación

El juego se ha implementado utilizando el lenguaje de programación Java y orientado a objetos. Se han creado las siguientes clases y interfaces:

    Mob: Clase abstracta que representa un mob genérico con un atributo de salud y un constructor para inicializarlo.
    MobHostil: Clase abstracta que extiende de Mob e implementa la interfaz Combate. Define el comportamiento de los mobs hostiles, como atacar y recibir ataques.
    MobPacifico: Clase abstracta que extiende de Mob e implementa la interfaz Daño. Define el comportamiento de los mobs pacíficos, como recibir ataques sin contraatacar.
    Personaje: Clase que representa al personaje controlado por el jugador. Tiene atributos de salud, fuerza, defensa y métodos para atacar y recibir ataques.
    Armadura: Enumeración que define los diferentes tipos de armas disponibles para el personaje, junto con sus valores de fuerza asociados.
    Armadura: Enumeración que define los diferentes tipos de armaduras disponibles para el personaje, junto con sus valores de defensa asociados.
    Combate: Interfaz que define el método atacar() para los mobs hostiles.
    Daño: Interfaz que define el método recibirAtaque() para los mobs pacíficos.

Además, se ha creado una clase ejecutable App que gestiona la interacción con el jugador y controla el flujo del juego.