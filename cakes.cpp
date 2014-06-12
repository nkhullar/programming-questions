#include <iostream>
using namespace std;
int main(){
        long int a;
            cin>>a;
                long int b[a];
                    for(long int i=0; i < a; i++){
                                cin>>b[i];
                                    }
                        for(long int i = 0; i < a; i++){
                                    if(b[i]%2==0){
                                                    cout<<((b[i]/2)*(b[i]/2))<<endl;
                                                            }
                                            else{
                                                            cout<<((b[i]/2)*((b[i]/2)+1))<<endl;
                                                                    }
                                                }
}
