package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private String fileName = "src/resources/names.txt";
    private String line = null;
    private List imiona = new ArrayList();

    public List readFile(){
        System.out.println("Wejście do funkcji readFile");
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            while((line = bufferedReader.readLine()) != null){
                imiona.add(line);
            }

        }catch(FileNotFoundException ex){

        }catch (IOException ex){

        }System.out.println("Plik odczytany.");
        return imiona;
    }

    public void printElements(List imiona2){
        System.out.println("Imiona: ");
        for(int i = 0; i < imiona2.size(); i++){
            System.out.println(imiona2.get(i));
        }
    }

    public String printRandomName(List imiona2){
        String text = null;
        try{
            Random randomName = new Random();
            int randomN = randomName.nextInt(imiona2.size());
        //    System.out.println("Losowe imie: " + imiona2.get(randomN));
            text = String.valueOf(imiona2.get(randomN));
            System.out.println("\n");
        }catch (IllegalArgumentException ex){

        }return text;
    }
}
