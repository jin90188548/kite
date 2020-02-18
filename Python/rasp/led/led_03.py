# coding: utf-8

# LED 두개 출력

# GPIO 모듈
import RPi.GPIO as GPIO
# time 모듈
import time


# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BOARD)

# 핀번호 설정 : chanel
LED_G = 11  # 투명 LED
LED_Y = 16  # 노란색 LED
LED_R = 22  # 빨간색 LED

# 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_G, GPIO.OUT, initial=GPIO.LOW)
# 16번 핀 출력 핀으로 등록    
GPIO.setup(LED_Y, GPIO.OUT, initial=GPIO.LOW) 
# 22번 핀 출력 핀으로 등록    
GPIO.setup(LED_R, GPIO.OUT, initial=GPIO.LOW) 


def func_g():    
    print('========> LED_W : ', GPIO.input(LED_G))
    GPIO.output(LED_G, not GPIO.input(LED_G))
    #time.sleep(3)
   
def func_r():
    print('========> LED_R : ', GPIO.input(LED_R))
    GPIO.output(LED_R, not GPIO.input(LED_R))
    #time.sleep(3)
    
def func_y():
    print('========> LED_Y : ', GPIO.input(LED_Y))
    GPIO.output(LED_Y, not GPIO.input(LED_Y))
    #time.sleep(3)
   
cnt = 0 
while 1:  
    #if(cnt > 10):
        #break
    
    func_g()
    time.sleep(3)
    func_g()
    func_y()
    time.sleep(3)
    func_y()
    func_r()
    time.sleep(3)
    func_r()
    
    #print('========> LED_W : ', GPIO.input(LED_W))
    cnt += 1
    







GPIO.cleanup()