from module_basic.phonebook import phonebookmanager_sqlite as pbms
import sys

# 최초 프로그램 실행하면 DB 에서 데이터를 가져와서 list에 저장을 한다.
if pbms.init==0:
    pbms.start_init()

while True:
    print('메뉴를 입력해주세요.\n (1) 데이터 입력 \n (2) 전체출력 \n (3) 검색(이름) \n (4) 삭제 \n (5) exit')
    choice = input('메뉴 번호를 입력해주세요. >>')

    if choice=='1':
        pbms.insertMember()
    elif choice=='2':
        pbms.showList()
    elif choice=='3':
        pbms.searchInfo()
    elif choice=='4':
        pbms.deleteInfo()
    elif choice=='5':
        #break
        sys.exit()
    
    else :
        print('유요한 메뉴번호가 아닙니다. 확인해주세요')