# Plantilla projecte Java amb Maven DAM2-MP06 #

## Arrencada ràpida ##
Execució ràpida dels diferents exemples i resolusions de problemes

## Windows ##
```bash
.\run.ps1 cat.iesesteveterradas.Main
```

## Linux ##
```bash
run.sh  cat.iesesteveterradas.Main
```

## Compilació i funcionament ##

### Execució senzilla ###

#### Windows ####
```bash
.\run.ps1 <cat.iesesteveterradas.PR210Honor>
```
#### Linux ####
```bash
run.sh <cat.iesesteveterradas.PR210Honor>
```

### Execució pas a pas ###

Si prefereixes executar el projecte pas a pas, pots seguir les següents instruccions:

Neteja el projecte per eliminar fitxers anteriors:
```bash
mvn clean
```

Compila el projecte:
```bash
mvn compile test
```

Executa la classe principal:
```bash
mvn exec:java -q -Dexec.mainClass="<cat.iesesteveterradas.PR210Honor>"
```
