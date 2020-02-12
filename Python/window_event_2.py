from tkinter import *

# event handler 
def click_mouse(event):
    
    print(event)

    txt_str = ''

    if event.num==1:
        txt_str += '마우스 왼쪽 버튼이 '
    elif event.num==3:
        txt_str += '마우스 오른쪽 버튼이 '
    
    txt_str += '('+ str(event.x) + ', ' + str(event.y) + ') 에서 클릭되었습니다.' 

    label_1.configure(text=txt_str)

# 위젯
window=Tk()
window.geometry('300x300')

label_1 = Label(window, text='이곳의 텍스트가 변경됩니다.')

window.bind('<Button>', click_mouse)

label_1.pack(expand=1, anchor=CENTER)

window.mainloop()

