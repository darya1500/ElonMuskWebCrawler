##Preconditions
1.	Create your personal solution
2.	Focus on breadth rather than depth when cover expected output points
3.	Do your best to figure out industry best practices and utilize them properly
4.	You have a time limit - 7 days
5.	Tech challenge is your primary focus
##Problem statement
Implement a web crawler that traverses websites following predefined link depth (8 by default) and max visited pages limit (10000 by default). Web crawler starts from predefined URL (seed) and follows links found to dive deeper. The main purpose of this crawler to detect the presence of some terms on the page and collect statistics, e.g.

###Seed:
	https://en.wikipedia.org/wiki/Elon_Musk
###Terms:
Tesla, Musk, Gigafactory, Elon Mask
###Output:
https://en.wikipedia.org/wiki/Elon_Musk 208 641 9 0
acbd.com/page2.html  8 4 0 5 17
qwerty.com/page1.html  3 2 0 2 7
anothersite.com/page3.html  0 1 0 1 2


##Clarification:
	https://en.wikipedia.org/wiki/Elon_Musk 208 641 9 0 858
	Numbers are
		Tesla - 208 hits
		Musk - 641 hits
		Gigafactory - 9 hits
		Elon Mask - 0 hits
		Total - 858 hits

All stat data should be serialized into CSV file (no predefined sort)
Top 10 pages by total hits must be printed to separate CSV file and console (sorted by total hits)
###Expected artifacts
####1.	Source code provided through GitHub project
a.	Focus on Java 11 LTS
b.	Take into account project supportability
c.	Focus on documentation
####2.	Env setup can be easily repeated
a.	Add configuration and startup scripts
b.	One button setup & configuration
c.	Prepare sample data if necessary
####3.	Code follows industry best practices 
a.	matches predefined code style - you can setup any
b.	code coverage >40%
c.	contains tests of several levels - unit, integration, etc.
####4.	Provide a google drive link to your Demo session (up to 10m)
a.	record a video proof that app works
b.	cover both the happy path and failure/edge-case scenario
c.	Take a code tour and clarify selected solutions
d.	Prepare it in English

##FAQ
####1.	В каком виде должен быть результат? Веб приложение или консольное?
На выбор кандидата, не влияет на финальную оценку

####2.	И что значит глубина ссылки (link depth)? Количество слешей в ссылке или количество переходов «в глубь» с начальной страницы?
link depth - количество переходов в глубину относительно начальной страницы

####3.	Могу ли я использовать готовый web crawler, либо должен реализовать свой web crawler?
Необходимо реализовать свой собственный web crawler

####4.	По поводу websites, которые должен посещать web crawler: должны ли они изначально быть заданы?
	Задаётся стартовая страница, это описано в задании
Web crawler starts from predefined URL (seed) and follows links found to dive deeper.

####5.	По поводу пунктов:   2. Env setup can be easily repeated a. Add configuration and startup scripts   b. One button setup & configuration. Я немного не понял, каким образом должно запускаться приложение и должен ли быть UI?
Поставка решения предполагает возможность простого запуска и не зависит от UI. Это может быть sh или bat файл, goal в maven / gradle, скрипт для старта Docker. Основная идея в том, что все необходимые приготовления будут сделаны автоматически и не потребуют дополнительной ручной подготовки.

####6.	можно использовать любые библиотеки / скрипты?
	Ограничений нет, за исключением использования готовых web crawler, счётчиков статистики и их исходных кодов

####7.	странички для анализа я должен сам, какие захочу?
Для тестирования можно брать любой seed page. Приёмочный тест предполагает использование любой случайной страницы из сети

####8.	а можно использовать готовые Html парсеры? и надо ли рассматривать сайты с js?
Касательно парсеров ответ дан в пункте 6.
Необходимо реализовать свой собственный web crawler. Идеальная реализация работает со страницей таким же образом, как и человек. Если используя Ctrl+F на сайте с js можно найти указаные terms, то это должно попасть в статистику.

####9.	при запуске программы, сразу начинается webcrawl? или надо отправить запрос к приложение чтобы начинало crawling и потом скачать csv файл при завершение?
На выбор кандидата, не влияет на финальную оценку. Зависит от выбранного решения - console program, web site, swing / javaFX app, etc.

####10.	По какому веб-сайту должен шагать краулер? или вообще по всей сети?
Задаётся стартовая страница, это описано в задании. Дальше ограничений для него нет, за исключением заданной глубины поиска и количества посещенных страниц

####11.	какие брать ссылки и сколько их должно быть в проекте?
Для тестирования можно брать любой seed page. Приёмочный тест предполагает использование любой случайной страницы из сети

####12.	Не совсем понял ответ про html-парсеры(JSOUP и тд), могу ли я их использовать, либо парсер писать самостоятельно?
	См. Пункт 6.
Написание собственной реализации парсера приветствуется, но не является обязательной.

####13.	В задании, max visited pages - это максимальное количество страниц, с которых нужно собрать статистику?
	Да, это максимальное количество посещенных страниц, по которым crawler пытался собрать статистику.

####14.	Извиняюсь, но куда отправлять выполненное задание, я не нашел нигде адреса?
	Высылать на почту HR alexandra.aleshchyk@softeq.com

####15.	В задании нужно записать данные  в файл под сериализацией или просто текстом?
	Стоит детальнее ознакомиться с форматом CSV и понятием serialization. 





