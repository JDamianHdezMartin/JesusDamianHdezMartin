//: Diseña un algoritmo que, dados dos números enteros, muestre por pantalla uno
//de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor
//que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.",
//dependiendo de la verificación de la condición correspondiente al significado de cada
//mensaje

Algoritmo Practica8
	Escribir "Inserta un número"
	Leer num1
	Escribir "inserta otro número"
	leer num2
	
	cuadradoDelNumero1 <- num1 * num1;
	
	si num2 = cuadradoDelNumero1 entonces
		escribir "el segundo es el cuadrado exacto del primero"
	sino 
		// estamos en el caso en el que el número no es el cuadrado del primero
		si num2 < cuadradoDelNumero
			Escribir "el segundo es menor que el cuadrado del primero"
			
		SiNo
			escribir "el segundo es mayor que el cuadrado del primero"
			
		FinSi
	FinSi
	
FinAlgoritmo
