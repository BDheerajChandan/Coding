class taximeter {
int taxino;
String name;
int km;
float bill;
taximeter() {
taxino=0;
name=" ";
km=0;
}
void input(int t, String n, int k){
taxino=t;
name=n;
km=k;
}
void calculate() {

float rate=0;
if(km<1){
rate=25;
bill=(float)km*rate;
}
               else if(km>=1 && km<=6) {
               rate=10;
bill=(float)km*rate;
               
                }
                else if(km>=6 && km<=12){
                    rate=15;
bill=(float)km*rate;

                }
                else if(km>=12 && km<=18){
                    rate=20;
bill=(float)km*rate;
                    
                }
                else if(km>18){
                    rate=25;
bill=(float)km*rate;

                }
            }
                void display(){
                    System.out.println("Taxino        Name          Kilometers travelled             Bill Amount");
                    System.out.println();   
                    System.out.println(+taxino  + "          "  +name  + "                      "    +km + "                            " + bill);
                
            }
public void main(){
calculate();
display();
}            

        }
               