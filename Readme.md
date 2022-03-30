This is a short practice exercise form my Java bootcamp @neuefische, I attended to from March to June 2022. These were the instructions (German only):

Erstelle eine abstrakte Klasse Contact mit dem Attribut:

    Name des Kontakts

und der Methode:

    getName()

Erstelle eine abstrakte Klasse Contact mit dem Attribut:

    Name des Kontakts

und der Methode:

    getName()

Erstelle ein Interface Radio mit den Funktionen:

    startRadio()
    stopRadio()

Erstelle ein Interface GPS mit der Funktion:

    getPosition()



Erstelle eine Klasse Smartphone die beide Interfaces implementiert und folgende Attributen hat:

    Name des Modells
    Name des Herstellers
    Array mit allen Kontakten

implementiere die Methoden:

    startRadio gibt den String "Radio started" aus und gibt true zurück
    stopRadio gibt den String "Radio stopped" aus und false zurück
    getPosition() gibt den Standort "Köln" zurück.
    default Konstruktor und einen Konstruktor mit allen Werten.
    Getter/Setter für alle Attribute.
    toString die den Namen des Modells und Herstellers und eine Liste mit allen Kontaken zurück gibt.


Bonus I
Novice:

    Erstelle eine Klasse BuisnessContact die auch von der Klasse Contact erbt.
        Sie soll zusätzlich das Attribute companyName haben.
        Erstelle getter/setter und passe die toString() an.

Intermediate

    addContact(Contact contact) die einen neuen Kontakt in deine Kontakt Liste aufnimmt.
    getContact(int index) gibt den Kontakt an Stelle des indexes zurück.
    
 
Bonus II
Expert

    getContactByName(String name) gibt den ersten Kontakt mit diesem Namen zurück.
    removeContactByName(String name) entfernt den ersten Kontak mit diesem Namen aus der Kontakt Liste.




