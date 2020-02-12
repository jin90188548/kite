from tkinter import *
from tkinter import messagebox

# tkinter :  GUI 관련 모듈

# 이벤트 함수 : 핸들러 함수
def myFunc():
    messagebox.showinfo('starwars', '스타워즈 시리즈를 보셨나요?')

def check_func():
    if chk.get()==0:
        messagebox.showinfo('Checkbutton', '체크상태가 아닙니다.')
    else:
        messagebox.showinfo('Checkbutton', '체크상태 입니다.')

def radio_func():
    if val.get()==1:
        label_b.configure(text='JAVA')
    elif val.get()==2:
        label_b.configure(text='Spring')
    elif val.get()==3:
        label_b.configure(text='Python')
    else :
        messagebox.showinfo('','정상적인 입력 데이터가 아닙니다.')


# window 생성
window = Tk() # 윈도우 생성 반환
# 윈도우 이름 설정 
window.title('first Window') #윈도우의 이름
window.geometry('400x600') # 윈도우의 사이즈 : '폭x높이'
#window.resizable(width=FALSE, height=FALSE) # 윈도우의 사이즈 조정 여부 설정

# 텍스트 표현을 위한 Label
# text : 화면에 표현할 텍스트
# font : 폰트 종류, 폰트 사이즈
# fg   : 폰트 컬러
# bg   : 배경색
# width : 텍스트 표현 영역 : 너비
# height : 텍스트 표현 영역 : 높이
# anchor : 영역 안의 텍스트 표현 위치
label_a = Label(
    window, 
    text='윈도우1', 
    font=('궁서체',20), 
    fg='red',
    bg='yellow',
    width=50,
    heigh=3,
    anchor=N
    )


label_c = Label(
    window, 
    text='윈도우2', 
    font=('궁서체',20), 
    fg='red',
    bg='yellow',
    width=50,
    heigh=3,
    anchor=N
    )


label_b = Label(
    window, 
    text='윈도우3', 
    font=('궁서체',20), 
    fg='red',
    bg='yellow',
    width=50,
    heigh=3,
    anchor=N
    )


# 이미지 위젯 : 이미지 표현
# photo = PhotoImage(file='phonebook2.png')
photo = PhotoImage(file='image/img3.png')
label_photo = Label(window, image=photo, width=800, height=300,  anchor=E)


# 번튼 위젯 : 버튼 표현
btn_close = Button(window, text='프로그램 종료', fg='blue', bg='yellow', command=quit)

# 이미지 버튼처리, 이벤트 핼들러 함수 이용
btn_img = Button(window, image=photo, command=myFunc)

# 체크 박스 : Checkbutton
chk = IntVar()
check_btn_a = Checkbutton(window, text='체크해주세요.', variable=chk, command=check_func)

# 레디오버튼 : Radiobutton
val = IntVar()
radio_btn_a = Radiobutton(window, text='JAVA', variable=val, value=1 , command=radio_func)
radio_btn_b = Radiobutton(window, text='Spring', variable=val, value=2 , command=radio_func)
radio_btn_c = Radiobutton(window, text='Python', variable=val, value=3 , command=radio_func)



# 윈도우에 위젯 배치
label_b.pack()
#label_c.pack()
#label_a.pack()
#label_photo.pack()

radio_btn_a.pack()
radio_btn_b.pack()
radio_btn_c.pack()

check_btn_a.pack()

btn_img.pack()
btn_close.pack()

# window 출력
window.mainloop()