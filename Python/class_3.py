from module_basic.phonebook.phonebook_class import PhoneInfo

# class 정의
class Student:
    def study(self):
        print('열심히 공부합니다.')

class Teacher:
    def teach(self):
        print('열심히 지도합니다.')


list_temp = [Student(),Student(),Student(),Teacher(),Student()]

for member in list_temp:
    if isinstance(member, Student):
        member.study()
    elif isinstance(member, Teacher):
        member.teach()
    else:
        print('나가주세요.')




# instance 생성
student = Student()


# class 타입 확인 
print(isinstance(student, Student))
print(isinstance(student, PhoneInfo))