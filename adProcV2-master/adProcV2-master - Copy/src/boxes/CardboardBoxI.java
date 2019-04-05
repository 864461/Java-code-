/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author up861808, up864461, up876126, up861332
 */
public class CardboardBoxI extends CardboardBox{

    public CardboardBoxI(int quantity, double width, double length, double height, int grade, boolean sealableTop) {
        super(quantity, 0, width, length, height, grade, sealableTop);
    }

    @Override
    public double calculateTotalPrice() {
        double area = calculateArea();
        double pricePerM = calculatePricePerM();
        double totalPrice = area * pricePerM;
        double priceWithoutExtras = area * pricePerM;
        totalPrice = sealableTop ? totalPrice + priceWithoutExtras * sealableTopPerc : totalPrice;
        return totalPrice * quantity;
    }
}
