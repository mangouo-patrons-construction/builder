# Patron Builder (Monteur)

Auteur : Mangouo Jacky Victoire — INF461 / INF4067, Devoir 1 : Patrons de construction

- `src/builder/cours` : exemple du cours (pizza reine et pizza piquante)
- `src/builder/modifie` : exemple modifie (pizza vegetarienne + etape de cuisson + methode construire(monteur))

## Compilation et execution
```
mkdir out
javac -d out $(find src -name "*.java")
java -cp out builder.cours.Client
java -cp out builder.modifie.Client
```

## Diagrammes
Diagrammes de classes realises avec Dia (sources `.dia` et `.png` dans `diagrammes/`).
