Web crawler app that traverses websites following predefined link depth (8 by default) and max visited pages limit (10000 by default). Web crawler starts from predefined URL (seed) and follows links found to dive deeper. The main purpose of this crawler to detect the presence of some terms on the page and collect statistics, e.g.

### Seed:
	https://en.wikipedia.org/wiki/Elon_Musk
### Terms:
Tesla, Musk, Gigafactory, Elon Mask
### Output:
+ https://en.wikipedia.org/wiki/Elon_Musk 208 641 9 0
+ acbd.com/page2.html  8 4 0 5 17
+ qwerty.com/page1.html  3 2 0 2 7
+ anothersite.com/page3.html  0 1 0 1 2


## Clarification:
	https://en.wikipedia.org/wiki/Elon_Musk 208 641 9 0 858
	Numbers are
		Tesla - 208 hits
		Musk - 641 hits
		Gigafactory - 9 hits
		Elon Mask - 0 hits
		Total - 858 hits

Top 10 pages by total hits are printed to separate CSV file and console (sorted by total hits)

+ Used: Jsoup, Maven,JUnit, log4j2, servlet, jsp
+ app can be run with Main class or Tomcat
