package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class GameSaleService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Sprzedaż " + product.getNameOfProduct() + " w dniu " + dateOfSale.toString()
                + ", kupujący: " + user.getFirstName());
        return true;
    }
}
