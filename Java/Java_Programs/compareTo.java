 

//use of compareTo method in array
//arranging the month of order in sorted manner

class compareTo {
static String s[] ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
                    "Friday", "Saturday"};
                    public static void main(String args[]){
                        for (int i=0; i<s.length; i++){
                            for (int j= i+1; j<s.length;j++){
                                if(s[j].compareTo(s[i])<0){
                                    String temp;
                                    temp=s[i];
                                    s[i]=s[j];
                                    s[j]=temp;
                                }
                            }
                            System.out.println(s[i]);
                        }
                    }
            }
        
            
            
            
            
            
            
            
            
            