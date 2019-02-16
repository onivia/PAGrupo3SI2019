//============================================================================
// Name        : 8pm_15feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f2(int **p2) {
	**p2 += 1;
}

void f1(int *p1) {
	*p1 += 1;
	f2(&p1);
}


int main() {
	int a=10;

	f1(&a);
	cout<<a<<endl;

	return 0;
}
