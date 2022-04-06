//Extract the transaction ID from the HTML body

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Assignment_1 {
    public static void main(String[] args) {
        {
            try {
                String fileName = "G:\\SDET\\Java_Practice\\Java_manipulation\\src\\Sample.html";
                File file = new File(fileName);
                Document document = Jsoup.parse(file, "UTF-8");
                Elements elements = document.getElementsByTag("body");

                String string = elements.text().split(":")[1];

                System.out.println(string);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
