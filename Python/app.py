# 모듈 읽기
from flask import Flask

# 서버 생성
app = Flask(__name__)

@app.route('/')
def hello():
    return '<h1>Hello~ Python Flask </h1>'
    
@app.route('/hello')
def hello1():
    return '<h1>Hello~ Hello~</h1>'