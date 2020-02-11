# circle 클래스 생성
# 속성(변수) : 반지름 -> radious , 외부에서 속성을 참조 하지 못하도록 보호
# 기능(메서드) : 원의 둘레 , 원의 넓이

import math


class Circle:
    #생성자
    def __init__(self, radious):
        self.__radious = radious

    # __radious 의 getter
    @property 
    def radious(self):
        return self.__radious

    @radious.setter
    def radious(self,value):
        self.__radious=value

    #getter : __radious
    def get_radious(self):
        return self.__radious

    #setter : __radious
    def set_radious(self, value):
        self.__radious=value

    # 둘레
    def get_circumference(self):
        return 2*math.pi*self.__radious  

    # 넓이
    def get_cirarea(self):
        return math.pi*self.__radious*self.__radious


# 인스턴스 생성
c_1 = Circle(10)

# setter 메서드를 통해서 변수에 값을 대입
c_1.set_radious(30)
c_1.radious=50



# getter 메서드를 통해서 __radious 의 값을 반환
print('반지름 : ', c_1.get_radious(), sep='\t')
print('반지름 : ', c_1.radious, sep='\t')
# 둘레
print('원의 둘레길이 : ', c_1.get_circumference(), sep='\t')
# 넓이
print('원의 넓이 : ', c_1.get_cirarea())

