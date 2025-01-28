# Patrons de Disseny en Java 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte explora diversos patrons de disseny en Java a través d'exercicis pràctics dividits en tres nivells. L'objectiu és comprendre com implementar patrons per crear programari extensible i reutilitzable.

### Nivell 1 ⭐
#### Exercici 1: Singleton
Implementació d'una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe es basarà en el patró de disseny Singleton.

- **Funcionalitat**:
  - Guardar les últimes comandes introduïdes.
  - Afegir, eliminar i llistar comandes (semblant a la comanda 'history' en Linux).
  - Garantir que només hi hagi una instància de la classe 'Undo' durant tota l'execució.

- **Requisits**:
  - Crear un projecte amb una classe `Main` que permeti introduir opcions per consola.
  - Utilitzar el patró Singleton per a la implementació de la classe `Undo`.

---

### Nivell 2 ⭐⭐
#### Exercici 1: Abstract Factory
Construcció d'un petit gestor per gestionar adreces i números de telèfon internacionals utilitzant el patró de disseny Abstract Factory.

- **Funcionalitat**:
  - Permetre afegir adreces i números de telèfon internacionals amb diferents formats segons el país.
  - Utilitzar fàbriques abstractes per crear instàncies d'adreces i telèfons.

- **Requisits**:
  - Crear una aplicació amb una agenda que suporti múltiples formats d'adreces i números de telèfon.
  - Implementar el patró Abstract Factory per gestionar aquestes variacions.

---

### Nivell 3 ⭐⭐⭐
#### Exercici 1: Command
Disseny d'un sistema per controlar diferents vehicles utilitzant el patró de disseny Command.

- **Funcionalitat**:
  - Gestió de 4 vehicles: cotxe, bicicleta, avió i vaixell.
  - Implementació de comandes per als mètodes arrencar, accelerar i frenar.
  - Mostrar com s'executen aquestes comandes per a cada vehicle.

- **Requisits**:
  - Crear un projecte amb una classe `Main` que demostri l'ús del patró Command.
  - Assegurar-se que cada vehicle té una implementació pròpia per a les comandes.

---

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/3.1-Patterns1.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
