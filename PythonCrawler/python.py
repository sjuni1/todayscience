from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("https://www.sciencetimes.co.kr/news/%ed%94%84%eb%a0%88%ec%98%a8%ea%b0%80%ec%8a%a4%eb%a1%9c%eb%b6%80%ed%84%b0-%ec%a7%80%ea%b5%ac%eb%a5%bc-%ea%b5%ac%ed%95%b4%eb%9d%bc/")
bsObject = BeautifulSoup(html,"html.parser")
print(bsObject.body.find_all("strong"));

