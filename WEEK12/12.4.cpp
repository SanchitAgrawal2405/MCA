#include <iostream>
using namespace std;
class ObjectCounter {
private:
    static int objectCount;
public:
    ObjectCounter() {
        objectCount++;
        cout << "Object created. Total objects: " << objectCount << endl;
    }
    ~ObjectCounter() {
        objectCount--;
        cout << "Object destroyed. Total objects: " << objectCount << endl;
    }
    static int getObjectCount() {
        return objectCount;
    }
};
int ObjectCounter::objectCount = 0;
int main() {
    {
        ObjectCounter obj1; 
        ObjectCounter obj2; 
        cout << "Objects in the block: " << ObjectCounter::getObjectCount() << endl;
    } 
    cout << "Objects outside the block: " << ObjectCounter::getObjectCount() << endl;
    {
        ObjectCounter obj3; 
        cout << "Objects in the second block: " << ObjectCounter::getObjectCount() << endl;
    } 
    cout << "Objects outside the second block: " << ObjectCounter::getObjectCount() << endl;
    return 0;
}

