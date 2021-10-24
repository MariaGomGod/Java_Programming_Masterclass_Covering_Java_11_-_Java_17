package com.timbuchalka;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. The accessible interface?
// 2. The int variable SOME_CONSTANT?
// 3. MethodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on the interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100; // It is accessible in all classes (inside the package com.timbuchalka)
    void methodA(); // It is public
    void methodB(); // It is public
    boolean methodC(); // It is public
}
