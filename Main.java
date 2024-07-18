import java.util.Scanner;
class Main{
    int avg=0;
    int tot=0;
    int subject[]=new int[5];
void total () {
     Scanner sc = new Scanner(System.in);
        int subject[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter subject "+(i+1)+" mark:");
            subject[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            tot=tot+subject[i];
        }
        System.out.println("The total mark="+tot);

    }
    void average() {
        for(int i=0;i<5;i++) {
            avg=tot/5;
        }
        
        System.out.println("The average=" +avg);
    }
    void grade() {
        if(avg>=90){
            System.out.println("obtained O grade.");
        }
        else if(avg>=80 && avg<90){
            System.out.println("obtained A grade.");
        }
        else if(avg>=70 && avg<80){
            System.out.println("obtained B grade.");
        }
        else if(avg>=60 && avg<70){
            System.out.println("obtained C grade.");
        }
        else if(avg>=50 && avg<60){
            System.out.println("obtained D grade.");
        }
        else{
            System.out.println("fail");
        }
        
    }
    public static void main(String [] args){

      
      Main obj=new Main();
      obj.total();
      obj.average();
      obj.grade();
     }
    
}


        