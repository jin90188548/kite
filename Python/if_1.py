# 사용자에게 정수 데이터를 입력 받는다.
# 데이터를 비교 해서 양수/음수/0 으로 구분해서 출력

# 데이터 입력 받기
number = input("정수를 입력해주세요. >> ")

# 정수 데이터로 형 변환 ( 숫자 비교 연산 )
number = int(number)

# 양수
if number>0:
    print('양의 정수입니다.')

# 음수
if number<0:
    print('음의 정수입니다.')

# 0
if number==0:
    print('0 입니다.')

