Algoritmo Ejercicio1
	Definir i Como Entero
	Escribir "�Qu� altura tiene usted (en cent�metros)?"
	leer i
	Si i < 1 Entonces
		Escribir "eso es imposible"
	FinSi
	si i>=1 y i<=30 Entonces
		Escribir "es usted extremadamente bajo"
	FinSi
	si i>=31 y i<=149 Entonces
		Escribir "es usted m�s bajo que la media"
	FinSi
	si i>=150 y i<=189 Entonces
		Escribir "tiene usted una altura pr�xima a la media"
	FinSi
	si i>=190 y i<=209 Entonces
		Escribir "es usted m�s alto que la media"
	FinSi
	si i>=210 Entonces
		Escribir "deber�a usted plantearse jugar a baloncesto"
	FinSi
FinAlgoritmo
