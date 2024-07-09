#include <iostream>
using namespace std;

int main()
{
    int k, j, n;

    cout <<"Enter number of rows: ";
    cin >> n;

    for(int i = 1; i<=n; i++)
    {
        for(int k=n-i;k>0;k--)
        {
            cout <<"  ";
        }

        for(int j=1;j<=i;j++)
        {
            cout << "* ";
        }
        cout << endl;
    }    
    return 0;
}
