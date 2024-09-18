import java.io.*;
class circular {
public void circular (int n) {
int t=1, r=0,c=-1,i,j;
System.out.print("Limit of Double Dimnesional Array ::");
int a[][]=new int[n][n];
while(n>0) {
for(i=1;i<=n;i++) {
a[r][++c] = t++;
}
for(i=1;i<n;i++) {
a[++r][c]=t++;
}
for(i=1;i<n;i++) {
a[r][--c]=t++;
}
for(i=1;i<n-1;i++) {
a[--r][c] = t++;
}
n=n-2;
}
System.out.println("Now Output is.....");
for(i=0;i<1;i++) {
    for(j=0;j<1;j++) {
    System.out.print(a[i][j] +"\t");
}
System.out.println();

}}}
