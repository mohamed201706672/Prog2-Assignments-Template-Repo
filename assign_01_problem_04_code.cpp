//mohamed hamed 
//201706672
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    int arr[3] = {a, b, c};
    sort(arr, arr + 3);

    cout << arr[0] << endl << arr[1] << endl << arr[2] << endl << endl;
    cout << a << endl << b << endl << c << endl;

    return 0;
}
