# 데이터 저장을위한 클래스 
# 기능 클래스 -> 기능 모듈
# 데이터를 저장하고 있는 배열(리스트) -> []
# 기능 메서드 : 입력(리스트), 삭제(리스트 삭제), 검색, 전체 출력

# 친구의 정보를 저장하는 리스트
pBooks = [] 

def insertMember():
    name = input('이름을 입력해주세요. >>')
    pNum = input('전화번호를 입력해주세요. >>')
    bDay = input('생일을 입력해주세요. >>')

    member = {
        'name': name,
        'phoneNumber' : pNum,
        'birthday' : bDay
    }
    pBooks.append(member)

def showList():
    for member in pBooks:
        print(member)