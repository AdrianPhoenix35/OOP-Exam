/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian.main1;

class CalculateVAT {
    public static void main(String[] args) {
        TaxCategory[] taxpayers = new TaxCategory[3];
        taxpayers[0] = new Retailer();
        taxpayers[1] = new Wholesaler();
        taxpayers[2] = new Importer();

        double[] transactionAmounts = {50000, 100000, 200000};

        for (int i = 0; i < taxpayers.length; i++) {
            double vatAmount = taxpayers[i].calculateVAT(transactionAmounts[i]);
            System.out.println("Taxpayer " + (i + 1) + ": VAT Amount = " + vatAmount);
        }
    }
}



  
