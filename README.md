## Author 
Ivan Panas RDIR51

## Task
UlesanneDBJava
Tudengite registreerimine kursustele

Kolledzis toimuvad erinevad kursused erinevatel erialadel, nendel võivad  osaleda kõik tudengid (näiteks Keeled:inglise keel, vene keel, soome keel ....; Programmeerimine: programmeerimise alused, veebiprogrammeerimine...; Õkonoomika: ökonoomika alused, äriplaani loomine....)

Loo andmebaas (H2 database - 10 punkti), kus asub  info kursustest ja tudengitest, kes kursustele olid registreerunud.

Loo Veebirakendus

Põhilehel kuva kursuse kood ja nimetus (10 punkti)
Kasutaja võib kursust valida ja vaadata teiselt lehelt  kursuse täisinformatsiooni ja registreeritud tudengite nimekirja (10 punkti)
Tudeng võib registreeruda kursusele (10 punkti)
Tudeng võib oma registreerimise andmeid muuta ja kustutada (5 punkti)
Admin redigeerib kõik andmed (kursuste ja tudengite info) (5 punkti)
Hindamise ajal hinnatakse ka kasutajaliidest ja andmete validatsioon.


## To run, just clone it then..

    .\mvnw spring-boot:run

## Features:

* User Registration
* User Admin when ROLE_ADMIN
* Admins can login as other users using "Login As" link in the user editor.
* Admin can edit course info
* User can edit one info
* Admin can edit user's registration for the course

## Used github project

    https://github.com/ddalcu/spring-starter  
