from tkinter import *
from tkinter import messagebox

# event handler function
def click_left(event):
    print(event)
    messagebox.showinfo('마우스 이벤트', '마우스 왼쪽 버튼이 클릭되었습니다.')

# window 생성
window = Tk()
window.geometry('300x300')

# 이벤트 적용
window.bind('<Button-1>', click_left)

window.mainloop()