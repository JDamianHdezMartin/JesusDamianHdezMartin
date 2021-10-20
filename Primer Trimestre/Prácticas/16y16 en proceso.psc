Algoritmo sin_titulo
	
	Definir serie Como Entero;
	Definir maximo Como Entero;
	Definir minimo Como Entero;
	Definir totalElementos Como Entero;
	Definir totalBucle Como Entero;
	Definir a, b, c, d, e, f, g, h, i, j Como Entero;
	Leer a, b, c, d, e, f, g, h, i, j;
	totalElementos <- 11;
	totalBucle <- totalElementos-1;
	
	Dimension numElementos[totalElementos];
	numElementos[1] <- a;
	numElementos[2] <- b;
	numElementos[3] <- c;
	numElementos[4] <- d;
	numElementos[5] <- e;
	numElementos[6] <- f;
	numElementos[7] <- g;
	numElementos[8] <- h;
	numElementos[9] <- i;
	numElementos[10]<- j;
	
	maximo <- numElementos[1];
	minimo <- numElementos[1];
	
	Para contador<-1 Hasta totalBucle Hacer
		Si numElementos[contador]>maximo Entonces
			maximo <- numElementos[contador];
		FinSi
		Si numElementos[contador]<minimo Entonces
			minimo <- numElementos[contador];
		FinSi
	FinPara
	
	Escribir 'El número máximo es: ',maximo;
	Escribir 'El número mínimo es: ',minimo;
FinAlgoritmo
