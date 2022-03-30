Algoritmo PracticaExtraAzar

	definir tecla como texto;
	definir numeroAleatorio Como Entero;
	Escribir "Este programa muestra numeros aleatorios hasta que el usuario escribe la tecla f";
	Repetir
		numeroAleatorio <- azar(100);
		Escribir numeroAleatorio;
		Leer tecla;
	Hasta Que tecla = "f" o tecla = "F" 
	
FinAlgoritmo
