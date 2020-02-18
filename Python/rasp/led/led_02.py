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
    #time.sleep(3)

# 윈도우 객체 
window = tk.Tk()
window.geometry('400x400')

# label 객체 생성
label = tk.Label(window, text='번튼을 눌러서 LED 점등을 하세요')

# button 객체 생성
btn = tk.Button(window, text='LED_W', command=func)

# 위젯 배치
label.pack()
btn.pack()

# 윈도우 출력
window.mainloop()


#GPIO 개방
GPIO.cleanup()