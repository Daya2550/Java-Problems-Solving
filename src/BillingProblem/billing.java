package BillingProblem;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class billing {

    public static void main(String[] args) {

      BillingMethodes b=new BillingMethodes();
      b.run(b);

}

 static class BillingMethodes{

    TreeMap<String ,Integer>Product =new TreeMap<>();
    TreeMap<String,Integer>TaxPersent = new TreeMap<>();
     BillingMethodes b = null;


    public  int calaulatedTax(int Units ,int TaxableValue ,String Product){
        int TaxPersentage = TaxPersent.get(Product);
        int TaxAmount = (Units * TaxableValue)*TaxPersentage/100;
        int finalTaxAmount = TaxAmount + (Units * TaxableValue);

        return finalTaxAmount;
    }

    public void AddProduct(BillingMethodes b){
        b.Product.put("chai",50);
        b.TaxPersent.put("chai",10);

        b.Product.put("milk",35);
        b.TaxPersent.put("milk",5);

        b.Product.put("suger",40);
        b.TaxPersent.put("suger",18);

        b.Product.put("chao",100);
        b.TaxPersent.put("chao",5);

    }
public void run(BillingMethodes c){
    int Quantity=0;
    int TotalAmount=0;
    BillingMethodes b = c;
    Scanner input = new Scanner(System.in);
    b.AddProduct(b);
    System.out.println("Product List :"+b.Product.toString());

    System.out.println("Enter the Number of products you want to add to the list ");
    Quantity = input.nextInt();
    String list[]=new String[Quantity];
    System.out.println("----------------------------------------------------");
    input.nextLine();


    for(int i=0;i<Quantity;i++) {
        System.out.println("Enter the product Name :");
        String product = input.nextLine();

        if (b.Product.containsKey(product)) {
            System.out.println("Enter number of quantity :");
            int num = input.nextInt();
            input.nextLine();
            int Final_Value = b.calaulatedTax(num, b.Product.get(product), product);
            String outString = "Sr.No: " + (i+1) + "| Product Name: " + product +"| Price: "
                    +b.Product.get(product) +"| Quantity: " + num + "| Tax%: " +
                    b.TaxPersent.get(product) + "%" + "| FinalPrice: " + Final_Value;
            list[i] = outString;
            TotalAmount += Final_Value;
        } else {
            System.out.println("Product not found");
            i--;
        }
    }

    System.out.println("-----------------------------------------------------------");
    for(String s:list){
        System.out.println(s);
    }
    System.out.println("Total Amount : "+TotalAmount);
}
}


}

