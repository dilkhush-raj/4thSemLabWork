#include <stdio.h>

int main()
{
    int n = 5;

    // Program number 1
    printf("Program number 1 : \n");

    int i, j, space = 4;

    for (i = 0; i < 5; i++)
    {
        for (j = 0; j < space; j++)
        {
            printf(" ");
        }
        for (j = 0; j <= i; j++)
        {
            printf("* ");
        }
        printf("\n");
        space--;
    }

    // Program number 2

    printf("Program number 2 : \n");
    for (int i = 1; i <= n; i++) // Outer Loop
    {
        // inner for loop
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }

        printf("\n");
    }

    printf("Program Number 3 : \n");

    // Program number 3

    for (int i = 1; i <= n; i++) // Outer Loop
    {
        // inner for loop
        for (int j = 1; j <= i; j++)
        {
            printf("%d", j);
        }

        printf("\n");
    }

    // Program number 4

    printf("Program Number 4 : \n");

    for (int i = 1; i <= n; i++) // Outer Loop for creating 5 rows
    {
        // inner for loop
        for (int j = 5; j >= i; j--)
        {
            printf("*");
        }

        printf("\n");
    }

    // Program Number 5

    printf("Program Number 5 : ");

    printf("\n");
    printf("   1   \n");
    printf("  1 1  \n");
    printf(" 1 2 1 \n");
    printf("1 3 3 1\n");

//     START
//   Step  1 - Take number of rows to be printed, n.
//   Step  2 - Make outer iteration I for n times to print rows
//   Step  3 - Make inner iteration for J to (N - 1)
//   Step  4 - Print single blank space " "
//   Step  5 - Close inner loop
//   Step  6 - Make inner iteration for J to I
//   Step  7 - Print nCr of I and J
//   Step  8 - Close inner loop
//   Step  9 - Print NEWLINE character after each inner iteration
//   Step 10 - Return
//      STOP

//   for (i=1; i<=5; i++){
//     for(j=4; j>=i; j--)
//         printf(" ");
    
//     for(int k=1; k<=i; k++)
//         printf("%d", k);
    
//     printf("\n");

//   }

    return 0;
}
