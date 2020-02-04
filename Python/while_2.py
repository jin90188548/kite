import time

# 처리 횟수 카운트 변수
number = 0

# 현재 보다 5초 앞선 시간
target_time = time.time() + 5 # (60*60)

# 5초간 반복
while time.time() < target_time:
    number += 1

print("5초간 {}번 반목했습니다.".format(number))
