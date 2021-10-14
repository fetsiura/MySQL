## Zadanie 6

W pliku `Main6.java` napisz zapytania SQL (dla bazy danych `cinemas_ex`). Zapytania mają zwracać następujące wyniki:  

1. liczbę wszystkich biletów,
2. liczbę wszystkich płatności, grupując je po kolumnie `type`,
3. średnią cenę biletu,
4. pięć ostatnich płatności, zaczynając od drugiej,
5. listę wszystkich płatności (pogrupowanych po kolumnie `type`), których liczba będzie większa niż 2,
6. sumę ilości `SUM(quantity)` wszystkich biletów, których cena jest większa niż 23,15.



## Zadanie 2

W pliku `Main02.java` napisz zapytania SQL (dla bazy danych ```cinemas_ex```), które pobiorą:

1. wszystkie filmy na literę **W**,  
2. wszystkie bilety, których cena jest większa niż **15.30**,  
3. wszystkie bilety, których liczba jest większa niż **3**,  
4. wszystkie filmy, które mają `rating` większy niż **6.5**,  
5. film z największą wartością `rating` (wykorzystaj `ORDER BY` oraz `LIMIT`).



## Zadanie 8

Praca na bazie `cinemas_ex`.  

W pliku `Main03.java` napisz następujące zapytania do bazy:

1. zmieniające adres na `Stadion Narodowy` dla kin, których nazwa kończy się na **z**, 
2. usuwające płatności, których data jest starsza niż **4** dni od aktualnego czasu (z dokładnością do sekundy),
Wybierz i wykorzystaj w tym celu odpowiednie funkcje MySQL. Zestawienie dostępnych funkcji: [Date and Time Functions][mysqlDate]
3. zmieniające rating filmu na `5.4` dla filmów, których opis jest dłuższy niż **40** znaków – poszukaj funkcji `MySQL`, która sprawdza liczbę znaków,
4. zmniejszające cenę biletu o **50%**, jeśli ich liczba jest większa niż **10**, zapisz je jako pojedyncze zapytanie `SQL`.

[mysqlDate]:https://dev.mysql.com/doc/refman/8.0/en/string-functions.html
