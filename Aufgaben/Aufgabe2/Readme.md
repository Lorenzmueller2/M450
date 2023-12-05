# Aufgabe 2

## 1)

### Abstrakte Testfälle 
- Kaufpreis < 15000 => Kein Rabatt
- Kaufpreis = 15000 => Kein Rabatt
- Kaufpreis < 20000 => 5% Rabatt
- Kaufpreis = 20000 => 5% Rabatt
- Kaufpreis < 25000 => 7% Rabatt
- Kaufpreis = 25000 => 7% Rabatt
- Kaufpreis > 25000 => 8.5% Rabatt

### Konkrete Testfälle
- Kaufpreis = 15000 => 15000
- Kaufpreis = 20200 => 19190
- Kaufpreis = 24990 => 23740.5
- Kaufpreis = 25600 => 23808
- Kaufpreis = 30000 => 27450


## 2)
| ID | Beschreibung | Erwartetes Resultat | Effektives Result | Status | Mögliche Ursache |
|----|------------- |---------------------|-------------------|--------|------------------|
|1|Mehrsprachigkeit|Es gibt eine Auswahlmöglichkeit, um die Sprache einzustellen|Es gibt ein Sprachbutton, der aber nicht funktioniert und die Sprache nicht ändert|Fehöer|Zuweisung der Translation-IDs funktioniert nicht korrekt|
|2|Buchung eines Fahrzeugs|Der Benutzer versucht, ein Fahrzeug zu buchen, ohne ein erforderliches Feld wie das Rückgabedatum auszufüllen.|Das System sollte eine klare Fehlermeldung anzeigen die aber nicht erscheint und in der DB steht NULL.|Fehler|Zugriff auf DB funktioniert nicht.|
|3|Zahlungssystem|Am Schluss einer Autoreservierung, öffnet sich ein Zahlungsfenster, indem man zwischen verschiedenen Zahlungsarten auswählen kann|Der Kunde bezahlt, bekommt aber keine Zahlungsbestätigung|Fehler|Der Fall, erfolgreiche Zahlung wurde nicht gehandelt|
|4|Benutzeranmeldung und authentifizierung|Der User kann sich einloggen oder registrieren|Nachdem man sich einloggt kommt eine Error page mit dem Statuscode 403|Fehler|Der Zugriff auf die Passwörter ist nicht gewährleistet, sodass der Passwort check einen Fehler wirft.|
|5|Preisberechnung|Der Preis wird nach Anzahl Kilometer berechnet|Der Preis ist immer 0|Fehler|Das System hat keinen zugriff auf das Auto und kann somit den Kilometerstand nicht lesen kann|





