Algoritmo MCD
	Definir num1, num2 Como Entero
	Leer num1
	Leer num2
	Mientras num1<>num2 Hacer
		si num1>num2 Entonces
			num1<-num1-num2
		SiNo
			num2<-num2-num1
		FinSi
	FinMientras
	escribir num1
FinAlgoritmo
