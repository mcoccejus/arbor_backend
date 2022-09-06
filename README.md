# ToDo

## Einleitung

Das Dokument sollte ein mögliches Grundgerüst für das Projekt bilden und sind aus meiner Interpretation der gegebenen Informationen aus Gesprächen und meinem Wissen sein. Die Auflistung entspricht einer ToDo-Liste nach dem Markdown-Cheat-Sheet. Weitere Ideen und Konkretisierung der Informationen, Umsetzungen und Hinweisen ist sehr erwünscht.

<span style="color:red"> Hinweis: Ich habe die Punkte bei Android aufgeschrieben unter der Annahme, dass wir ein Design Pattern verwenden (MVC/MVVM). </span>

## Rest API / Datenbank

- [  ] Funktionalität zum Datenaustausch
- [  ] Einheitliches Schema
    - [  ] Baumsorte
    - [  ] Datum der Pflanzung
    - [  ] Bild
    - [  ] (Optional) Zuletzt bearbeitende Person
    - [  ] Aktiver Befall?
    - [  ] Herkunft
    - [  ] Aktivität mit 128 Zeichen (?)
    - [  ] Datum der letzten Aktivtät

Die Liste ist nur eine einfache Grundlage (und meine Intepretation was man einfügen kann) und sollte keine Voraussetzung für das Projekt sein. Beim Datenaustausch sollte noch kommuniziert werden in welcher Form die Daten geschickt werden bzw. aus welcher Quelle die Bilder kommen und diese mit den Daten verknüpft werden (Ich habe einfach noch kein Plan wie man die Bilder miteinbezieht in einer REST API).

## Android

- [  ] Funktionalität
    - [  ] Anzeige der Position auf eine Google Maps
        - [  ] (Optional) Zielführung
    - [  ] Liste der Bäume im Bereich
        - [  ] (Optional) Bereiche definieren
        - [  ] (Optional) Reload bei einer aktiven Änderung
    - [  ] Datenabruf im Hintergrund bevor man am Ziel ist (Geofencing oder abfragen)
    - [  ] Speichern und Laden Daten
        - [  ] Hinzufügen von neuen Bäumen (Geotagging von den Bildern??)
        - [  ] Löschen von Bäumen
        - [  ] Einträge der Aktivitäten am Baum => 128 Zeichen lang (?)
        - [  ] Bearbeitung von Daten
        - [  ] Vergleich (Vorsicht: Kann zeitaufwändig sein je nach Detailgrad)
    - [  ] (Optional) Login
- [  ] Oberfläche
    - [  ] Startbildschirm / Karte
        - Der Startbildschirm ist entweder ein Login oder eine Ansicht einer Karte. Die Karte soll die Bereiche und Bäume markieren. Wenn ein Baum selektiert ist, sollte es evtl möglich sein es dazustellen.
    - [  ] Liste von Bäumen
        - Es gibt eine View dafür (ListView/RecyclerView/...). Zum Hinzufügen sollte ein Floating-Button in dieser View sein.
    - [  ] Detailansicht der Bäume
        - Hier sollten die vorhandenen Daten mit einem aktuellen Bild angezeigt werden. Hier sollten aber mehrere Floating-Buttons oder Optionen zur Verfügung stehen. Ein Floating-Button zum Bearbeiten und ein Floating-Button für Vergleich des Zustands.
    - [  ] Vergleichansicht der Zustände
        - Es kann relativ viel Zeit in Anspruch nehmen je nach Detailgrad und Einschränkung/Freiheit bei der Eingabe von Daten. Es sollten aber 2 Bilder und ein kleiner Text zum Vergleich zur Verfügung stehen (unter der Annahme, dass kein Blödsinn damit gemacht wird).
    - [  ] Bearbeitung der Daten
        - Hier gilt: Es müssen nicht alle Daten bearbeitet werden. Das Alter / Datum der Einpflanzung kann man aus dem angegebenen Datum und dem aktuellen Datum berechnen. Die Art muss nicht verändert werden. Hauptsächlich wird die Aktivität bzw. die Dokumentation nur bearbeitet. (Eine weitere Idee für das Projekt, wäre ein Berechtigungssystem z.B. Admin und User, um mögliche Fehlerbehebungen zu berücksichtigen => Ist kein Gegenstand des Projektes für das Studium).

## (Optional) Webanwendung

Sehr ähnliche Funktionalitäten