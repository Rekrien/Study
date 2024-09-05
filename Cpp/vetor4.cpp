#include <iostream>
using namespace std;

int main(int argc, char** argv[]){
	int v[10], w[10];
	for (int i=0; i<10; i++){
		cout<<"Digite numero para o fatorial: ";
		cin>>v[i];
		if(v[i]==0){
			w[i]=0;
		}
		else{
			w[i]=v[i];
			for (int j=1; j<v[i]; j++){
				w[i]*=j;
			}
		}
	}
	for(int i=0; i<10; i++){
		cout<<w[i]<<"\n";
	}
}