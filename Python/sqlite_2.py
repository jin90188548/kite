# DML : insert, update, delete
import sqlite3

# DB 연결
con = sqlite3.connect('sample')
cur = con.cursor()

# sql 실행
sql_insert = 'insert into user_table values (\'son\', \'son\', \'son@naver.com\', 1990)'
cur.execute(sql_insert)


con.commit()
con.close()
