# 부모 클래스
class Parent:
    def __init__(self, value):
        self.value=value
        print('Parent class 의 생성자가 호출되었습니다.')
    
    def test(self):
        print('Parent class 의 test() 메서드 호출')
    

# 자식 클래스
class Child(Parent):
    # 생성자
    def __init__(self, value):
        Parent.__init__(self, value)
        print('Child class의 생성자가 호출되었습니다.')

    
    def test(self):
        print('Child class 의 test() 메서드 호출')

    def __str__(self):
        return str(self.value)

    def test1(self):
        print('Child class 의 test1() 메서드 호출')
    

child = Child(10)
child.test()
print(child.value)

print(isinstance(child, Parent))
print(isinstance(child, Child))

print(child)

child.test1()
