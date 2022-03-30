Algoritmo Ejercicio1
	Definir i Como Entero
	Escribir "¿Qué altura tiene usted (en centímetros)?"
	leer i
	Si i < 1 Entonces
		Escribir "eso es imposible"
	FinSi
	si i>=1 y i<=30 Entonces
		Escribir "es usted extremadamente bajo"
	FinSi
	si i>=31 y i<=149 Entonces
		Escribir "es usted más bajo que la media"
	FinSi
	si i>=150 y i<=189 Entonces
		Escribir "tiene usted una altura próxima a la media"
	FinSi
	si i>=190 y i<=209 Entonces
		Escribir "es usted más alto que la media"
	FinSi
	si i>=210 Entonces
		Escribir "debería usted plantearse jugar a baloncesto"
	FinSi
FinAlgoritmo
