from flask import Flask, jsonify, abort, make_response
from flask_restful import Api, Resource

# sqlite3 
import sqlite3
# DB 연결
#con = sqlite3.connect('sample')
con = sqlite3.connect('sample', check_same_thread=False)

cur = con.cursor()



app = Flask(__name__)
api = Api(app)

class LedApi(Resource):
    def get(self, led_no):
        
        cur = con.cursor()
        sql_select = 'select * from user_table where id=\''+led_no+'\''
        cur.execute(sql_select)

        result_data = {}

        while True:
            row = cur.fetchone()  # 반환 행이 없으면 None 을 반환
            if row == None:
                break
            result_data = {
                'id':row[0],
                'name':row[1],
                'email':row[2],
                'birthday':row[3]
            }
        
        return result_data

    def post(self, led_no):
        return {'type':'POST'}
    def put(self, led_no):
        return {'type':'PUT'}
    def delete(self, led_no):
        return {'type':'DELETE'}

api.add_resource(LedApi, '/rest/v2/leds/<led_no>')


if __name__ == '__main__':
    app.run(debug=True)

