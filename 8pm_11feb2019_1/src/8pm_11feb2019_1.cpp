//============================================================================
// Name        : 8pm_11feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
/*
 * Ejercicio (2) Actividad1-1
 * 1. Leer numero binario
 * 2. Obtener la cantidad de cifras del numero binario
 * 3. En un ciclo, desde i=0 hasta i<cifras
 * 		4. Obtengo cada cifra
 * 		5. Acumulo esta operacion: cifra*(2^i)
 * 	6. Muestro el resultado (el acumulado)
 */
//============================================================================

#include <iostream>
#include <cmath>
using namespace std;

int obtenerCantidadCifrasNumero(int numero) {
	int cifras = log10(numero) + 1;

	return cifras;
}

int obtenerCifra(int numero, int cifra) {
	int extractor = pow(10,cifra);
	int separador = extractor / 10;

	int cifranumero = (numero % extractor) / separador;

	return cifranumero;
}

int main_2() {
	//1.
	int numerobinario = 11011;

	//2.
	int cifras = obtenerCantidadCifrasNumero(numerobinario);

	//3.
	int cifra = 0;
	int numerodecimal = 0;
	for (int i = 0; i < cifras; ++i) {
		//4.
		cifra = obtenerCifra(numerobinario,i+1);
		//5.
		numerodecimal += cifra*pow(2,i);
	}

	cout<<"el numero decimal es: "<<numerodecimal<<endl;
	return 0;
}
