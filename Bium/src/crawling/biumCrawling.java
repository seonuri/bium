package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class biumCrawling {
	static String url = "http://shop.biumfood.com/detail2.php?item=";
	static int num = 1;
	public static void main(String[] args)throws IOException{
		while(true) {
			String complet_url = url+num;
			
			Document bium = Jsoup.connect(complet_url).get();
			Elements biumImage = bium.select("ul.bxslider > li > img");
			num++;
			
			for (Element element : biumImage) {
				String image = element.attr("src");
				System.out.println("===="+num+"====");
				System.out.println(image);
			}
			
		}
			
	}
}
