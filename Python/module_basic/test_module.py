# 변수
PI = 3.14

# 함수 : 사용자의 데이터 입력 값을 반환하는 기능
def number_input():
    result =  input('숫자를 입력해주세요. >> ')
    return float(result)

# 함수 : 원의 둘레를 구하고 값을 반환하는 기능
def get_circlecumference(radious):
    return 2*PI*radious

# 함수 : 원의 면적을 구해서 반환하는 기능
def get_circle_area(radious):
    return PI*radious*radious

if __name__ == '__main__':
    print(__name__)
    print(get_circlecumference(10))
    print(get_circle_area(10))