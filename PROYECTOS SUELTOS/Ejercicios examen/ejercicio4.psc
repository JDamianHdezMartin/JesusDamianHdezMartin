Algoritmo ejercicio4
    num_secreto <- azar(100)+1
	Escribir "¿Qué dificultad quieres jugar: 1 fácil,2 medio,3 difícil?"
	Leer i
	Si i = 1 Entonces
		Escribir "Dificultad 1, tiene 7 intentos"
		intentos<-7
	FinSi
	si i=2 Entonces
		Escribir "Dificultad 2, tiene 5 intentos"
		intentos<-5
	FinSi
	si i=3 Entonces
		Escribir "Dificultad 3, tiene 3 intentos"
		intentos<-3
	FinSi
	
    Escribir "Adivine el numero (de 1 a 100):"
    Leer num_ingresado
    Mientras num_secreto<>num_ingresado Y intentos>1 Hacer
        Si num_secreto>num_ingresado Entonces
			Escribir "secreto > ",num_ingresado
			
        Sino 
            Escribir "secreto < ",num_ingresado
        FinSi
        intentos <- intentos-1
        Escribir "Le quedan ",intentos," intentos:"
        
		Leer num_ingresado
		
    FinMientras
    
    Si num_secreto=num_ingresado Entonces
        Escribir "acertaste, has ganado ",11-intentos," intentos."
    Sino
        Escribir "El numero era: ",num_secreto
    FinSi
FinAlgoritmo
