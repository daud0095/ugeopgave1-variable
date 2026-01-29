double item1 = 25.50;
double item2 = 15.00;
double item3 = 30.00;
double TaxRate = 25.0;


void main() {
    double subtotal = item1 + item2 + item3;
    double TaxAmount = subtotal + (subtotal * TaxRate / 100.0);

    System.out.println(subtotal);
    System.out.println(TaxAmount);
}
