//: Dise�a un algoritmo que, dados dos n�meros enteros, muestre por pantalla uno
//de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor
//que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.",
//dependiendo de la verificaci�n de la condici�n correspondiente al significado de cada
//mensaje

Algoritmo Practica8
	Escribir "Inserta un n�mero"
	Leer num1
	Escribir "inserta otro n�mero"
	leer num2
	
	cuadradoDelNumero1 <- num1 * num1;
	
	si num2 = cuadradoDelNumero1 entonces
		escribir "el segundo es el cuadrado exacto del primero"
	sino 
		// estamos en el caso en el que el n�mero no es el cuadrado del primero
		si num2 < cuadradoDelNumero
			Escribir "el segundo es menor que el cuadrado del primero"
			
		SiNo
			escribir "el segundo es mayor que el cuadrado del primero"
			
		FinSi
	FinSi
	
FinAlgoritmo
