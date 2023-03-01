#include<stdio.h>
int main()
{
    int n_students=3;
    int n_subjects=5;
    int marks[3][5];
    int i,j;
    for(i=0;i<n_students;i++){
        for(j=0;j<n_subjects;j++){
            printf("Enter marks of the student %d for subject %d\n",i+1,j+1);
            scanf("%d",&marks[i][j]);
        }
    }
    for(i=0;i<n_students;i++){
        for(j=0;j<n_subjects;j++){
            printf("the marks of the student %d for subject %d is %d\n",i+1,j+1,marks[i][j]);
        }
    }

    return 0;
}