//============================================================================
// Name        : 8pm_08feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int num = 0;
	char cadena[32] = "";

	cout<< "Entre numero: ";
	cin>>num;

	cin.ignore();

	cout<<"Entre cadena: ";
	cin.getline(cadena,32);

	cout<<"el numero entrado fue: "<<num<<endl;
	cout<<"el cadena entrada fue: "<<cadena<<endl;

	return 0;
}
