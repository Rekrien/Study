#include <iostream>
using namespace std;

int main(int argc, char** argv[]){
	int v[100], pointer=0, place=0, contador=0;
	for (int i=0; i<100; i++){
		cout<<"Digite o numero:";
		cin>>v[i];
		if (v[i]==0){
			pointer=v[i-1];
			place=i-1;
			break;
		}
	}
	for (int i=0; i<place; i++){
		if (v[i]==pointer){
			contador++;
		}
	}
	cout<<contador;
}