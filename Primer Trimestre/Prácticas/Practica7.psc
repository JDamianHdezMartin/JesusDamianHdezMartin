// Dise�a un algoritmo que, dado un n�mero entero, determine si �ste es el doble
// de un n�mero impar
Algoritmo Practica7
	Escribir 'introducir n�mero entero'
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
		Escribir 'el n�mero no es el doble de un numero par'
	FinSi
FinAlgoritmo
