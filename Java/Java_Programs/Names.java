class Names {
public static void main() {
    String name[] = {"SAMSON", "AJAY", "LUCY", "PUSY", "JULIE", "MEGAN", "LARA", "MONICA", "GISELE", "KATTY","ADRIANA"};
    String temp;
    int i,j;
    int n=10;
    for(i=1;i<n-1;i++){
        for(j=0;j<=n-1;j++) {
            if((name[j].compareTo(name[j+1]))>0) {
                temp=name[j];
                name[j]=name[j+1];
                name[j+1]=temp;
            }
        }
    }
    for(int k =0; k<=n-1;k++) {
        System.out.println(name[k]);
    }
  }
}
