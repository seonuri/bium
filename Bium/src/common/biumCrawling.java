package common;

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
			Elements biumInfo = bium.select("div.pure-g");

			for (Element element : biumInfo) {
				String image = element.select("ul.bxslider > li > img").attr("src");
				String bname = element.select("li.name > h2 > span").text();
				String bgram = element.select("em.option").text();
				String sal = element.select("span.num").text();
				System.out.println("===="+num+"====");
				System.out.println(image);
				System.out.println(bname);
				System.out.println(bgram);
				System.out.println(sal);
			}
			num++;
		}
			
	}
}
