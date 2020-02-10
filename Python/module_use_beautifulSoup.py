from bs4 import BeautifulSoup
from urllib import request

# urlopen() 함수를 이용해서 기상청 데이터 가져오기
target = request.urlopen('http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1165051000')
soup = BeautifulSoup(target, 'html.parser')

#print(soup.prettify())

print(soup.find('title').string)


for fdata in soup.find_all('data'):
    print(fdata.hour.string, '시 예보, ', end='')
    print(fdata.day.string, ' ', end='')
    print('현재온도 : ', fdata.temp.string, ' 도, ', end='')
    print('강수 상태 : ', fdata.pty.string)


# for fdata in soup.select('data'):
#     soup_e = BeautifulSoup.select_one(fdata)