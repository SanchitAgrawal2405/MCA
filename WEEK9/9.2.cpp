#include <iostream>
#include <cmath>
using namespace std;

void towerOfHanoiRecursive(int n, char source, char destination, char auxiliary) {
    if (n == 1) {
        cout << "Move disk 1 from " << source << " to " << destination << endl;
        return;
    }
    towerOfHanoiRecursive(n - 1, source, auxiliary, destination);
    cout << "Move disk " << n << " from " << source << " to " << destination << endl;
    towerOfHanoiRecursive(n - 1, auxiliary, destination, source);
}

void towerOfHanoiIterative(int n, char source, char destination, char auxiliary) {
    int totalMoves = pow(2, n) - 1; 
    for (int i = 1; i <= totalMoves; i++) {
        // Determine the source and destination pegs
        char from = (i % 3 == 1) ? source : (i % 3 == 2) ? auxiliary : destination;
        char to = (i % 3 == 1) ? destination : (i % 3 == 2) ? source : auxiliary;

        // If the number of disks is even, swap destination and auxiliary
        if (n % 2 == 0) {
            swap(to, auxiliary);
        }

        cout << "Move disk " << (i % 2 == 1 ? (i + 1) / 2 : (i + 2) / 2) << " from "
             << from << " to " << to << endl;
    }
}

int main() {
    int n;
    cout << "Enter the number of disks: ";
    cin >> n;

    cout << "Recursive Solution:" << endl;
    towerOfHanoiRecursive(n, 'A', 'C', 'B');

    cout << "\nNon-Recursive Solution:" << endl;
    towerOfHanoiIterative(n, 'A', 'C', 'B');

    return 0;
}
