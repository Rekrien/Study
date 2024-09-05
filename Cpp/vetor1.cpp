#include <iostream>;
using namespace std;

int main(int argc, char** argv[]){
	
	int v[10], pointer=0;
	
	for (int i=0; i<10; i++){
		cout<<"Entre com valor para a posicao "<<(i+1)<<": ";
		cin>>v[i];
		if (v[i]<0){
			break;
		}
		pointer=i;
	}
	
	for (int i=0; i<=pointer; i++){
		cout<<v[pointer-i]<<"\n";
	}
}