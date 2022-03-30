//Al principio consultar al usuario cuántas notas va a introducir
//al finalizar la entrada de datos debe mostrar un texto "la media de 10,8,9,8,10 es: "
Algoritmo PracticaMediaDeNotasArray
	
	Escribir "¿cuántas notas quieres introducir?";
	Definir i Como Entero;
	Definir cantidadNotas Como Entero;
	Leer cantidadNotas;
	Definir almacen Como Entero;
	Definir notas Como Entero;
	Definir media Como Entero;
	Definir suma Como Entero;
	
	
	Dimension almacen[cantidadNotas];
	
	Para i <- 1 hasta cantidadNotas Con Paso 1 Hacer
		escribir "dame una nota";
		leer notas;
		almacen[i] = notas;
	FinPara
	
	Suma = suma + almacen[i];
	Escribir "la media de las notas es: " media = suma / cantidadNotas;
	
FinAlgoritmo
