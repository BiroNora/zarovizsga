# Prím szorzás minimummal
Minden osztályodat a `hu.nive.ujratervezes.prime` package-ben kell létrehozni.

A `Main` osztály `main` metódusában próbálhatod ki a kódodat, illetve használd
az előre megírt teszt eseteket az algoritmusod kipróbálására!

## Feladat során használt fogalmak meghatározása:
- Tömb minimum eleme: tömb elemei közül a legkisebb értékű.
- Természetes számok: 0 és a pozitív egész számok tehát 0,1,2,3,4,5,6,7,stb
- Prím számok: azok a természetes számok amiknek pontosan két osztója van 1 és saját maga. tehát 2, 3, 5, 7, 11, 13, 17,stb

## Feladatleírás
Implementáld az alábbi leírás szerinti programot:

### hu.nive.ujratervezes.prime.PrimeCalculator
publikus metódusai:
- `public int min(int[] inputArr)` Ez a tömb minimum elemét kiszámító metódus amit majd felhasználhatsz a 'multiplyPrimesWithMinimum' implementálásakor. A metódus működése:
  - ha `inputArr` paraméterben `null`-t kap akkor `IllegalArgumentException`-t dob.
  - ha `inputArr` paraméterben üres tömböt kap akkor  `IllegalArgumentException`-t dob.
  - Egyéb esetben visszaadja a paraméterként kapott tömb legkisebb értékű elemét. pl ha `inputArr` elemei 5, 0, 1, 6 akkor 0-val tér vissza.
- `public boolean isPrime(int num)` Ez a metodus képes ellenőrizni, hogy egy szám prím szám-e. Ezt a metodust is felhasználhatod a  'multiplyPrimesWithMinimum' implementálásakor. Működése:
  - Ha a paraméterben kapott szám prím szám akkor `true`-val tér vissza.
  - Ha a paraméterben kapott szám nem prím szám akkor `false`-al tér vissza.
- `public int[] multiplyPrimesWithMinimum(int[] inputArr)` A paraméterként egy természetes számokat tartalmazó int tömböt kap. Visszaad egy a paraméterben kapott array-el egyező méretű új tömböt. Erre az új tömbre innentől `out[]` tömbként fogok hivatkozni a feladat-leírásban. A metódus működése:
  - ha `inputArr` paraméterben `null`-t kap akkor `IllegalArgumentException`-t dob.
  - ha `inputArr` paraméterben üres tömböt kap akkor üres tömbbel tér vissza.
  - egyéb esetben az új tömb elemeit amivel visszatér, a következő módon kell meghatározni:
    - ha `inputArr[i]` nem prím, akkor `out[i]` legyen egyenlő `inputArr[i]`
    - ha `inputArr[i]` prím, akkor  `out[i]`  legyen egyenlő  `min(input) * input[i]`


## Példák

| `inputArr`             | Eredmény                   |
|------------------------|:---------------------------|
| `[ 2, 5, 0, 13, 4]`    | `[0, 0, 0, 0, 4]`          |
| `[ 2, 5, 8, 13, 4, 6]` | `[4, 10, 8, 26, 4, 6]`     |
| `[]`                   | `[]`                       |
| `null`                 | `IllegalArgumentException` |


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
- Clean kód, programozási elvek, bevett gyakorlat, kód formázás megsértéséért - pontlevonás jár. Szintén
  pontlevonás jár, ha valaki a feladatot nem a leghatékonyabb módszerrel oldja meg - amennyiben ez értelmezhető.