object Problem3 extends App {
  def findWholeSale(b:Int):Double={
    if(b>=50){
      (3*50)+(0.75*(b-50))+(0.6*24.95*b);
    }
    else{
      (3*b)+(0.6*24.95*b);
    }
  }
  println("Total Wholesale Cost = Rs."+findWholeSale(60));
}
