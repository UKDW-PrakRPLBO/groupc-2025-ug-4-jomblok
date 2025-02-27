package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandwith, String merk) {
        super(harga, promisedBandwith, merk);
    }
    public double getRealBandwith() {
        int hargapasaran = 50_000;
        double iniasli =  (double) getHarga()/hargapasaran;
        if (iniasli < 1){
            double v = iniasli * getPromisedBandwith();
            return v;
        }

        return getPromisedBandwith();
    }
}

