// Diseña un algoritmo que, dado un número entero, determine si éste es el doble
// de un número impar
Algoritmo Practica7
	Escribir 'introducir número entero'
	Leer numeroOriginal
	mitad <- numeroOriginal/2
	Si numeroOriginal MOD 2=0 Entonces
		Escribir 'el original es el doble de otro numero'
		Escribir 'lo es del numero: ',mitad
		Si mitad MOD 2=0 Entonces
			Escribir 'es par'
		SiNo
			Escribir 'es impar'
		FinSi
	SiNo
		Escribir 'numero original es impar'
		Escribir 'el número no es el doble de un numero par'
	FinSi
FinAlgoritmo
