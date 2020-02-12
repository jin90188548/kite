from tkinter import *
# tkinter :  GUI 관련 모듈

# window 생성
window = Tk() # 윈도우 생성 반환
# 윈도우 이름 설정 
window.title('first Window') #윈도우의 이름
window.geometry('400x200') # 윈도우의 사이즈 : '폭x높이'
window.resizable(width=FALSE, height=FALSE)

# window 출력
window.mainloop()