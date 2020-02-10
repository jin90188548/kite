# 모듈 읽기
from urllib import request
#import urllib.request as req

# urlopen() 함수를 이용해서 웹 요청
#target = request.urlopen('https://www.google.com')
target = request.urlopen('http://localhost:8080/sensor1/datainput.jsp?data=sensor01,11.119')
data = target.read()

print(data)