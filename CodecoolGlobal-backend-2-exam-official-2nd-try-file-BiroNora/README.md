# Szavak számolása

### Feladat leírása

Írj egy metódust, `getWordCount` néven a `WordFinder` osztályban,
ami beolvas egy fájlt, mely elérési útvonalát az osztály konstruktorban kapja, és visszatér egy `Map<String, Integer>` -rel,
melynek kulcsa a keresett szó, a hozzá tartozó érték pedig a szó előfordulása. 

A keresendő szót a `getWordCount` paraméterben kapja meg, értéke azonban csak kétféle lehet:
`race`, or `acre`. Minden más szó keresése dobjon `IllegalArgumentException`-t.

A fájlban a szavak betűnként szóközzel elválasztva vannak tárolva, tehát az alábbi sorban: ```e r a c e r c r r e e c r e``` szerepel a `race szó`.
Egy sorban a keresett szó többször is előfordulhat!

A teszteken nem módosíthattok.

#### Példák

##### Bemenet:
```java
Map<String, Integer> result = wordFinder.getWordCount("race");
System.out.println(result.get("race")); // 41
```
##### Kimenet: `41`


##### Bemenet:
```java
Map<String, Integer> result = wordFinder.getWordCount("alma");
```
##### Kimenet: `IllegalArgumentException`-t dob futás közben.


## Pontozás

Egy feladatra 0 pontot ér, ha:

- nem fordul le
- lefordul, de egy teszteset sem fut le sikeresen.
- ha a forráskód olvashatatlan, nem felel meg a konvencióknak, nem követi a clean code alapelveket.

0 pont adandó továbbá, ha:

- kielégíti a teszteseteket, de a szöveges követelményeknek nem felel meg

Pontokat a további működési funkciók megfelelősségének arányában kell adni a vizsgafeladatra:

- 5 pont: az adott projekt lefordul, néhány teszteset sikeresen lefut, és ezek funkcionálisan is helyesek. Azonban több
  teszteset nem fut le, és a kód is olvashatatlan.
- 10 pont: a projekt lefordul, a tesztesetek legtöbbje lefut, ezek funkcionálisan is helyesek, és a clean code elvek
  nagyrészt betartásra kerültek.
- 20 pont: ha a projekt lefordul, a tesztesetek lefutnak, funkcionálisan helyesek, és csak apróbb funkcionális vagy
  clean code hibák szerepelnek a megoldásban.

Gyakorlati pontozás a project feladatokhoz:

- Alap pontszám egy feladatra(max 20): lefutó egység tesztek száma / összes egység tesztek száma * 20, feltéve, hogy a
  megoldás a szövegben megfogalmazott feladatot valósítja meg
- Clean kód, programozási elvek, bevett gyakorlat, kód formázás megsértéséért - pontlevonás jár. Szintén pontlevonás
  jár, ha valaki a feladatot nem a leghatékonyabb módszerrel oldja meg - amennyiben ez értelmezhető.