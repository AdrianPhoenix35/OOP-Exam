/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian.main1;

/**
 *
 * @author ADRIAN M
 */
public class Importer extends TaxCategory{
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}
