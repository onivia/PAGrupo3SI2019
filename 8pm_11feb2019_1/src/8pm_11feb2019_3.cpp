/*
 * 8pm_11feb2019_3.cpp
 *
 *  Created on: 11/02/2019
 *      Author: ONivia
 *
 *  Ejercicio (5)
 *  1. Capturar numero
 *  2. Obtener numero aleatorio en el rango >0 y <=numero
 *  3. Mostrar numero aleatorio
 */

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int obtenerAleatorioRango(int desde, int hasta) {
	srand(time(NULL));
	int aleatorio = (rand() % hasta) + desde;

	return aleatorio;
}


int main() {
	//1.
	int numero = 10;

	//2.
	int numeroaleatorio = obtenerAleatorioRango(1,numero);

	//3.
	cout<<numeroaleatorio<<endl;

	return 0;
}

