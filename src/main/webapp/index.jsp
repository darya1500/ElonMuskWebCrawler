<html>
<head>
    <title> Web Crawler</title>
</head>
<body>
<h2>Web Crawler</h2>
<p style="width: 85%">Web Crawler traverses websites following defined link depth and max visited pages limit.
    Web crawler starts from defined URL and follows links found to dive deeper.
    The main purpose of this crawler to detect the presence of some terms on the page and collect statistics.</p>
<p>Predefined URL:https://en.wikipedia.org/wiki/Elon_Musk</p>
<p>Predefined terms: Tesla, Musk, Gigafactory, Elon Mask</p>
<h4>Check example </h4>
<form name="start" action="controller" method="POST">
    <input type="hidden" name="action" value="check"/>
    <input type="hidden" name="givenurl" value="https://en.wikipedia.org/wiki/Elon_Musk"/>
    Define link depth for search:<input type="text" name="depth"/>
    Define number of pages for search:<input type="text" name="pages"/>
    <button class="main-button" type="submit">Check</button>
</form>
</body>
</html>
