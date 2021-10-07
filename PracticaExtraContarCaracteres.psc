//el usuario introduzca la cantidad de caracteres y se muestren esa misma cantidad de guiones
Algoritmo PracticaExtraContarCaracteres
	
	Escribir "introuzca la palabra que desea"
	leer palabra
	
	numGuiones <- Longitud(palabra)
	escribir "tu palabra es: "
	escribir palabra
	
	Para i <- 1 Hasta numGuiones Con Paso  1 Hacer
		
		escribir "_" Sin Saltar
	FinPara
	
	
FinAlgoritmo
