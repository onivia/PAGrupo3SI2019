//============================================================================
// Name        : 8pm_08feb2019_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
	/*
	 * Resuelve el ejercicio 1 de la actividad1-1
	 * 1. Capturar el numero
	 * 2. obtener la unidad del numero, obteniendo el residuo de la division del numero entre 10
	 * 3. Evaluo la unidad obtenidad y muestro msj.
	 */
//============================================================================

#include <iostream>
using namespace std;

int main() {
	//1.
	int num = 0;
	cout<<"Entre numero: ";
	cin>>num;

	//2.
	int unidadnum = 0;
	unidadnum = num % 10;

	//3.
	switch(unidadnum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			cout<<"El numero entrado fue: "<<num<<" y la unidad es: "<<unidadnum<<endl;
			break;
		default:
			cout<<"NO es ningun caso!"<<endl;
			break;
	}

	return 0;
}
