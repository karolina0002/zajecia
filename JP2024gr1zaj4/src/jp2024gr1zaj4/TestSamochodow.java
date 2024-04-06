package jp2024gr1zaj4;

import javax.swing.JOptionPane;

public class TestSamochodow {
    
    public static void main(String[] args) {
        
        Samochod sam1 = new Samochod();
        
        System.out.println(sam1.getNazwa());
        System.out.println(sam1.getDlugosc());
        System.out.println(sam1.getSzerokosc());
        System.out.println(sam1.getPredkoscJazdy());
        
        sam1.setNazwa("Mini");
        sam1.setDlugosc(3800);
        sam1.setSzerokosc(1800);
        sam1.setPredkoscJazdy(160);
        
        System.out.println(sam1.getNazwa());
        System.out.println(sam1.getDlugosc());
        System.out.println(sam1.getSzerokosc());
        System.out.println(sam1.getPredkoscJazdy());  
        
        Samochod sam2 = new Samochod();
        
        sam2.setNazwa("Audi");
        sam2.setDlugosc(4200);
        sam2.setSzerokosc(2200);
        sam2.setPredkoscJazdy(220);
        
        System.out.println(sam2.getNazwa());
        System.out.println(sam2.getDlugosc());
        System.out.println(sam2.getSzerokosc());
        System.out.println(sam2.getPredkoscJazdy());  
        
        Samochod sam3 = new Samochod("BMW",4600,2600,260);
        
        System.out.println(sam3.getNazwa());
        System.out.println(sam3.getDlugosc());
        System.out.println(sam3.getSzerokosc());
        System.out.println(sam3.getPredkoscJazdy());  
                
        System.out.println(sam1);
        System.out.println(sam2);
        System.out.println(sam3);
        
        String  linia = JOptionPane.showInputDialog("Wczytaj tekst: ");
        JOptionPane.showMessageDialog(null,linia.toUpperCase());
        
        //P.D.
        
        //1. Stworzyc tablice na 6 samochodow
        
        //2. Wczytac parametry samochodow z klawiatury
        
        //3. Dodac dodac dodatkowe dwiec cechy do klasy Samochod:
        // - moc samochodu INT
        // - pojemnosc silnika DOUBLE
        
        //4. Wyswietlic parametry samochodow i dodatkowo samochod
        //z najwieksza moca i wyswietlic srednia z wszystkich pojemnosci samochod
        
        //5. Uzyc klawiatury wejscia/wyjscia
        //Dodatkowy polus uzyc JOptionPane - prostej wersji okienek
        
    }
    
}
