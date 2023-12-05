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
- Kaufpreis = 15000 => 0%
- Kaufpreis = 20200 => 19190
- Kaufpreis = 24990 => Kein Rabatt
- Kaufpreis = 25600 => Kein Rabatt
- Kaufpreis = 30000 => Kein Rabatt