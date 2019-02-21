//============================================================================
// Name        : 8pm_20feb2019_1.cpp
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
	int cantFacturas;
	Factura *facturas;
};

int main() {
	int cantClientes = 0, cantFacturas = 0;
	Cliente *clientes = NULL;
	Factura *facturas = NULL;

	cout<<"Entre Cantidad clientes: ";
	cin>>cantClientes;

	//clientes = (Cliente *)malloc(cantClientes * sizeof(Cliente));
	clientes = new Cliente[cantClientes];

	for (int i = 0; i < cantClientes; ++i) {
		cout<<"entre nit: ";
		cin>>clientes[i].nit;
		cin.ignore();
		cout<<"entre nombre: ";
		cin.getline(clientes[i].nombre, 32);
		cout<<"Entre cantidad de Facturas: ";
		cin>>cantFacturas;
		clientes[i].cantFacturas = cantFacturas;
		facturas = (Factura *)malloc(cantFacturas * sizeof(Factura));
		for (int j = 0; j < cantFacturas; ++j) {
			cout<<"entre numero: ";
			cin>>facturas[j].numero;
			cin.ignore();
			cout<<"entre fecha: ";
			cin.getline(facturas[j].fecha, 16);
		}
		clientes[i].facturas = facturas;
	}
	facturas = NULL;

	cout<<"Mostrando los datos caragados!!!"<<endl;

	for (int i = 0; i < cantClientes; ++i) {
		cout<<"\t\tnit del cliente("<<i+1<<"): "<<clientes[i].nit<<endl;
		cout<<"\t\tnombre del cliente("<<i+1<<"): "<<clientes[i].nombre<<endl;
		for (int j = 0; j < clientes[i].cantFacturas; ++j) {
			cout<<"\t\t\tnumero de la factura: "<<clientes[i].facturas[j].numero<<endl;
			cout<<"\t\t\tfecha de la factura: "<<clientes[i].facturas[j].fecha<<endl;
		}
		free(clientes[i].facturas);
		clientes[i].facturas = NULL;
	}
	free(clientes);
	clientes = NULL;

	return 0;
}
