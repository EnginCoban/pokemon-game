# Pokemon Kampfsimulator

## Projektbeschreibung
Dies ist ein textbasiertes Pokemon-Kampfsimulationsprogramm in Java. Das Projekt demonstriert grundlegende objektorientierte Programmierung (OOP) in Java, einschließlich Vererbung, Polymorphie, Exception-Handling und Benutzereingaben.

In dieser Simulation erstellt der Trainer (repräsentiert durch die Klasse `Person`) seine Pokemon und startet einen Kampf, bei dem verschiedene Pokemon mit individuellen Attributen wie Gesundheit, Angriffskraft und Spezialangriffen zum Einsatz kommen. Der Benutzer steuert den Kampf interaktiv über die Konsole.


## Funktionsweise

1. **Initialisierung:**  

   Die `MainProgram`-Klasse erstellt Instanzen der Pokemon (`Bisasam`, `Glumanda`, `Shiggy`) sowie eine `Person` (Trainer).

3. **Pokemon-Zuweisung:**  

   Mittels der Methode `givePokemonToPerson` wird dem Trainer ein Pokemon zugewiesen. Wird ein falsches Pokemon ausgewählt, wird eine `WrongPokemonException` ausgelöst.

5. **Kampfsimulation:**  

   Der Kampf wird in den `fight`-Methoden der Klasse `Pokemon` simuliert. Dabei erfolgt:
   - Ein Angriff des aktiven Pokemon auf den Gegner.
   - Berechnung des Schadens (unter Berücksichtigung von Schwächen).
   - Aktualisierung der HP und, bei einem Sieg, Steigerung des Levels.
   - Der Benutzer entscheidet, ob der Kampf fortgesetzt, ein Pokemon gewechselt oder ob geflohen werden soll.

7. **Statusanzeige:**  

   Über die `Pokedex`-Klasse kann der Benutzer den aktuellen Status seines Pokemon (wie HP, Level, Attackpower etc.) abrufen.

9. **Beendigung:**  

   Das Spiel endet, wenn ein Pokemon keine HP mehr hat oder der Benutzer sich entscheidet, den Kampf zu verlassen.


## Installation und Benutzung
1. **Java JDK installieren** (falls noch nicht vorhanden)<br>
   [Download](https://www.oracle.com/th/java/technologies/downloads/)

2. **Repository klonen:**

   ```bash
   git clone https://github.com/EnginCoban/pokemon-game.git

3. **Projekt in einer IDE öffnen und ausführen.**
   




   

