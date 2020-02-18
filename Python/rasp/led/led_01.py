# coding: utf-8

# GPIO 모듈
import RPi.GPIO as GPIO

import tkinter as tk

import time


# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BOARD)

# 핀번호 설정 : chanel
LED_W = 11

# 11번 핀 출력 핀으로 등록, 초기 출력은 LOW = 0  False
GPIO.setup(LED_W, GPIO.OUT, initial=GPIO.LOW)

print('========> LED_W : ', GPIO.input(LED_W))

def func():
    GPIO.output(LED_W, not GPIO.input(LED_W))
    time.sleep(3)

cnt = 0 
while 1:  
    if(cnt > 10):
        break

    func()
    print('========> LED_W : ', GPIO.input(LED_W))
    cnt += 1
    







GPIO.cleanup()