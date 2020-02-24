# coding: utf-8

#GPIO 라이브러리 임포트
import RPi.GPIO as GPIO

#time 라이브러리 임포트
import time

# 핀 번호 할당 방법은 커넥터 핀 번호로 설정
GPIO.setmode(GPIO.BCM)

# 핀 번호 할당
SRV = 12

# 출력 핀으로 설정
GPIO.setup(SRV, GPIO.OUT)

# 주파수 설정
freq = 100.0
# 각도의 최솟값 설정
deg_min = 0.0
# 각도의 최댓값 설정
deg_max = 180.0
# PWM 신호의 최소 듀티 설정
dc_min = 5.0
# PWM 신호의 최대 듀티 설정
dc_max = 22.0

# 각도를 듀티 비로 환산하는 함수 정의
def convert_dc( deg ):
    return ( (deg - deg_min) * (dc_max - dc_min) / (deg_max - deg_min) + dc_min)

# PWM 객체 인스턴스 생성
# 출력 핀: SRV, 주파수: freq
p = GPIO.PWM(SRV, freq)

# PWM 신호 출력 시작
p.start(0)

# 예외 처리
try:
   # 무한 반복
   while 1:
  
        # 듀티 비를 설정
        dc = convert_dc( float(100) )
        # PWM 신호 듀티 비를 변경해서 PWM 신호 출력
        p.ChangeDutyCycle( dc )
        # 1초 대기
        time.sleep(2)


        # 듀티 비 설정
        dc = convert_dc( float(0) )
        # PWM 신호 듀티 비를 변경해서 PWM 신호 출력
        p.ChangeDutyCycle( dc )
        # 1초 대기
        time.sleep(2)

# 키보드 예외 검출
except KeyboardInterrupt:
   # 아무것도 하지 않음
   pass

# PWM 정지
p.stop()

# GPIO 개방
GPIO.cleanup()

