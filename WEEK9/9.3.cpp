#include <iostream>
using namespace std;

const int MAX_SIZE = 100; // Define a maximum size for the matrix

void transposeMatrix(int matrix[MAX_SIZE][MAX_SIZE], int rows, int cols, int transposed[MAX_SIZE][MAX_SIZE]) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            transposed[j][i] = matrix[i][j]; 
        }
    }
}

void displayMatrix(int matrix[MAX_SIZE][MAX_SIZE], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    int rows, cols;
    int matrix[MAX_SIZE][MAX_SIZE];       
    int transposed[MAX_SIZE][MAX_SIZE];   

    cout << "Enter the number of rows: ";
    cin >> rows;
    cout << "Enter the number of columns: ";
    cin >> cols;

    // Input the matrix elements
    cout << "Enter the elements of the matrix:" << endl;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix[i][j];
        }
    }

    // Transpose the matrix
    transposeMatrix(matrix, rows, cols, transposed);

    // Display the original matrix
    cout << "Original Matrix:" << endl;
    displayMatrix(matrix, rows, cols);

    // Display the transposed matrix
    cout << "Transposed Matrix:" << endl;
    displayMatrix(transposed, cols, rows);

    return 0;
}
