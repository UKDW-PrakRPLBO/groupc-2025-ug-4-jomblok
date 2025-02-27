package org.example;

public class VGA extends Colokan{

    public VGA(int harga, double promisedBandwith, String merk) {
        super(harga, promisedBandwith, merk);
    }

    @Override
    public double getRealBandwith() {
        int hargapasaranvga = 30_000;
        double iniaslisih = (double) getHarga()/hargapasaranvga;
        if (iniaslisih < 1){
            double k = iniaslisih * getPromisedBandwith();
            return k;
        }

        return getPromisedBandwith();
    }

}
