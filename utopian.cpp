nclude <iostream>
using namespace std;

int height(int n) {
        int height1 = n;
            if(height1<=2){
                        return height1+1;
                            }else {
                                        if(height1 % 2 == 0){
                                                        height1 = height(height1-1)+1;
                                                                }else{
                                                                                height1 = height(height1-1)*2;
                                                                                        }
                                            }
                return height1;
}
int main() {
        int T;
            cin >> T;
                while (T--) {
                            int n;
                                    cin >> n;
                                            cout << height(n) << endl;
                                                }
}

