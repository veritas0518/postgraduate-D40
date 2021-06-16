import java.util.Scanner;
class BMI{
   private double height;
   private double weight;
   BMI(double height,double weight){
       this.height=height;
       this.weight=weight;
   }
   private double getBMI(){
      double bmi=weight/(height*height);
    //  System.out.println(bmi);
      return bmi;

   }
    String assessBMI(double bmi){

       if(bmi<18.5)
           return "LOW WEIGHT";
       else if(18.5<=bmi && bmi<=24)
           return "Normal Weight";
       else if(24<=bmi && bmi<28)
       return "Overweight";
       else
       return "Fat or Obesity";

    }


    void show(){
       double bmi = getBMI();
        String TYPE=assessBMI(bmi);
        System.out.printf("height =%fm, weight=%fkg , BMI is %f, %s",height,weight,bmi,TYPE);
 }
}
public class TestBMI {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);


        System.out.println("Please enter height(m):");
        double height=s.nextDouble();
        System.out.println("Please enter weight(kg):");
        double weight=s.nextDouble();
        BMI b=new BMI(height,weight);
        b.show();
    }
}

