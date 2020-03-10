# 테이블의 질의문 처리
# sqlite3 
import sqlite3

# DB 연결
con = sqlite3.connect('sample')

cur = con.cursor()

sql_select = 'select * from user_table'

cur.execute(sql_select)

print('아이디\t이름\t이메일\t\t태어난해')

while True:
    row = cur.fetchone()  # 반환 행이 없으면 None 을 반환
    if row == None:
        break
    print('{}\t{}\t{}\t{}'.format(row[0], row[1], row[2], row[3]))

con.close()

