#Testlevels
##Aufgabe 2
Gängingste Methoden
Test Annotationen

@Test: Markiert eine Methode als Testfall.
```
@Test
public void testAddition() {
assertEquals(4, Calculator.add(2, 2));
}
```
@Before: Markiert eine Methode, die vor jedem Testfall ausgeführt wird.
```
@Before
public void setUp() {
// Initialisierungen vor jedem Test
}
```
Assertions

Assertions werden verwendet, um sicherzustellen, dass bestimmte Bedingungen erfüllt sind. Zum Beispiel:

assertEquals(expected, actual): Vergleicht erwarteten und tatsächlichen Wert.
```
assertEquals(5, calculator.add(2, 3));
```
assertTrue(condition): Stellt sicher, dass die Bedingung wahr ist.
```
assertTrue(result > 0);
```
Test Suites

JUnit ermöglicht das Erstellen von Test-Suites, die eine Gruppe von Tests zusammenfassen. Dies erleichtert die Ausführung mehrerer Tests gleichzeitig.
```
@RunWith(Suite.class)
@SuiteClasses({TestClass1.class, TestClass2.class})
public class TestSuite {}
```
Parameterized Tests

Ermöglicht das Schreiben von Tests, die mit verschiedenen Parametern mehrmals ausgeführt werden.

@ParameterizedTest
@ValueSource(ints = {1, 2, 3})
public void testMultiply(int value) {
assertEquals(value * 2, calculator.multiply(value, 2));
}

Timeouts

Setzt Zeitlimits für Testausführungen, um Endlos-Schleifen oder Blockaden zu verhindern.

@Test(timeout = 100)
public void testMethod() {
// ...
}

Referenz

https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations
##Aufgabe 3
Klassenliste

    Bank
    Account
    SalaryAccount extends Account
    SavingsAccount extends Account
    PromoYouthSavingsAccount extends SavingsAccount
    Booking

Klassen-Util-Listen

    AccountBalanceComparator
    AccountInverseBalanceComparator
    BankUtils

Verbindungen

    Bank besitzt Accounts (SalaryAccount, SavingsAccount, PromoYouthSavingsAccount)
    Bank benutzt BankUtils für Formatierungen
    Ein Account besitzt Bookings
    AccountInverseBalanceComparator und AccountBalanceComparator werden zum Sortieren gebraucht in der Bank
