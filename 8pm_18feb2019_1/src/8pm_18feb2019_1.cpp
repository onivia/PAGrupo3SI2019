//============================================================================
// Name        : 8pm_18feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Factura {
	int numero;
	char fecha[16];
};

struct Cliente {
	int nit;
	char nombre[32];
	Factura *facturas;
};


struct Punto {
	int x;
	int y;
};

int main() {
	Punto *puntos = NULL;
	puntos = (Punto *) malloc(1*sizeof(Punto));

	puntos[0].x = 50;
	puntos[0].y = 60;

	puntos = (Punto *) realloc(puntos,3);

	puntos[1].x = 100;
	puntos[1].y = 200;

	puntos[2].x = 500;
	puntos[2].y = 600;

	for (int i = 0; i < 3; ++i) {
		cout<<puntos[i].x<<endl;
		cout<<puntos[i].y<<endl;
	}

	return 0;
}
