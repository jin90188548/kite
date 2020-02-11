# class 정의 : PhoneInfo
# 속성 : name, phonenumber, birthday
# 기능 : showInfo
class PhoneInfo:
    #생성자
    def __init__(self, name, phonenumber, birthday):
        self.name=name
        self.phonenumber=phonenumber
        self.birthday=birthday
    
    # 정보 출력하는 메서드
    def showinfo(self):
        print('--- 정보출력 시작 -------------------')
        print('이름 : ', self.name, sep='\t')
        print('전화번호 : ', self.phonenumber, sep='\t')
        print('생일 : ', self.birthday, sep='\t')
        print('--- 정보출력 종료 -------------------')


