Algoritmo practicas1516
	
	definir cantidadnumeros, cantidadmayores Como Entero
	definir almacen Como Entero
	cantidadnumeros = 10
	dimension almacen[cantidadnumeros]
	Cantidadmayores=3
	definir mayores, i Como Entero
	Dimension mayores[Cantidadmayores] 
	mayores[0]=almacen[0]
	mayores[1]=almacen[1]
	mayores[2]=almacen[2]
	//vamos a obtener la posición del mínimo del array de mayores
	definir posMin, j como entero
	posMin=0
	
	para j=Cantidadmayores Hasta cantidadnumeros - 1 con paso 1 Hacer
		para i<-0 hasta Cantidadmayores - 1 con paso 1 hacer
			si mayores[posMin] > mayores[i] Entonces
				posMin=i
			FinSi
			
		FinPara
	FinPara
	
	para i <- 0 hasta Cantidadmayores - 1 con paso 1 Hacer
		si mayores[posMin] > mayores[i] Entonces
			posMin=i
		FinSi
	FinPara
	
	//el valor que tenemos en posMin es la posición del número más pequeño del array de mayores
	
	si almacen[3] > mayores[posMin] Entonces
		mayores[posMin]=almacen[3]
		posMin=i
	FinSi
	
	
FinAlgoritmo
