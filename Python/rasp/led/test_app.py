# coding: utf-8

# flask
from flask import Flask

# CORS
from flask_cors import CORS

# request param 
from flask import request

# GPIO 
import RPi.GPIO as GPIO

###########################################################

# GPIO 핀번호 할당
GPIO.setmode(GPIO.BOARD)

# pin 번호 chanel
LED = 11

# 핀 설정
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)


# PWM 객체 생성 : 11번 핀, 주파수 - 100Hz
p = GPIO.PWM(LED, 100)

# PWM 신호 출력
p.start(0)

def change_duty(dc):
    p.ChangeDutyCycle(dc)



####################################################

app = Flask(__name__)
CORS(app)

@app.route('/')
def index():

    led =  request.args.get('led', 'g')
    p_val = request.args.get('p_val', '0')
    
    change_duty(int(p_val))

    return led + ' : ' + p_val

if __name__ == '__main__':
    # host
    # 로컬 테스트 시에는 개발하는 PC의 IP로 설정
    # 라즈베리파이 에서 실행을 할 경우 라즈베리파이 IP를 설정
    app.run(host='192.168.0.64', port='5000')