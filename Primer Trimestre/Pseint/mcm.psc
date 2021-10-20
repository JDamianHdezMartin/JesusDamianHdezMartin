Algoritmo mcm
	Definir resto, divisor, dividendo, resultado Como Entero
	leer m
	leer n
	resto=1
	divisor=m
	dividendo=n
	resultado=0
	mientras resto <> 0 Hacer
		resto = dividendo mod divisor
		si resto = 0 Entonces
			resultado = divisor
		SiNo
			dividendo=divisor
			divisor=resto
		FinSi
	FinMientras
	Mostrar resultado
FinAlgoritmo
