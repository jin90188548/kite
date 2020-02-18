# coding: utf-8

# GPIO 모듈
import RPi.GPIO as GPIO

import tkinter as tk

import time


# 핀번호 할당으로 처리 : 핀번호 설정 
GPIO.setmode(GPIO.BOARD)

# 핀번호 설정 : chanel
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
    func_clear()   
    print('========> LED_W : ', GPIO.input(LED_G))
    GPIO.output(LED_G, not GPIO.input(LED_G))
    #time.sleep(3)
   
def func_r():
    func_clear()
    print('========> LED_R : ', GPIO.input(LED_R))
    GPIO.output(LED_R, not GPIO.input(LED_R))
    #time.sleep(3)
    
def func_y():
    func_clear()
    print('========> LED_Y : ', GPIO.input(LED_Y))
    GPIO.output(LED_Y, not GPIO.input(LED_Y))
    #time.sleep(3)

# chenel 값을 0
def func_clear():
    GPIO.output(LED_G, False)
    GPIO.output(LED_Y, 0)
    GPIO.output(LED_R, GPIO.LOW)

  


# 윈도우 객체 
window = tk.Tk()
window.geometry('400x400')

# label 객체 생성
label = tk.Label(window, text='번튼을 눌러서 LED 점등을 하세요')

# button 객체 생성
btn_g = tk.Button(window, text='초록색 버튼', command=func_g)
btn_y = tk.Button(window, text='노란색 버튼', command=func_y)
btn_r = tk.Button(window, text='빨간색 버튼', command=func_r)

# 위젯 배치
label.pack()
btn_g.pack()
btn_y.pack()
btn_r.pack()

# 윈도우 출력
window.mainloop()


#GPIO 개방
GPIO.cleanup()