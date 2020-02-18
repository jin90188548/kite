# coding: utf-8

# flask
from flask import Flask

# GPIO 모듈 
import RPi.GPIO as GPIO

# 핀번호 할당 설정
GPIO.setmode(GPIO.BOARD)

#핀(chanel) 번호
LED_G = 11  # 초록색 LED
LED_Y = 16  # 노란색 LED
LED_R = 22  # 빨간색 LED


# 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)
# 16번 핀 출력 핀으로 등록    
GPIO.setup(LED_Y, GPIO.OUT, initial=GPIO.LOW) 
# 22번 핀 출력 핀으로 등록    
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW) 


def func_g(): 
    if not GPIO.input(LED_G):
        func_clear()   

    GPIO.output(LED_G, not GPIO.input(LED_G))

    return str(GPIO.input(LED_G))
    
   
def func_r():
    if not GPIO.input(LED_R): 
        func_clear()

    GPIO.output(LED_R, not GPIO.input(LED_R))

    return str(GPIO.input(LED_R))
    

def func_y():
    if not GPIO.input(LED_Y):         
        func_clear()
    
    GPIO.output(LED_Y, not GPIO.input(LED_Y))

    return str(GPIO.input(LED_Y))



# chenel 값을 0
def func_clear():
    GPIO.output(LED_G, False)
    GPIO.output(LED_Y, 0)
    GPIO.output(LED_R, GPIO.LOW)

  








###############################################

app = Flask(__name__)

@app.route('/sw_g')
def sw_g():
    return func_g()


@app.route('/sw_y')
def sw_y():
    return func_y()


@app.route('/sw_r')
def sw_r():
    return func_r()

print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.64', port=5000, debug=False)