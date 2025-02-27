package org.example;

public class TV {
 private int maxResolusi;
 private Colokan colokan;

 public TV(int maxResolusi) {
  this.maxResolusi = maxResolusi;
 }

 public int getResolution() {
  double asik =  colokan.getRealBandwith();
  int maxResolusi = 0;
  if (asik > 10 && asik < 35) {
    maxResolusi = 480;
  } else if (asik > 35 && asik< 100) {
    maxResolusi=720;
  }else{
    maxResolusi= 1080;
  }

  return Math.min(maxResolusi, this.maxResolusi);

 }

 public void connect(Colokan colokan){
  this.colokan = colokan;
  System.out.println("Berhasil Connect ke - " + colokan.getMerk());
 }
}

